package codegen;

import ast.definition.*;
import ast.expression.*;
import ast.program.Program;
import ast.statement.*;
import ast.type.*;

import java.util.ArrayList;
import java.util.List;

public class ExecuteCGVisitor extends AbstractCGVisitor<Void, FuncDef> {

    private final AddressCGVisitor addressCGVisitor;
    private final ValueCGVisitor valueCGVisitor;

    public ExecuteCGVisitor(CodeGenerator codeGenerator) {
        super(codeGenerator);

        this.addressCGVisitor = new AddressCGVisitor(codeGenerator);
        this.valueCGVisitor = new ValueCGVisitor(codeGenerator);
        this.addressCGVisitor.setValueCGVisitor(valueCGVisitor);
        this.valueCGVisitor.setAddressCGVisitor(addressCGVisitor);
    }

    /**
     * execute[[ Return: stmt -> expr ]](FuncDef f) =
     *     value[[expr]]()
     *     cg.convertTo(expr.type, f.type.returnType)
     *     <ret> f.type.returnType.numberOfBytes, f.bytesLocalSum, f.type.params.map(p -> p.type.numberOfBytes).sum()
     */
    @Override
    public Void visit(Return r, FuncDef param) {
        r.getValue().accept(valueCGVisitor, null);
        getCodeGenerator().convertTo(r.getValue().getType(), ((FuncType) param.getType()).getReturnType());
        getCodeGenerator().ret(((FuncType) param.getType()).getReturnType().numberOfBytes(),
                param.getBytesLocalSum(),
                ((FuncType) param.getType()).getParams().stream().mapToInt(p -> p.getType().numberOfBytes()).sum());
        return null;
    }

    /**
     * execute[[ Input: stmt -> expr ]]() =
     *     <#line> expr.line
     *     <' * Read>
     *     address[[expr]]()
     *     <in> expr.type.suffix()
     *     <store> expr.type.suffix()
     */
    @Override
    public Void visit(Input i, FuncDef param){
        getCodeGenerator().commentLine(i.getLine());
        getCodeGenerator().comment("Read");
        i.getTarget().accept(addressCGVisitor, null);
        getCodeGenerator().in(i.getTarget().getType());
        getCodeGenerator().store(i.getTarget().getType());
        return null;
    }

    /**
     * execute [[ Log: stmt -> expr ]]() =
     *     <#line> expr.line
     *     <' * Write>
     *     value[[expr]]()
     *     <out> expr.type.suffix()
     */
    @Override
    public Void visit(Log l, FuncDef param){
        getCodeGenerator().commentLine(l.getExpr().getLine());
        getCodeGenerator().comment("Write");
        l.getExpr().accept(valueCGVisitor, null);
        getCodeGenerator().out(l.getExpr().getType());
        return null;
    }

    /**
     * execute[[ Assignment: stmt -> expr1 expr2 ]]() =
     *     address[[expr1]]()
     *     value[[expr2]]()
     *     cg.convertTo(expr2.type, expr1.type)
     *     <store> expr1.type.suffix()
     */
    @Override
    public Void visit(Assignment a, FuncDef param){
        getCodeGenerator().commentLine(a.getLine());
        getCodeGenerator().comment("Assignment");

        a.getLeft().accept(addressCGVisitor, null);
        a.getRight().accept(valueCGVisitor, null);
        getCodeGenerator().convertTo(a.getRight().getType(), a.getLeft().getType());
        getCodeGenerator().store(a.getLeft().getType());
        return null;
    }

