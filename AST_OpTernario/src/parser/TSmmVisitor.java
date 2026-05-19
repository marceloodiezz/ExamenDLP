// Generated from C:/Users/Usuario/Desktop/DLP/ExamenDLP/AST/src/parser/TSmm.g4 by ANTLR 4.13.2
package parser;

    import ast.*;
    import ast.definition.*;
    import ast.expression.*;
    import ast.program.*;
    import ast.statement.*;
    import ast.type.*;
    import errorhandler.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TSmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TSmmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TSmmParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TSmmParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(TSmmParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#variableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinition(TSmmParser.VariableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(TSmmParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(TSmmParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(TSmmParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(TSmmParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#definitionMain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitionMain(TSmmParser.DefinitionMainContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#simple_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_type(TSmmParser.Simple_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(TSmmParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#record_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecord_field(TSmmParser.Record_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(TSmmParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(TSmmParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSmmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TSmmParser.ExpressionContext ctx);
}