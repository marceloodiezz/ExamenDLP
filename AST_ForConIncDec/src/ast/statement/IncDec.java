package ast.statement;

import ast.AbstractLocatable;
import ast.expression.Expression;
import visitor.Visitor;

public class IncDec extends AbstractLocatable implements Statement {

    private final Expression target;
    private final String operator;

    public IncDec(Expression target, String operator, int line, int column) {
        super(line, column);
        this.target = target;
        this.operator = operator;
    }

    public Expression getTarget() {
        return this.target;
    }

    public String getOperator() {
        return this.operator;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
