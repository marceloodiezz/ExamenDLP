// Generated from C:/Users/Usuario/Desktop/DLP/ExamenDLP/AST/src/parser/TSmm.g4 by ANTLR 4.13.2
package parser;

    import ast.*;
    import ast.definition.*;
    import ast.expression.*;
    import ast.program.*;
    import ast.statement.*;
    import ast.type.*;
    import errorhandler.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TSmmParser}.
 */
public interface TSmmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TSmmParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TSmmParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TSmmParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(TSmmParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(TSmmParser.DefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinition(TSmmParser.VariableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinition(TSmmParser.VariableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(TSmmParser.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(TSmmParser.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(TSmmParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(TSmmParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(TSmmParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(TSmmParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(TSmmParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(TSmmParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#definitionMain}.
	 * @param ctx the parse tree
	 */
	void enterDefinitionMain(TSmmParser.DefinitionMainContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#definitionMain}.
	 * @param ctx the parse tree
	 */
	void exitDefinitionMain(TSmmParser.DefinitionMainContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#simple_type}.
	 * @param ctx the parse tree
	 */
	void enterSimple_type(TSmmParser.Simple_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#simple_type}.
	 * @param ctx the parse tree
	 */
	void exitSimple_type(TSmmParser.Simple_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TSmmParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TSmmParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#record_field}.
	 * @param ctx the parse tree
	 */
	void enterRecord_field(TSmmParser.Record_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#record_field}.
	 * @param ctx the parse tree
	 */
	void exitRecord_field(TSmmParser.Record_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(TSmmParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(TSmmParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TSmmParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TSmmParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSmmParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TSmmParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSmmParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TSmmParser.ExpressionContext ctx);
}