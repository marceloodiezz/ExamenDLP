package ast.statement;

import ast.AbstractLocatable;
import ast.expression.Expression;
import visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Switch extends AbstractLocatable implements Statement {

    private final Expression condition;
    private final List<SwitchCase> cases;
    private final List<Statement> defaultBody;

    public Switch(Expression condition, List<SwitchCase> cases, List<Statement> defaultBody, int line, int column) {
        super(line, column);
        this.condition = condition;
        this.cases = new ArrayList<>(cases);
        this.defaultBody = new ArrayList<>(defaultBody);
    }

    public Expression getCondition() {
        return condition;
    }

    public List<SwitchCase> getCases() {
        return cases;
    }

    public List<Statement> getDefaultBody() {
        return defaultBody;
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}
