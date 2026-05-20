package ast.statement;

import ast.AbstractLocatable;
import ast.expression.Expression;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class SwitchCase extends AbstractLocatable {

    private final Expression value;
    private final List<Statement> body;

    public SwitchCase(Expression value, List<Statement> body, int line, int column) {
        super(line, column);
        this.value = value;
        this.body = new ArrayList<>(body);
    }

    public Expression getValue() {
        return this.value;
    }

    public List<Statement> getBody() {
        return this.body;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
