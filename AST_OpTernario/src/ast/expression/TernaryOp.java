package ast.expression;

import visitor.Visitor;

public class TernaryOp extends AbstractExpression {

    private final Expression condition;
    private final Expression exprTrue;
    private final Expression exprFalse;

    public TernaryOp(Expression condition, Expression exprTrue, Expression exprFalse, int line, int column) {
        super(line, column);
        this.condition = condition;
        this.exprTrue = exprTrue;
        this.exprFalse = exprFalse;
    }

    public Expression getCondition() {
        return this.condition;
    }

    public Expression getExprTrue() {
        return this.exprTrue;
    }

    public Expression getExprFalse() {
        return this.exprFalse;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
