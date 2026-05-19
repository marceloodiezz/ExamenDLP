package ast.statement;

import ast.AbstractLocatable;
import ast.expression.Expression;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class For extends AbstractLocatable implements Statement {

    private final Statement initialization;
    private final Expression condition;
    private final Statement increment;
    private final List<Statement> body;

    public For(Statement initialization, Expression condition, Statement increment, List<Statement> body, int line, int column) {
        super(line, column);
        this.initialization = initialization;
        this.condition = condition;
        this.increment = increment;
        this.body = new ArrayList<>(body);
    }

    public Statement getInitialization() {
        return this.initialization;
    }

    public Expression getCondition() {
        return this.condition;
    }

    public Statement getIncrement() {
        return this.increment;
    }

    public List<Statement> getBody() {
        return this.body;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
