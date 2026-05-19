package ast.statement;

import ast.AbstractLocatable;
import ast.expression.Expression;
import visitor.Visitor;

public class CompoundAssignment extends AbstractLocatable implements Statement{

    private final Expression left;
    private final String operator;
    private final Expression right;

    public CompoundAssignment(Expression left, String operator, Expression right, int line, int column) {
        super(line, column);
        this.right = right;
        this.operator = operator;
        this.left = left;
    }

    public Expression getLeft() {
        return this.left;
    }

    public Expression getRight() {
        return this.right;
    }

    public String getOperator() {
        return this.operator;
    }

    public boolean isAddition() {
        return this.operator.equals("+=");
    }

    public boolean isSubtraction() {
        return this.operator.equals("-=");
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
