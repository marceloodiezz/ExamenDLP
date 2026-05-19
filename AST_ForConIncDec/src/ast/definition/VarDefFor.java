package ast.definition;

import ast.expression.Expression;
import ast.type.Type;
import visitor.Visitor;

public class VarDefFor extends VarDef {

    private final Expression initialValue;

    public VarDefFor(String name, Type type, Expression initialValue, int line, int column) {
        super(name, type, line, column);
        this.initialValue = initialValue;
    }

    public Expression getInitialValue() {
        return initialValue;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
