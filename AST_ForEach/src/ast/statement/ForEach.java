package ast.statement;

import ast.AbstractLocatable;
import ast.expression.Expression;
import ast.expression.Variable;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class ForEach extends AbstractLocatable implements Statement {

    private final Variable variable;
    private final Expression collection;
    private final List<Statement> body;

    public ForEach(Variable variable, Expression collection, List<Statement> body, int line, int column) {
        super(line, column);
        this.variable = variable;
        this.collection = collection;
        this.body = new ArrayList<>(body);
    }

    public Variable getVariable() {
        return this.variable;
    }

    public Expression getCollection() {
        return this.collection;
    }

    public List<Statement> getBody() {
        return this.body;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
