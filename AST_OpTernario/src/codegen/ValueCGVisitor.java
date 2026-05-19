package codegen;

import ast.definition.*;
import ast.expression.*;
import ast.statement.*;
import ast.type.*;

public class ValueCGVisitor extends AbstractCGVisitor<Void,Void> {

    private AddressCGVisitor addressCGVisitor;

    public ValueCGVisitor(CodeGenerator codeGenerator) {
        super(codeGenerator);
    }

    public void setAddressCGVisitor(AddressCGVisitor addressCGVisitor) {
        this.addressCGVisitor = addressCGVisitor;
    }

    /**
     * value[[ IntLiteral: expr -> INT_CONST ]]() =
     *     <pushi> expr.value
     */
    @Override
    public Void visit(IntLiteral i, Void param){
        getCodeGenerator().pushi(i.getValue());
        return null;
    }

    /**
     * value[[ CharLiteral: expr -> CHAR_CONST ]]() =
     *     <pushb> expr.value
     */
    @Override
    public Void visit(CharLiteral c, Void param){
        getCodeGenerator().pushb(c.getValue());
        return null;
    }

    /**
     * value[[ NumberLiteral: expr -> REAL_CONST ]]() =
     *     <pushf> expr.value
     */
    @Override
    public Void visit(NumberLiteral r, Void param){
        getCodeGenerator().pushf(r.getValue());
        return null;
    }

    /**
     * value[[ Variable: expr -> ID ]]() =
     *     address[[expr]]()
     *     <load> expr.type.suffix()
     */
    @Override
    public Void visit(Variable v, Void param){
        v.accept(addressCGVisitor, null);
        getCodeGenerator().load(v.getType());
        return null;
    }

    /**
     * value[[UnaryNot: expr1 -> expr2]]()=
     *     value[[expr2]]()
     *     cg.convertTo(expr2.type, IntType)
     *     <not>
     */
    @Override
    public Void visit(UnaryNot u, Void param){
        u.getOperand().accept(this, null);
        getCodeGenerator().convertTo(u.getOperand().getType(), IntType.getInstance());
        getCodeGenerator().not();
        return null;
    }

    /**
     * value[[UnaryMinus: expr1 -> expr2]]()=
     *     value[[expr2]]()
     *     cg.convertTo(expr2.type, expr1.type)
     *     <pushi> -1
     *     cg.convertTo(IntType, expr1.type)
     *     <mul> expr1.type.suffix()
     */
    @Override
    public Void visit(UnaryMinus u, Void param){
        u.getOperand().accept(this, null);
        getCodeGenerator().convertTo(u.getOperand().getType(), u.getType());
        getCodeGenerator().pushi(-1);
        getCodeGenerator().convertTo(IntType.getInstance(), u.getType());
        getCodeGenerator().mul(u.getType());
        return null;
    }

    /**
     * value[[ Cast: expr1 -> expr2 type ]]() =
     *     value[[expr2]]()
     *     cg.convertTo(expr2.type, type)
     */
    @Override
    public Void visit(Cast c, Void param){
        c.getExpr().accept(this, param);
        getCodeGenerator().convertTo(c.getExpr().getType(), c.getType());
        return null;
    }

    /**
     * value[[ ArrayAccess: expr1 -> expr2 expr3 ]]() =
     *     address[[expr1]]()
     *     <load> expr1.type.suffix()
     */
    @Override
    public Void visit(ArrayAccess a, Void param){
        a.accept(addressCGVisitor, null);
        getCodeGenerator().load(a.getType());
        return null;
    }

    /**
     * value[[ FieldAccess: expr1 -> expr2 ID ]]() =
     *     address[[expr1]]()
     *     <load> expr1.type.suffix()
     */
    @Override
    public Void visit(FieldAccess f, Void param){
        f.accept(addressCGVisitor, null);
        getCodeGenerator().load(f.getType());
        return null;
    }

    /**
     * value[[ ArithmeticOp: expr1 -> expr2 OP expr3 ]]() =
     *     value[[expr2]]()
     *     cg.convertTo(expr2.type, expr1.type)
     *     value[[expr3]]()
     *     cg.convertTo(expr3.type, expr1.type)
     *     cg.arithmetic(expr1.operator, expr1.type)
     */
    @Override
    public Void visit(ArithmeticOp a, Void param){
        a.getLeft().accept(this, param);
        getCodeGenerator().convertTo(a.getLeft().getType(), a.getType());
        a.getRight().accept(this, param);
        getCodeGenerator().convertTo(a.getRight().getType(), a.getType());
        getCodeGenerator().arithmetic(a.getOperator(), a.getType());
        return null;
    }

