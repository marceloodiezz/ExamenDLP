package ast.type;

import ast.Locatable;
import visitor.Visitor;

public class BooleanType extends AbstractType {

    private static final BooleanType INSTANCE = new BooleanType();

    private BooleanType() {}

    public static BooleanType getInstance() {
        return INSTANCE;
    }

    @Override
    public Type logic(Type other, Locatable l) {
        if (other == BooleanType.getInstance())
            return BooleanType.getInstance();

        return super.logic(other, l);
    }

    @Override
    public Type logic(Locatable l) {
        return BooleanType.getInstance();
    }

    @Override
    public Type comparison(Type other, Locatable l) {
        if (other == BooleanType.getInstance())
            return BooleanType.getInstance();

        return super.comparison(other, l);
    }

    @Override
    public Type canBeCastTo(Type other, Locatable l) {
        if (other == BooleanType.getInstance())
            return BooleanType.getInstance();

        return super.canBeCastTo(other, l);
    }

    @Override
    public void mustBeLogical(Locatable l) {
        // No hace nada.
        // Boolean SÍ es lógico.
    }

    @Override
    public void mustPromotesTo(Type other, Locatable l) {
        if (other == BooleanType.getInstance())
            return;

        super.mustPromotesTo(other, l);
    }

    @Override
    public void mustBeBuiltIn(Locatable l) {
        // No hace nada.
        // Boolean es un tipo primitivo.
    }

    @Override
    public String toString() {
        return "boolean";
    }

    @Override
    public int numberOfBytes() {
        return 2;
    }

    @Override
    public char suffix() {
        return 'i';
    }

    @Override
    public <RT, PT> RT accept(Visitor<RT, PT> v, PT param) {
        return v.visit(this, param);
    }
}