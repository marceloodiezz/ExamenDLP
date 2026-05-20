package ast.expression;

import visitor.Visitor;

public class BooleanLiteral extends AbstractExpression {

    private final boolean value;

    public BooleanLiteral(boolean value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    public int getIntValue() {
        return value ? 1 : 0;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