    /**
     * execute[[ While: stmt1 -> expr stmt2* ]]() =
     *     String cond = cg.getLabel()
     *     String end = cg.getLabel()
     *     cond <:>
     *     value[[expr]]()
     *     cg.convertTo(expr.type, IntType)
     *     <jz> end
     *     stmt2*.forEach(s -> execute[[s]]())
     *     <jmp> cond
     *     end <:>
     */
    @Override
    public Void visit(While w, FuncDef param) {
        String cond = getCodeGenerator().getLabel();
        String end = getCodeGenerator().getLabel();
        getCodeGenerator().commentLine(w.getLine());
        getCodeGenerator().comment("While");
        getCodeGenerator().label(cond);
        w.getCondition().accept(valueCGVisitor, null);
        getCodeGenerator().convertTo(w.getCondition().getType(), IntType.getInstance());
        getCodeGenerator().jz(end);
        getCodeGenerator().comment("While body");
        for (Statement st : w.getBody())
            st.accept(this, param);
        getCodeGenerator().jmp(cond);
        getCodeGenerator().label(end);

        return null;
    }

    /**
     * execute[[ IfElse: stmt1 -> expr stmt2* stmt3* ]]() =
     *     String else = cg.getLabel()
     *     String end = cg.getLabel()
     *     value[[expr]]()
     *     cg.convertTo(expr.type, IntType)
     *     <jz> else
     *     stmt2*.forEach(s -> execute[[s]]())
     *     <jump> end
     *     else <:>
     *     stmt3*.forEach(s -> execute[[s]]())
     *     end <:>
     */
    @Override
    public Void visit(IfElse ie, FuncDef param) {
        String elseLabel = getCodeGenerator().getLabel();
        String endLabel = getCodeGenerator().getLabel();
        getCodeGenerator().commentLine(ie.getLine());
        getCodeGenerator().comment("If");
        ie.getCondition().accept(valueCGVisitor, null);
        getCodeGenerator().convertTo(ie.getCondition().getType(), IntType.getInstance());
        getCodeGenerator().jz(elseLabel);
        getCodeGenerator().comment("if body");
        for (Statement st : ie.getIf_body())
            st.accept(this, param);
        getCodeGenerator().jmp(endLabel);
        getCodeGenerator().label(elseLabel);
        getCodeGenerator().comment("else body");
        for (Statement st : ie.getElse_body())
            st.accept(this, param);
        getCodeGenerator().label(endLabel);

        return null;
    }

    /**
     * execute[[ ForEach: stmt1 -> expr1 expr2 stmt2* ]]() =
     *     ArrayType arrayType = (ArrayType) expr2.type
     *     Type elementType = expr2.type.foreach(stmt1)
     *     for(i=0; i<expr2.type.size; i++) {
     *         address[[expr1]]()
     *         address[[expr2]]()
     *         <pushi> i
     *         <pushi> elementType.numberOfBytes()
     *         <muli>
     *         <addi>
     *         <load> elementType.suffix()
     *         cg.convertTo(elementType, expr1.type)
     *         <store> expr1.type.suffix()
     *         stmt2*.forEach(s -> execute[[s]]())
     *     }
     */
    @Override
    public Void visit(ForEach fe, FuncDef param) {
        ArrayType arrayType = (ArrayType) fe.getCollection().getType();
        Type elementType = fe.getCollection().getType().foreach(fe);

        getCodeGenerator().commentLine(fe.getLine());
        getCodeGenerator().comment("ForEach");

        // Recorrer todas las posiciones del array
        for (int i=0; i<arrayType.getSize(); i++) {
            getCodeGenerator().comment("ForEach iteration " + i);

            // Dirección de la variable iteradora
            // Es donde se almacenará el elemento actual del array
            fe.getVariable().accept(addressCGVisitor, null);

            // Dirección base de la colección del array
            fe.getCollection().accept(addressCGVisitor, null);

            // Apilar el indice actual
            getCodeGenerator().pushi(i);

            // Apilar el tamaño en bytes de cada elemento del array
            getCodeGenerator().pushi(elementType.numberOfBytes());

            // Calcular i * tamañoElemento
            getCodeGenerator().mul(IntType.getInstance());

            // Calcular direcciónBaseArray + desplazamiento
            // Ahora queda en la pila la dirección de array[i]
            getCodeGenerator().add(IntType.getInstance());

            // Cargar el valor de array[i]
            getCodeGenerator().load(elementType);

            // Convertir el valor del elemento al tipo de la variable iteradora
            getCodeGenerator().convertTo(elementType, fe.getVariable().getType());

            // Guardar el valor actual del array en la variable iteradora
            getCodeGenerator().store(fe.getVariable().getType());

            // Ejecutar el cuerpo del foreach
            for (Statement s : fe.getBody())
                s.accept(this, param);
        }

        return null;
    }

