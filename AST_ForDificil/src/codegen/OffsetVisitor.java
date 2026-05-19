package codegen;

import ast.definition.FuncDef;
import ast.definition.VarDef;
import ast.statement.For;
import ast.statement.Statement;
import ast.type.FuncType;
import ast.type.RecordField;
import ast.type.RecordType;
import visitor.AbstractVisitor;

import java.util.List;

public class OffsetVisitor extends AbstractVisitor<Void, Boolean> {

    private int bytesGlobalSum = 0;
    private int bytesLocalSum = 0;

    @Override
    public Void visit(FuncDef fd, Boolean param) {
        // Reiniciar el acumulador de variables locales para cada función
        bytesLocalSum = 0;

        // Primero visitar el tipo de la función, que incluye:
        // - tipo de retorno
        // - parámetros formales
        fd.getType().accept(this, null);

        // Después recorrer el cuerpo como contexto local
        // Cualquier VarDef que aparezca como Statement dentro del cuerpo recibirá offset local
        for (Statement stmt : fd.getBody())
            stmt.accept(this, true);

        // Guardar cuantos bytes de variables locales necesita la función
        // Esto se usará luego para la generaión de código en el <enter>
        fd.setBytesLocalSum(bytesLocalSum);

        return null;
    }

    @Override
    public Void visit(VarDef vd, Boolean isLocal) {
        // Primero visitar su tipo por si contiene records anidados
        vd.getType().accept(this, null);

        if (isLocal == null || !isLocal) {
            // Variable global
            if (vd.getScope() == 0) {
                vd.setOffset(bytesGlobalSum);
                bytesGlobalSum += vd.getType().numberOfBytes();
            }
        }
        else {
            // Variable local
            // Pueden ser:
            //   - Variable local normal de la función
            //   - Variable declarada en el init del for
            //   - Variable declarada dentro del cuerpo del for
            bytesLocalSum += vd.getType().numberOfBytes();
            vd.setOffset(-bytesLocalSum);
        }

        return null;
    }

    @Override
    public Void visit(FuncType ft, Boolean param) {
        // Visitar el tipo de retorno por si fuera complejo
        ft.getReturnType().accept(this, null);

        // Los parámetros van con offsets positivos respecto a BP y se calculan de derecha a izquierda.
        int paramOffset = 4;
        List<VarDef> params = ft.getParams();

        for (int i = params.size() - 1; i >= 0; i--) {
            VarDef vd = params.get(i);

            // Visitar el tipo por si el parámetro contiene records anidados
            vd.getType().accept(this, null);

            vd.setOffset(paramOffset);
            paramOffset += vd.getType().numberOfBytes();
        }

        return null;
    }

    @Override
    public Void visit(RecordType rt, Boolean param) {
        int bytesSum = 0;
        for (RecordField rf : rt.getFields()) {
            rf.setOffset(bytesSum);
            bytesSum += rf.getTargetType().numberOfBytes();

            // Para soportar records anidados dentro de campos
            rf.getTargetType().accept(this, null);
        }

        return null;
    }

    @Override
    public Void visit(For f, Boolean isLocal) {
        // Las inicializaciones del for pueden ser:
        // 1. Assignment
        //    for (i=0; i<5; i=i+1)
        // 2. VarDef con valor inicial
        //    for (let i:int = 0; i<5; i=i+1)

        // Si la inicialización es VarDef, hay que asignarle offset local
        f.getInitialization().accept(this, true);

        // El cuerpo puede tener más VarDef como sentencias
        // Siguen siendo variables locales de la función, y se visitan con isLocal=true
        for(Statement stmt : f.getBody())
            stmt.accept(this, true);

        return null;
    }

}