    /**
     * value[[ LogicOp: expr1 -> expr2 OP expr3 ]]() =
     *     value[[expr2]]()
     *     cg.convertTo(expr2.type, IntType)
     *     value[[expr3]]()
     *     cg.convertTo(expr3.type, IntType)
     *     cg.logic(expr1.operator, expr1.type)
     */
    @Override
    public Void visit(LogicOp l, Void param){
        l.getLeft().accept(this, null);
        getCodeGenerator().convertTo(l.getLeft().getType(), IntType.getInstance());
        l.getRight().accept(this, null);
        getCodeGenerator().convertTo(l.getRight().getType(), IntType.getInstance());
        getCodeGenerator().logic(l.getOperator(), IntType.getInstance());
        return null;
    }

    /**
     * value[[ ComparisonOp: expr1 -> expr2 OP expr3 ]]() =
     *     T = cg.comparisonType(expr2.type, expr3.type)
     *     value[[expr2]]()
     *     cg.convertTo(expr2.type, T)
     *     value[[expr3]]()
     *     cg.convertTo(expr3.type, T)
     *     cg.comparison(expr1.operator, T)
     */
    @Override
    public Void visit(ComparisonOp c, Void param){
        Type comparisonType = getCodeGenerator().comparisonType(c.getLeft().getType(), c.getRight().getType());
        c.getLeft().accept(this, null);
        getCodeGenerator().convertTo(c.getLeft().getType(), comparisonType);
        c.getRight().accept(this, null);
        getCodeGenerator().convertTo(c.getRight().getType(), comparisonType);
        getCodeGenerator().comparison(c.getOperator(), comparisonType);
        return null;
    }

    /**
     * value[[ FuncCall: expr1 -> expr2 expr3* ]]() =
     *     for (int i = 0; i < expr3*.size(); i++) {
     *         value[[expr3*.get(i)]]()
     *         cg.convertTo(expr3*.get(i).type, expr2.type.params.get(i).type)
     *     }
     *     <call> (expr2.name)
     */
    @Override
    public Void visit(FuncCall f, Void param){
        for (int i = 0; i < f.getArgs().size(); i++) {
            f.getArgs().get(i).accept(this, null);
            getCodeGenerator().convertTo(f.getArgs().get(i).getType(), ((FuncType)(f.getVariable().getType())).getParams().get(i).getType());
        }
        getCodeGenerator().call(f.getVariable().getName());
        return null;
    }

    /**
     * value[[ TernaryOp: expr1 -> expr2 expr3 expr4 ]]() =
     *     String else = cg.getLabel()
     *     String end = cg.getLabel()
     *     value[[expr2]]()
     *     cg.convertTo(expr2.type, IntType)
     *     <jz> else
     *     value[[expr3]]()
     *     cg.convertTo(expr3.type, expr1.type)
     *     <jmp> end
     *     else <:>
     *     value[[expr4]]()
     *     cg.convertTo(expr4.type, expr1.type)
     *     end <:>
     */
    @Override
    public Void visit(TernaryOp t, Void param) {
        String elseLabel = getCodeGenerator().getLabel();
        String endLabel = getCodeGenerator().getLabel();

        getCodeGenerator().commentLine(t.getLine());
        getCodeGenerator().comment("Ternary Operator");

        t.getCondition().accept(this, null);
        getCodeGenerator().convertTo(t.getCondition().getType(), IntType.getInstance());

        getCodeGenerator().jz(elseLabel);

        getCodeGenerator().comment("True Expression");
        t.getExprTrue().accept(this, null);
        getCodeGenerator().convertTo(t.getExprTrue().getType(), t.getType());
        getCodeGenerator().jmp(endLabel);

        getCodeGenerator().comment("False Expression");
        getCodeGenerator().label(elseLabel);
        t.getExprFalse().accept(this, null);
        getCodeGenerator().convertTo(t.getExprFalse().getType(), t.getType());

        getCodeGenerator().label(endLabel);

        return null;
    }

}