    /**
     * execute[[ FuncCall: stmt -> expr1 expr2* ]]() =
     *     value[[(Expression) stmt]]()
     *     if (expr1.type.returnType != VoidType)
     *         <pop> expr1.type.returnType.suffix()
     */
    @Override
    public Void visit(FuncCall f, FuncDef param) {
        f.accept(valueCGVisitor, null);
        if (((FuncType)(f.getVariable().getType())).getReturnType() != VoidType.getInstance())
            getCodeGenerator().pop(((FuncType)(f.getVariable().getType())).getReturnType());

        return null;
    }

    /**
     * execute[[ FuncDef: definition -> ID type stmt* ]]() =
     *     ID <:>
     *     <' * Parametros: >
     *     for (VarDef vd : type.getParams())
     *         execute[[vd]]()
     *     <' * Variables Locales: >
     *     for (Statement stmt : stmt*)
     *         if (stmt instanceof VarDef)
     *             execute[[stmt]]()
     *     <enter> definition.bytesLocalSum
     *     for (Statement stmt : stmt*)
     *         if (!(stmt instanceof VarDef))
     *             execute[[stmt]](definition)
     *     if (type.returnType == VoidType)
     *         <ret> 0, definition.bytesLocalSum, type.params.map(p -> p.type.numberOfBytes).sum()
     */
    @Override
    public Void visit(FuncDef f, FuncDef param){
        getCodeGenerator().commentLine(f.getLine());
        getCodeGenerator().printFunction(f.getName());

        getCodeGenerator().comment("Parameters:");
        for (VarDef def: ((FuncType) f.getType()).getParams())
            def.accept(this, null);

        getCodeGenerator().comment("Local Variables:");
        for (Statement st: f.getBody())
            if (st instanceof VarDef)
                st.accept(this, null);

        getCodeGenerator().enter(f.getBytesLocalSum());

        for (Statement st: f.getBody())
            if (!(st instanceof VarDef))
                st.accept(this, f);

        // Esto es solo para las funciones de tipo Void
        if (((FuncType) f.getType()).getReturnType() == VoidType.getInstance())
            getCodeGenerator().ret(0,
                                    f.getBytesLocalSum(),
                                    ((FuncType) f.getType()).getParams().stream().mapToInt(p -> p.getType().numberOfBytes()).sum());
        return null;
    }

    /**
     * execute [[ VarDef: definition -> ID type ]]() =
     *     <' *> type.toString() ID <(offset> definition.offset() <)>
     */
    @Override
    public Void visit(VarDef v, FuncDef param){
        getCodeGenerator().comment(v.getType() + " " + v.getName() + " (offset " + v.getOffset() + ")");
        return null;
    }

    /**
     * execute[[ Program: program -> def* ]]() =
     *     for(Definition d : def*)
     *         if (d instanceof VarDef)
     *             execute[[d]]()
     *     cg.mainInvocation() // <call main> y <halt>
     *     for(Definition d : def*)
     *         if (d instanceof FuncDef)
     *             execute[[d]]()
     */
    @Override
    public Void visit(Program p, FuncDef param) {
        for (Definition def: p.getDefinitions())
            if (def instanceof VarDef)
                def.accept(this, null);

        getCodeGenerator().mainInvocation();

        for (Definition def: p.getDefinitions())
            if (def instanceof FuncDef)
                def.accept(this, null);

        return null;
    }

}
