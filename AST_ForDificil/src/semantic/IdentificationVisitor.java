package semantic;

import ast.definition.*;
import ast.expression.Variable;
import ast.type.ErrorType;
import ast.statement.*;
import symboltable.SymbolTable;
import visitor.AbstractVisitor;

public class IdentificationVisitor extends AbstractVisitor<Void, Void> {

    public SymbolTable st = new SymbolTable();

    // ---------------------------------------------------
    // Expresiones

    public Void visit(Variable var, Void param) {
        Definition def = st.find(var.getName());
        if (def != null)
            var.setDefinition(def);
        else {
            ErrorType e = new ErrorType("Variable: La variable '" + var.getName() + "' no ha sido declarada.", var);
            var.setDefinition(new VarDef("", e, 0, 0));
        }

        return null;
    }

    // ---------------------------------------------------
    // Definiciones

    public Void visit(FuncDef funcDef, Void param) {
        if (!st.insert(funcDef))
            new ErrorType("FunctionDefinition: La función '" + funcDef.getName() + "' ya ha sido declarada.", funcDef);
        st.set();
        super.visit(funcDef, param);
        st.reset();

        return null;
    }

    public Void visit (VarDef varDef, Void param) {
        if (varDef.hasInitialValue())
            varDef.getInitialValue().accept(this, param);

        if (!st.insert(varDef))
            new ErrorType("VariableDefinition: La variable '" + varDef.getName() + "' ya ha sido declarada.", varDef);

        super.visit(varDef, param);

        return null;
    }

    // ---------------------------------------------------
    // Sentencias

    @Override
    public Void visit(For forStmt, Void param) {
        st.set();
        super.visit(forStmt, param);
        st.reset();

        return null;
    }

    /*

    @Override
    public Void visit(While whileStmt, Void param) {
        // 1. La condición se visita en el ámbito actual, porque todavía estamos fuera del cuerpo del while.
        whileStmt.getCondition().accept(this, param);

        // 2. Abrimos un nuevo ámbito para las variables declaradas dentro del while.
        st.set();

        // 3. Visitamos las sentencias del cuerpo.
        // Las VarDef internas se insertarán en este nuevo ámbito.
        // Las Variable se buscarán primero aquí y luego hacia fuera.
        for (Statement stmt : whileStmt.getBody())
            stmt.accept(this, param);

        // 4. Cerramos el ámbito del while.
        // Las variables declaradas dentro dejan de ser visibles.
        st.reset();

        return null;
    }

    @Override
    public Void visit(IfElse ifElse, Void param) {
        // 1. La condición se visita en el ámbito actual.
        ifElse.getCondition().accept(this, param);

        // 2. Abrimos un ámbito solo para el bloque if.
        st.set();

        for (Statement stmt : ifElse.getIf_body())
            stmt.accept(this, param);

        st.reset();

        // 3. Abrimos otro ámbito distinto para el bloque else.
        st.set();

        for (Statement stmt : ifElse.getElse_body())
            stmt.accept(this, param);

        st.reset();

        return null;
    }

     */
}
