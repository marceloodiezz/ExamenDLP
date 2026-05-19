package ast.definition;

import ast.expression.Expression;
import ast.statement.Statement;
import ast.type.Type;
import visitor.Visitor;

public class VarDef extends AbstractDefinition implements Statement {

    private int offset;

    // Atributo nuevo para el bucle 'for'
    // Así, la inicialización puede ser:
    //    for (let i : int = 0; ...; ...) ...
    private Expression initialValue;

    public VarDef(String name, Type type, int line, int column) {
        super(name, type, line, column);
    }

    public VarDef(int line, int column, String name, Type type) {
        super(name, type, line, column);
    }

    public VarDef(String name, Type type, Expression initialValue, int line, int column) {
        super(name, type, line, column);
        this.initialValue = initialValue;
    }

    public VarDef(int line, int column, String name, Type type, Expression initialValue) {
        super(name, type, line, column);
        this.initialValue = initialValue;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public boolean hasInitialValue() {
        return initialValue != null;
    }

    public Expression getInitialValue() {
        return this.initialValue;
    }

    public void setInitialValue(Expression initialValue) {
        this.initialValue = initialValue;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }

}
