// Generated from C:/Users/Usuario/Desktop/DLP/ExamenDLP/AST_ForDificil/src/parser/TSmm.g4 by ANTLR 4.13.2
package parser;

    import ast.*;
    import ast.definition.*;
    import ast.expression.*;
    import ast.program.*;
    import ast.statement.*;
    import ast.type.*;
    import errorhandler.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TSmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, WHITE=41, COMMENTS=42, REAL_CONSTANT=43, INT_CONSTANT=44, 
		CHAR_CONSTANT=45, ID=46;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_variableDefinition = 2, RULE_variables = 3, 
		RULE_functionDefinition = 4, RULE_params = 5, RULE_functionBody = 6, RULE_definitionMain = 7, 
		RULE_simple_type = 8, RULE_type = 9, RULE_record_field = 10, RULE_statement = 11, 
		RULE_initializationFor = 12, RULE_assignmentFor = 13, RULE_varDefFor = 14, 
		RULE_block = 15, RULE_expression = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "variableDefinition", "variables", "functionDefinition", 
			"params", "functionBody", "definitionMain", "simple_type", "type", "record_field", 
			"statement", "initializationFor", "assignmentFor", "varDefFor", "block", 
			"expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "':'", "';'", "','", "'function'", "'('", "')'", "'void'", 
			"'{'", "'}'", "'main'", "'int'", "'number'", "'char'", "'['", "']'", 
			"'log'", "'input'", "'='", "'if'", "'else'", "'while'", "'return'", "'for'", 
			"'.'", "'as'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'>'", "'>='", 
			"'<'", "'<='", "'!='", "'=='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "WHITE", "COMMENTS", "REAL_CONSTANT", "INT_CONSTANT", 
			"CHAR_CONSTANT", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TSmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TSmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public List<Definition> defs = new ArrayList<>();
		public DefinitionContext d;
		public DefinitionMainContext dM;
		public TerminalNode EOF() { return getToken(TSmmParser.EOF, 0); }
		public DefinitionMainContext definitionMain() {
			return getRuleContext(DefinitionMainContext.class,0);
		}
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(34);
					((ProgramContext)_localctx).d = definition();
					 _localctx.defs.addAll(((ProgramContext)_localctx).d.ast); 
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(42);
			((ProgramContext)_localctx).dM = definitionMain();
			 _localctx.defs.add(((ProgramContext)_localctx).dM.ast); 
			setState(44);
			match(EOF);
			 ((ProgramContext)_localctx).ast =  new Program(_localctx.defs); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public List<Definition> ast = new ArrayList<>();
		public VariableDefinitionContext vD;
		public FunctionDefinitionContext fD;
		public VariableDefinitionContext variableDefinition() {
			return getRuleContext(VariableDefinitionContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				((DefinitionContext)_localctx).vD = variableDefinition();
				 _localctx.ast.addAll(((DefinitionContext)_localctx).vD.ast); 
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				((DefinitionContext)_localctx).fD = functionDefinition();
				 _localctx.ast.add(((DefinitionContext)_localctx).fD.ast); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDefinitionContext extends ParserRuleContext {
		public List<VarDef> ast = new ArrayList<>();
		public VariablesContext vs;
		public TypeContext t;
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinition; }
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__0);
			setState(56);
			((VariableDefinitionContext)_localctx).vs = variables();
			setState(57);
			match(T__1);
			setState(58);
			((VariableDefinitionContext)_localctx).t = type();
			setState(59);
			match(T__2);

			                          for(Variable v : ((VariableDefinitionContext)_localctx).vs.ast) {
			                              VarDef varDef = new VarDef(v.getName(), ((VariableDefinitionContext)_localctx).t.ast, v.getLine(), v.getColumn());
			                              _localctx.ast.add(varDef);
			                          }
			                      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariablesContext extends ParserRuleContext {
		public List<Variable> ast = new ArrayList<>();
		public Token id1;
		public Token id2;
		public List<TerminalNode> ID() { return getTokens(TSmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TSmmParser.ID, i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			((VariablesContext)_localctx).id1 = match(ID);
			 _localctx.ast.add(new Variable(((VariablesContext)_localctx).id1.getText(),
			                                     ((VariablesContext)_localctx).id1.getLine(),
			                                     ((VariablesContext)_localctx).id1.getCharPositionInLine()+1)); 
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(64);
				match(T__3);
				setState(65);
				((VariablesContext)_localctx).id2 = match(ID);
				 _localctx.ast.add(new Variable(((VariablesContext)_localctx).id2.getText(),
				                                     ((VariablesContext)_localctx).id2.getLine(),
				                                     ((VariablesContext)_localctx).id2.getCharPositionInLine()+1)); 
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public FuncDef ast;
		public List<VarDef> prms = new ArrayList<>();
		public Type returnType;
		public Token name;
		public ParamsContext p;
		public Simple_typeContext st;
		public FunctionBodyContext b1;
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__4);
			setState(73);
			((FunctionDefinitionContext)_localctx).name = match(ID);
			setState(74);
			match(T__5);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(75);
				((FunctionDefinitionContext)_localctx).p = params();
				 ((FunctionDefinitionContext)_localctx).prms =  ((FunctionDefinitionContext)_localctx).p.ast; 
				}
			}

			setState(80);
			match(T__6);
			setState(81);
			match(T__1);
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
			case T__13:
				{
				setState(82);
				((FunctionDefinitionContext)_localctx).st = simple_type();
				 ((FunctionDefinitionContext)_localctx).returnType =  ((FunctionDefinitionContext)_localctx).st.ast; 
				}
				break;
			case T__7:
				{
				setState(85);
				match(T__7);
				 ((FunctionDefinitionContext)_localctx).returnType =  VoidType.getInstance(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(89);
			((FunctionDefinitionContext)_localctx).b1 = functionBody();

			                          FuncType fType = new FuncType(_localctx.returnType, _localctx.prms);
			                          ((FunctionDefinitionContext)_localctx).ast =  new FuncDef(((FunctionDefinitionContext)_localctx).name.getText(),
			                                             fType,
			                                             ((FunctionDefinitionContext)_localctx).b1.ast,
			                                             ((FunctionDefinitionContext)_localctx).name.getLine(),
			                                             ((FunctionDefinitionContext)_localctx).name.getCharPositionInLine()+1);
			                      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public List<VarDef> ast = new ArrayList<>();
		public Token id1;
		public Simple_typeContext st1;
		public Token id2;
		public Simple_typeContext st2;
		public List<TerminalNode> ID() { return getTokens(TSmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TSmmParser.ID, i);
		}
		public List<Simple_typeContext> simple_type() {
			return getRuleContexts(Simple_typeContext.class);
		}
		public Simple_typeContext simple_type(int i) {
			return getRuleContext(Simple_typeContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((ParamsContext)_localctx).id1 = match(ID);
			setState(93);
			match(T__1);
			setState(94);
			((ParamsContext)_localctx).st1 = simple_type();
			 _localctx.ast.add(new VarDef(((ParamsContext)_localctx).id1.getText(),
			                                ((ParamsContext)_localctx).st1.ast,
			                                ((ParamsContext)_localctx).id1.getLine(),
			                                ((ParamsContext)_localctx).id1.getCharPositionInLine()+1)); 
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(96);
				match(T__3);
				setState(97);
				((ParamsContext)_localctx).id2 = match(ID);
				setState(98);
				match(T__1);
				setState(99);
				((ParamsContext)_localctx).st2 = simple_type();
				 _localctx.ast.add(new VarDef(((ParamsContext)_localctx).id2.getText(),
				                                ((ParamsContext)_localctx).st2.ast,
				                                ((ParamsContext)_localctx).id2.getLine(),
				                                ((ParamsContext)_localctx).id2.getCharPositionInLine()+1)); 
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionBodyContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<>();
		public List<VarDef> varDefs = new ArrayList<>();
		public List<Statement> statements = new ArrayList<>();
		public VariableDefinitionContext vD;
		public StatementContext s;
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__8);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(108);
				((FunctionBodyContext)_localctx).vD = variableDefinition();
				 _localctx.varDefs.addAll(((FunctionBodyContext)_localctx).vD.ast); 
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131941828788288L) != 0)) {
				{
				{
				setState(116);
				((FunctionBodyContext)_localctx).s = statement();
				 _localctx.statements.addAll(((FunctionBodyContext)_localctx).s.ast); 
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(T__9);

			                    _localctx.ast.addAll(_localctx.varDefs);
			                    _localctx.ast.addAll(_localctx.statements);
			                
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionMainContext extends ParserRuleContext {
		public FuncDef ast;
		public Token name;
		public FunctionBodyContext b1;
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public DefinitionMainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitionMain; }
	}

	public final DefinitionMainContext definitionMain() throws RecognitionException {
		DefinitionMainContext _localctx = new DefinitionMainContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_definitionMain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__4);
			setState(128);
			((DefinitionMainContext)_localctx).name = match(T__10);
			setState(129);
			match(T__5);
			setState(130);
			match(T__6);
			setState(131);
			match(T__1);
			setState(132);
			match(T__7);
			setState(133);
			((DefinitionMainContext)_localctx).b1 = functionBody();

			                      List<VarDef> params = new ArrayList<>();
			                      Type fType = new FuncType(VoidType.getInstance(), params);
			                      ((DefinitionMainContext)_localctx).ast =  new FuncDef(((DefinitionMainContext)_localctx).name.getText(),
			                                         fType,
			                                         ((DefinitionMainContext)_localctx).b1.ast,
			                                         ((DefinitionMainContext)_localctx).name.getLine(),
			                                         ((DefinitionMainContext)_localctx).name.getCharPositionInLine()+1);
			                  
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_typeContext extends ParserRuleContext {
		public Type ast;
		public Simple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type; }
	}

	public final Simple_typeContext simple_type() throws RecognitionException {
		Simple_typeContext _localctx = new Simple_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simple_type);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(T__11);
				 ((Simple_typeContext)_localctx).ast =  IntType.getInstance(); 
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				match(T__12);
				 ((Simple_typeContext)_localctx).ast =  NumberType.getInstance(); 
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(T__13);
				 ((Simple_typeContext)_localctx).ast =  CharType.getInstance(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public List<RecordField> recordFields = new ArrayList<>();
		public Simple_typeContext st;
		public Token INT_CONSTANT;
		public TypeContext t;
		public Record_fieldContext rFs;
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(TSmmParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<Record_fieldContext> record_field() {
			return getRuleContexts(Record_fieldContext.class);
		}
		public Record_fieldContext record_field(int i) {
			return getRuleContext(Record_fieldContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_type);
		int _la;
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				((TypeContext)_localctx).st = simple_type();
				 ((TypeContext)_localctx).ast =  ((TypeContext)_localctx).st.ast; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(T__14);
				setState(148);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(149);
				match(T__15);
				setState(150);
				((TypeContext)_localctx).t = type();
				 ((TypeContext)_localctx).ast =  new ArrayType(LexerHelper.lexemeToInt(((TypeContext)_localctx).INT_CONSTANT.getText()),
				                               ((TypeContext)_localctx).t.ast); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(T__14);
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(154);
					((TypeContext)_localctx).rFs = record_field();

					                for (RecordField field : ((TypeContext)_localctx).rFs.ast) {
					                    boolean duplicado = false;

					                    for (RecordField existingField : _localctx.recordFields) {
					                        if (existingField.getName().equals(field.getName())) {
					                            duplicado = true;
					                            break;
					                        }
					                    }

					                    if(duplicado) {
					                        ErrorType e = new ErrorType("RecordField: El campo '" + field.getName() + "' ya ha sido declarado.", field);
					                    }
					                    else {
					                        _localctx.recordFields.add(field);
					                    }
					                }
					            
					}
					}
					setState(159); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__0 );
				setState(161);
				match(T__15);
				 ((TypeContext)_localctx).ast =  new RecordType(_localctx.recordFields); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Record_fieldContext extends ParserRuleContext {
		public List<RecordField> ast = new ArrayList<>();
		public VariablesContext vs;
		public TypeContext t;
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Record_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record_field; }
	}

	public final Record_fieldContext record_field() throws RecognitionException {
		Record_fieldContext _localctx = new Record_fieldContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_record_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__0);
			setState(167);
			((Record_fieldContext)_localctx).vs = variables();
			setState(168);
			match(T__1);
			setState(169);
			((Record_fieldContext)_localctx).t = type();
			setState(170);
			match(T__2);

			                    for(Variable v : ((Record_fieldContext)_localctx).vs.ast) {
			                        RecordField rF = new RecordField(v.getName(), ((Record_fieldContext)_localctx).t.ast, v.getLine(), v.getColumn());
			                        _localctx.ast.add(rF);
			                    }
			                
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<>();
		public List<Expression> args = new ArrayList<>();
		public List<Statement> elseBlock = new ArrayList<>();
		public ExpressionContext e1;
		public ExpressionContext e2;
		public Token ID;
		public BlockContext b1;
		public BlockContext b2;
		public InitializationForContext init;
		public ExpressionContext cond;
		public AssignmentForContext inc;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public InitializationForContext initializationFor() {
			return getRuleContext(InitializationForContext.class,0);
		}
		public AssignmentForContext assignmentFor() {
			return getRuleContext(AssignmentForContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		int _la;
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				match(T__16);
				setState(174);
				((StatementContext)_localctx).e1 = expression(0);
				 _localctx.ast.add(new Log(((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn())); 
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(176);
					match(T__3);
					setState(177);
					((StatementContext)_localctx).e2 = expression(0);
					 _localctx.ast.add(new Log(((StatementContext)_localctx).e2.ast, ((StatementContext)_localctx).e2.ast.getLine(), ((StatementContext)_localctx).e2.ast.getColumn())); 
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(185);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(T__17);
				setState(188);
				((StatementContext)_localctx).e1 = expression(0);
				 _localctx.ast.add(new Input(((StatementContext)_localctx).e1.ast, ((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn())); 
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(190);
					match(T__3);
					setState(191);
					((StatementContext)_localctx).e2 = expression(0);
					 _localctx.ast.add(new Input(((StatementContext)_localctx).e2.ast, ((StatementContext)_localctx).e2.ast.getLine(), ((StatementContext)_localctx).e2.ast.getColumn())); 
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(199);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(201);
				((StatementContext)_localctx).ID = match(ID);
				setState(202);
				match(T__5);
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131941797986368L) != 0)) {
					{
					setState(203);
					((StatementContext)_localctx).e1 = expression(0);
					 _localctx.args.add(((StatementContext)_localctx).e1.ast); 
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(205);
						match(T__3);
						setState(206);
						((StatementContext)_localctx).e2 = expression(0);
						 _localctx.args.add(((StatementContext)_localctx).e2.ast); 
						}
						}
						setState(213);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(216);
				match(T__6);
				setState(217);
				match(T__2);

				                 Variable var = new Variable(((StatementContext)_localctx).ID.getText(), ((StatementContext)_localctx).ID.getLine(), ((StatementContext)_localctx).ID.getCharPositionInLine()+1);
				                 _localctx.ast.add(new FuncCall(_localctx.args,
				                                       var,
				                                       ((StatementContext)_localctx).ID.getLine(),
				                                       ((StatementContext)_localctx).ID.getCharPositionInLine()+1));
				             
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				((StatementContext)_localctx).e1 = expression(0);
				setState(220);
				match(T__18);
				setState(221);
				((StatementContext)_localctx).e2 = expression(0);
				setState(222);
				match(T__2);
				 _localctx.ast.add(new Assignment(((StatementContext)_localctx).e1.ast,
				                                       ((StatementContext)_localctx).e2.ast,
				                                       ((StatementContext)_localctx).e1.ast.getLine(),
				                                       ((StatementContext)_localctx).e1.ast.getColumn())); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(225);
				match(T__19);
				setState(226);
				match(T__5);
				setState(227);
				((StatementContext)_localctx).e1 = expression(0);
				setState(228);
				match(T__6);
				setState(229);
				((StatementContext)_localctx).b1 = block();
				setState(234);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(230);
					match(T__20);
					setState(231);
					((StatementContext)_localctx).b2 = block();
					 ((StatementContext)_localctx).elseBlock =  ((StatementContext)_localctx).b2.ast; 
					}
					break;
				}
				 _localctx.ast.add(new IfElse(((StatementContext)_localctx).e1.ast,
				                                   ((StatementContext)_localctx).b1.ast,
				                                   _localctx.elseBlock,
				                                   ((StatementContext)_localctx).e1.ast.getLine(),
				                                   ((StatementContext)_localctx).e1.ast.getColumn())); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(238);
				match(T__21);
				setState(239);
				match(T__5);
				setState(240);
				((StatementContext)_localctx).e1 = expression(0);
				setState(241);
				match(T__6);
				setState(242);
				((StatementContext)_localctx).b1 = block();
				 _localctx.ast.add(new While(((StatementContext)_localctx).e1.ast,
				                                  ((StatementContext)_localctx).b1.ast,
				                                  ((StatementContext)_localctx).e1.ast.getLine(),
				                                  ((StatementContext)_localctx).e1.ast.getColumn())); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(245);
				match(T__22);
				setState(246);
				((StatementContext)_localctx).e1 = expression(0);
				setState(247);
				match(T__2);
				 _localctx.ast.add(new Return(((StatementContext)_localctx).e1.ast,
				                                   ((StatementContext)_localctx).e1.ast.getLine(),
				                                   ((StatementContext)_localctx).e1.ast.getColumn())); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(250);
				match(T__23);
				setState(251);
				match(T__5);
				setState(252);
				((StatementContext)_localctx).init = initializationFor();
				setState(253);
				match(T__2);
				setState(254);
				((StatementContext)_localctx).cond = expression(0);
				setState(255);
				match(T__2);
				setState(256);
				((StatementContext)_localctx).inc = assignmentFor();
				setState(257);
				match(T__6);
				setState(258);
				((StatementContext)_localctx).b1 = block();
				 _localctx.ast.add(new For(((StatementContext)_localctx).init.ast,
				                                ((StatementContext)_localctx).cond.ast,
				                                ((StatementContext)_localctx).inc.ast,
				                                ((StatementContext)_localctx).b1.ast,
				                                ((StatementContext)_localctx).init.ast.getLine(),
				                                ((StatementContext)_localctx).init.ast.getColumn())); 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitializationForContext extends ParserRuleContext {
		public Statement ast;
		public AssignmentForContext a;
		public VarDefForContext v;
		public AssignmentForContext assignmentFor() {
			return getRuleContext(AssignmentForContext.class,0);
		}
		public VarDefForContext varDefFor() {
			return getRuleContext(VarDefForContext.class,0);
		}
		public InitializationForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializationFor; }
	}

	public final InitializationForContext initializationFor() throws RecognitionException {
		InitializationForContext _localctx = new InitializationForContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_initializationFor);
		try {
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__26:
			case T__27:
			case REAL_CONSTANT:
			case INT_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				((InitializationForContext)_localctx).a = assignmentFor();
				 ((InitializationForContext)_localctx).ast =  ((InitializationForContext)_localctx).a.ast; 
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				((InitializationForContext)_localctx).v = varDefFor();
				 ((InitializationForContext)_localctx).ast =  ((InitializationForContext)_localctx).v.ast; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentForContext extends ParserRuleContext {
		public Statement ast;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignmentForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentFor; }
	}

	public final AssignmentForContext assignmentFor() throws RecognitionException {
		AssignmentForContext _localctx = new AssignmentForContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignmentFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			((AssignmentForContext)_localctx).e1 = expression(0);
			setState(272);
			match(T__18);
			setState(273);
			((AssignmentForContext)_localctx).e2 = expression(0);
			 ((AssignmentForContext)_localctx).ast =  new Assignment(((AssignmentForContext)_localctx).e1.ast,
			                                         ((AssignmentForContext)_localctx).e2.ast,
			                                         ((AssignmentForContext)_localctx).e1.ast.getLine(),
			                                         ((AssignmentForContext)_localctx).e1.ast.getColumn()); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDefForContext extends ParserRuleContext {
		public Statement ast;
		public Token ID;
		public TypeContext t1;
		public ExpressionContext e1;
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDefForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDefFor; }
	}

	public final VarDefForContext varDefFor() throws RecognitionException {
		VarDefForContext _localctx = new VarDefForContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varDefFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(T__0);
			setState(277);
			((VarDefForContext)_localctx).ID = match(ID);
			setState(278);
			match(T__1);
			setState(279);
			((VarDefForContext)_localctx).t1 = type();
			setState(280);
			match(T__18);
			setState(281);
			((VarDefForContext)_localctx).e1 = expression(0);
			 ((VarDefForContext)_localctx).ast =  new VarDef(((VarDefForContext)_localctx).ID.getText(),
			                                 ((VarDefForContext)_localctx).t1.ast,
			                                 ((VarDefForContext)_localctx).e1.ast,
			                                 ((VarDefForContext)_localctx).ID.getLine(),
			                                 ((VarDefForContext)_localctx).ID.getCharPositionInLine()+1); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<>();
		public StatementContext s1;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_block);
		int _la;
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__16:
			case T__17:
			case T__19:
			case T__21:
			case T__22:
			case T__23:
			case T__26:
			case T__27:
			case REAL_CONSTANT:
			case INT_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				((BlockContext)_localctx).s1 = statement();
				 _localctx.ast.addAll(((BlockContext)_localctx).s1.ast); 
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(287);
				match(T__8);
				setState(291); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(288);
					((BlockContext)_localctx).s1 = statement();
					 _localctx.ast.addAll(((BlockContext)_localctx).s1.ast); 
					}
					}
					setState(293); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 131941828788288L) != 0) );
				setState(295);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public List<Expression> args = new ArrayList<>();
		public ExpressionContext e1;
		public Token ID;
		public ExpressionContext e2;
		public Simple_typeContext t1;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token OP;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(TSmmParser.ID, 0); }
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public TerminalNode INT_CONSTANT() { return getToken(TSmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(TSmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(TSmmParser.CHAR_CONSTANT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(300);
				match(T__5);
				setState(301);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(302);
				match(T__6);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).e1.ast; 
				}
				break;
			case 2:
				{
				setState(305);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(306);
				match(T__5);
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 131941797986368L) != 0)) {
					{
					setState(307);
					((ExpressionContext)_localctx).e1 = expression(0);
					 _localctx.args.add(((ExpressionContext)_localctx).e1.ast); 
					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(309);
						match(T__3);
						setState(310);
						((ExpressionContext)_localctx).e2 = expression(0);
						 _localctx.args.add(((ExpressionContext)_localctx).e2.ast); 
						}
						}
						setState(317);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(320);
				match(T__6);

				                  Variable var = new Variable(((ExpressionContext)_localctx).ID.getText(), ((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1);
				                  ((ExpressionContext)_localctx).ast =  new FuncCall(_localctx.args,
				                                      var,
				                                      ((ExpressionContext)_localctx).ID.getLine(),
				                                      ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1);
				              
				}
				break;
			case 3:
				{
				setState(322);
				match(T__5);
				setState(323);
				((ExpressionContext)_localctx).e1 = expression(0);
				setState(324);
				match(T__25);
				setState(325);
				((ExpressionContext)_localctx).t1 = simple_type();
				setState(326);
				match(T__6);
				 ((ExpressionContext)_localctx).ast =  new Cast(((ExpressionContext)_localctx).t1.ast,
				                                ((ExpressionContext)_localctx).e1.ast,
				                                ((ExpressionContext)_localctx).e1.ast.getLine(),
				                                ((ExpressionContext)_localctx).e1.ast.getColumn()); 
				}
				break;
			case 4:
				{
				setState(329);
				match(T__26);
				setState(330);
				((ExpressionContext)_localctx).e1 = expression(10);
				 ((ExpressionContext)_localctx).ast =  new UnaryMinus(((ExpressionContext)_localctx).e1.ast,
				                                      ((ExpressionContext)_localctx).e1.ast.getLine(),
				                                      ((ExpressionContext)_localctx).e1.ast.getColumn()); 
				}
				break;
			case 5:
				{
				setState(333);
				match(T__27);
				setState(334);
				((ExpressionContext)_localctx).e1 = expression(9);
				 ((ExpressionContext)_localctx).ast =  new UnaryNot(((ExpressionContext)_localctx).e1.ast,
				                                    ((ExpressionContext)_localctx).e1.ast.getLine(),
				                                    ((ExpressionContext)_localctx).e1.ast.getColumn()); 
				}
				break;
			case 6:
				{
				setState(337);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral(LexerHelper.lexemeToInt(((ExpressionContext)_localctx).INT_CONSTANT.getText()),
				                                      ((ExpressionContext)_localctx).INT_CONSTANT.getLine(),
				                                      ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1); 
				}
				break;
			case 7:
				{
				setState(339);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new NumberLiteral(LexerHelper.lexemeToReal(((ExpressionContext)_localctx).REAL_CONSTANT.getText()),
				                                         ((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),
				                                         ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1); 
				}
				break;
			case 8:
				{
				setState(341);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharLiteral(LexerHelper.lexemeToChar(((ExpressionContext)_localctx).CHAR_CONSTANT.getText()),
				                                       ((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),
				                                       ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1); 
				}
				break;
			case 9:
				{
				setState(343);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable(((ExpressionContext)_localctx).ID.getText(),
				                                    ((ExpressionContext)_localctx).ID.getLine(),
				                                    ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(379);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(377);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(347);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(348);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(349);
						((ExpressionContext)_localctx).e2 = expression(9);
						 ((ExpressionContext)_localctx).ast =  new ArithmeticOp(((ExpressionContext)_localctx).OP.getText(),
						                                                  ((ExpressionContext)_localctx).e1.ast,
						                                                  ((ExpressionContext)_localctx).e2.ast,
						                                                  ((ExpressionContext)_localctx).e1.ast.getLine(),
						                                                  ((ExpressionContext)_localctx).e1.ast.getColumn()); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(352);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(353);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__31) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(354);
						((ExpressionContext)_localctx).e2 = expression(8);
						 ((ExpressionContext)_localctx).ast =  new ArithmeticOp(((ExpressionContext)_localctx).OP.getText(),
						                                                  ((ExpressionContext)_localctx).e1.ast,
						                                                  ((ExpressionContext)_localctx).e2.ast,
						                                                  ((ExpressionContext)_localctx).e1.ast.getLine(),
						                                                  ((ExpressionContext)_localctx).e1.ast.getColumn()); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(357);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(358);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 541165879296L) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(359);
						((ExpressionContext)_localctx).e2 = expression(7);
						 ((ExpressionContext)_localctx).ast =  new ComparisonOp(((ExpressionContext)_localctx).OP.getText(),
						                                                  ((ExpressionContext)_localctx).e1.ast,
						                                                  ((ExpressionContext)_localctx).e2.ast,
						                                                  ((ExpressionContext)_localctx).e1.ast.getLine(),
						                                                  ((ExpressionContext)_localctx).e1.ast.getColumn()); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(362);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(363);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__38 || _la==T__39) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(364);
						((ExpressionContext)_localctx).e2 = expression(6);
						 ((ExpressionContext)_localctx).ast =  new LogicOp(((ExpressionContext)_localctx).OP.getText(),
						                                             ((ExpressionContext)_localctx).e1.ast,
						                                             ((ExpressionContext)_localctx).e2.ast,
						                                             ((ExpressionContext)_localctx).e1.ast.getLine(),
						                                             ((ExpressionContext)_localctx).e1.ast.getColumn()); 
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(367);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(368);
						match(T__14);
						setState(369);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(370);
						match(T__15);
						 ((ExpressionContext)_localctx).ast =  new ArrayAccess(((ExpressionContext)_localctx).e1.ast,
						                                                 ((ExpressionContext)_localctx).e2.ast,
						                                                 ((ExpressionContext)_localctx).e1.ast.getLine(),
						                                                 ((ExpressionContext)_localctx).e1.ast.getColumn()); 
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(373);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(374);
						match(T__24);
						setState(375);
						((ExpressionContext)_localctx).ID = match(ID);
						 ((ExpressionContext)_localctx).ast =  new FieldAccess(((ExpressionContext)_localctx).ID.getText(),
						                                                 ((ExpressionContext)_localctx).e1.ast,
						                                                 ((ExpressionContext)_localctx).e1.ast.getLine(),
						                                                 ((ExpressionContext)_localctx).e1.ast.getColumn()); 
						}
						break;
					}
					} 
				}
				setState(381);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u017f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"&\b\u0000\n\u0000\f\u0000)\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u00016\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003D\b\u0003"+
		"\n\u0003\f\u0003G\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004O\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"X\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005g\b\u0005\n\u0005\f\u0005j\t\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006p\b\u0006"+
		"\n\u0006\f\u0006s\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"x\b\u0006\n\u0006\f\u0006{\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u008f\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u009e"+
		"\b\t\u000b\t\f\t\u009f\u0001\t\u0001\t\u0001\t\u0003\t\u00a5\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00b5\b\u000b\n\u000b\f\u000b\u00b8\t\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00c3\b\u000b\n\u000b\f\u000b\u00c6\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00d2\b\u000b\n\u000b"+
		"\f\u000b\u00d5\t\u000b\u0003\u000b\u00d7\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00eb\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u0106\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0003\f\u010e\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u0124\b\u000f\u000b\u000f"+
		"\f\u000f\u0125\u0001\u000f\u0001\u000f\u0003\u000f\u012a\b\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u013a\b\u0010\n\u0010\f\u0010\u013d\t\u0010"+
		"\u0003\u0010\u013f\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u015a\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u017a\b\u0010\n\u0010\f\u0010\u017d\t\u0010\u0001\u0010\u0000\u0001 "+
		"\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \u0000\u0004\u0001\u0000\u001d\u001f\u0002\u0000\u001b"+
		"\u001b  \u0001\u0000!&\u0001\u0000\'(\u0199\u0000\'\u0001\u0000\u0000"+
		"\u0000\u00025\u0001\u0000\u0000\u0000\u00047\u0001\u0000\u0000\u0000\u0006"+
		">\u0001\u0000\u0000\u0000\bH\u0001\u0000\u0000\u0000\n\\\u0001\u0000\u0000"+
		"\u0000\fk\u0001\u0000\u0000\u0000\u000e\u007f\u0001\u0000\u0000\u0000"+
		"\u0010\u008e\u0001\u0000\u0000\u0000\u0012\u00a4\u0001\u0000\u0000\u0000"+
		"\u0014\u00a6\u0001\u0000\u0000\u0000\u0016\u0105\u0001\u0000\u0000\u0000"+
		"\u0018\u010d\u0001\u0000\u0000\u0000\u001a\u010f\u0001\u0000\u0000\u0000"+
		"\u001c\u0114\u0001\u0000\u0000\u0000\u001e\u0129\u0001\u0000\u0000\u0000"+
		" \u0159\u0001\u0000\u0000\u0000\"#\u0003\u0002\u0001\u0000#$\u0006\u0000"+
		"\uffff\uffff\u0000$&\u0001\u0000\u0000\u0000%\"\u0001\u0000\u0000\u0000"+
		"&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000"+
		"\u0000(*\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000*+\u0003\u000e"+
		"\u0007\u0000+,\u0006\u0000\uffff\uffff\u0000,-\u0005\u0000\u0000\u0001"+
		"-.\u0006\u0000\uffff\uffff\u0000.\u0001\u0001\u0000\u0000\u0000/0\u0003"+
		"\u0004\u0002\u000001\u0006\u0001\uffff\uffff\u000016\u0001\u0000\u0000"+
		"\u000023\u0003\b\u0004\u000034\u0006\u0001\uffff\uffff\u000046\u0001\u0000"+
		"\u0000\u00005/\u0001\u0000\u0000\u000052\u0001\u0000\u0000\u00006\u0003"+
		"\u0001\u0000\u0000\u000078\u0005\u0001\u0000\u000089\u0003\u0006\u0003"+
		"\u00009:\u0005\u0002\u0000\u0000:;\u0003\u0012\t\u0000;<\u0005\u0003\u0000"+
		"\u0000<=\u0006\u0002\uffff\uffff\u0000=\u0005\u0001\u0000\u0000\u0000"+
		">?\u0005.\u0000\u0000?E\u0006\u0003\uffff\uffff\u0000@A\u0005\u0004\u0000"+
		"\u0000AB\u0005.\u0000\u0000BD\u0006\u0003\uffff\uffff\u0000C@\u0001\u0000"+
		"\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001"+
		"\u0000\u0000\u0000F\u0007\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000HI\u0005\u0005\u0000\u0000IJ\u0005.\u0000\u0000JN\u0005\u0006\u0000"+
		"\u0000KL\u0003\n\u0005\u0000LM\u0006\u0004\uffff\uffff\u0000MO\u0001\u0000"+
		"\u0000\u0000NK\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000PQ\u0005\u0007\u0000\u0000QW\u0005\u0002\u0000\u0000"+
		"RS\u0003\u0010\b\u0000ST\u0006\u0004\uffff\uffff\u0000TX\u0001\u0000\u0000"+
		"\u0000UV\u0005\b\u0000\u0000VX\u0006\u0004\uffff\uffff\u0000WR\u0001\u0000"+
		"\u0000\u0000WU\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0003"+
		"\f\u0006\u0000Z[\u0006\u0004\uffff\uffff\u0000[\t\u0001\u0000\u0000\u0000"+
		"\\]\u0005.\u0000\u0000]^\u0005\u0002\u0000\u0000^_\u0003\u0010\b\u0000"+
		"_h\u0006\u0005\uffff\uffff\u0000`a\u0005\u0004\u0000\u0000ab\u0005.\u0000"+
		"\u0000bc\u0005\u0002\u0000\u0000cd\u0003\u0010\b\u0000de\u0006\u0005\uffff"+
		"\uffff\u0000eg\u0001\u0000\u0000\u0000f`\u0001\u0000\u0000\u0000gj\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"i\u000b\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000kq\u0005\t\u0000"+
		"\u0000lm\u0003\u0004\u0002\u0000mn\u0006\u0006\uffff\uffff\u0000np\u0001"+
		"\u0000\u0000\u0000ol\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000"+
		"qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000ry\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000tu\u0003\u0016\u000b\u0000uv\u0006\u0006"+
		"\uffff\uffff\u0000vx\u0001\u0000\u0000\u0000wt\u0001\u0000\u0000\u0000"+
		"x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0005\n\u0000"+
		"\u0000}~\u0006\u0006\uffff\uffff\u0000~\r\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0005\u0005\u0000\u0000\u0080\u0081\u0005\u000b\u0000\u0000\u0081"+
		"\u0082\u0005\u0006\u0000\u0000\u0082\u0083\u0005\u0007\u0000\u0000\u0083"+
		"\u0084\u0005\u0002\u0000\u0000\u0084\u0085\u0005\b\u0000\u0000\u0085\u0086"+
		"\u0003\f\u0006\u0000\u0086\u0087\u0006\u0007\uffff\uffff\u0000\u0087\u000f"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0005\f\u0000\u0000\u0089\u008f\u0006"+
		"\b\uffff\uffff\u0000\u008a\u008b\u0005\r\u0000\u0000\u008b\u008f\u0006"+
		"\b\uffff\uffff\u0000\u008c\u008d\u0005\u000e\u0000\u0000\u008d\u008f\u0006"+
		"\b\uffff\uffff\u0000\u008e\u0088\u0001\u0000\u0000\u0000\u008e\u008a\u0001"+
		"\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0011\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0003\u0010\b\u0000\u0091\u0092\u0006\t"+
		"\uffff\uffff\u0000\u0092\u00a5\u0001\u0000\u0000\u0000\u0093\u0094\u0005"+
		"\u000f\u0000\u0000\u0094\u0095\u0005,\u0000\u0000\u0095\u0096\u0005\u0010"+
		"\u0000\u0000\u0096\u0097\u0003\u0012\t\u0000\u0097\u0098\u0006\t\uffff"+
		"\uffff\u0000\u0098\u00a5\u0001\u0000\u0000\u0000\u0099\u009d\u0005\u000f"+
		"\u0000\u0000\u009a\u009b\u0003\u0014\n\u0000\u009b\u009c\u0006\t\uffff"+
		"\uffff\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009a\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0005\u0010\u0000\u0000\u00a2\u00a3\u0006\t\uffff"+
		"\uffff\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u0090\u0001\u0000"+
		"\u0000\u0000\u00a4\u0093\u0001\u0000\u0000\u0000\u00a4\u0099\u0001\u0000"+
		"\u0000\u0000\u00a5\u0013\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0001"+
		"\u0000\u0000\u00a7\u00a8\u0003\u0006\u0003\u0000\u00a8\u00a9\u0005\u0002"+
		"\u0000\u0000\u00a9\u00aa\u0003\u0012\t\u0000\u00aa\u00ab\u0005\u0003\u0000"+
		"\u0000\u00ab\u00ac\u0006\n\uffff\uffff\u0000\u00ac\u0015\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0005\u0011\u0000\u0000\u00ae\u00af\u0003 \u0010\u0000"+
		"\u00af\u00b6\u0006\u000b\uffff\uffff\u0000\u00b0\u00b1\u0005\u0004\u0000"+
		"\u0000\u00b1\u00b2\u0003 \u0010\u0000\u00b2\u00b3\u0006\u000b\uffff\uffff"+
		"\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b9\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u0003\u0000"+
		"\u0000\u00ba\u0106\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u0012\u0000"+
		"\u0000\u00bc\u00bd\u0003 \u0010\u0000\u00bd\u00c4\u0006\u000b\uffff\uffff"+
		"\u0000\u00be\u00bf\u0005\u0004\u0000\u0000\u00bf\u00c0\u0003 \u0010\u0000"+
		"\u00c0\u00c1\u0006\u000b\uffff\uffff\u0000\u00c1\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c2\u00be\u0001\u0000\u0000\u0000\u00c3\u00c6\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0005\u0003\u0000\u0000\u00c8\u0106\u0001\u0000\u0000"+
		"\u0000\u00c9\u00ca\u0005.\u0000\u0000\u00ca\u00d6\u0005\u0006\u0000\u0000"+
		"\u00cb\u00cc\u0003 \u0010\u0000\u00cc\u00d3\u0006\u000b\uffff\uffff\u0000"+
		"\u00cd\u00ce\u0005\u0004\u0000\u0000\u00ce\u00cf\u0003 \u0010\u0000\u00cf"+
		"\u00d0\u0006\u000b\uffff\uffff\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d1\u00cd\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d7\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d6\u00cb\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u0007\u0000\u0000"+
		"\u00d9\u00da\u0005\u0003\u0000\u0000\u00da\u0106\u0006\u000b\uffff\uffff"+
		"\u0000\u00db\u00dc\u0003 \u0010\u0000\u00dc\u00dd\u0005\u0013\u0000\u0000"+
		"\u00dd\u00de\u0003 \u0010\u0000\u00de\u00df\u0005\u0003\u0000\u0000\u00df"+
		"\u00e0\u0006\u000b\uffff\uffff\u0000\u00e0\u0106\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0005\u0014\u0000\u0000\u00e2\u00e3\u0005\u0006\u0000\u0000"+
		"\u00e3\u00e4\u0003 \u0010\u0000\u00e4\u00e5\u0005\u0007\u0000\u0000\u00e5"+
		"\u00ea\u0003\u001e\u000f\u0000\u00e6\u00e7\u0005\u0015\u0000\u0000\u00e7"+
		"\u00e8\u0003\u001e\u000f\u0000\u00e8\u00e9\u0006\u000b\uffff\uffff\u0000"+
		"\u00e9\u00eb\u0001\u0000\u0000\u0000\u00ea\u00e6\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ed\u0006\u000b\uffff\uffff\u0000\u00ed\u0106\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ef\u0005\u0016\u0000\u0000\u00ef\u00f0\u0005\u0006\u0000"+
		"\u0000\u00f0\u00f1\u0003 \u0010\u0000\u00f1\u00f2\u0005\u0007\u0000\u0000"+
		"\u00f2\u00f3\u0003\u001e\u000f\u0000\u00f3\u00f4\u0006\u000b\uffff\uffff"+
		"\u0000\u00f4\u0106\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005\u0017\u0000"+
		"\u0000\u00f6\u00f7\u0003 \u0010\u0000\u00f7\u00f8\u0005\u0003\u0000\u0000"+
		"\u00f8\u00f9\u0006\u000b\uffff\uffff\u0000\u00f9\u0106\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0005\u0018\u0000\u0000\u00fb\u00fc\u0005\u0006\u0000"+
		"\u0000\u00fc\u00fd\u0003\u0018\f\u0000\u00fd\u00fe\u0005\u0003\u0000\u0000"+
		"\u00fe\u00ff\u0003 \u0010\u0000\u00ff\u0100\u0005\u0003\u0000\u0000\u0100"+
		"\u0101\u0003\u001a\r\u0000\u0101\u0102\u0005\u0007\u0000\u0000\u0102\u0103"+
		"\u0003\u001e\u000f\u0000\u0103\u0104\u0006\u000b\uffff\uffff\u0000\u0104"+
		"\u0106\u0001\u0000\u0000\u0000\u0105\u00ad\u0001\u0000\u0000\u0000\u0105"+
		"\u00bb\u0001\u0000\u0000\u0000\u0105\u00c9\u0001\u0000\u0000\u0000\u0105"+
		"\u00db\u0001\u0000\u0000\u0000\u0105\u00e1\u0001\u0000\u0000\u0000\u0105"+
		"\u00ee\u0001\u0000\u0000\u0000\u0105\u00f5\u0001\u0000\u0000\u0000\u0105"+
		"\u00fa\u0001\u0000\u0000\u0000\u0106\u0017\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0003\u001a\r\u0000\u0108\u0109\u0006\f\uffff\uffff\u0000\u0109"+
		"\u010e\u0001\u0000\u0000\u0000\u010a\u010b\u0003\u001c\u000e\u0000\u010b"+
		"\u010c\u0006\f\uffff\uffff\u0000\u010c\u010e\u0001\u0000\u0000\u0000\u010d"+
		"\u0107\u0001\u0000\u0000\u0000\u010d\u010a\u0001\u0000\u0000\u0000\u010e"+
		"\u0019\u0001\u0000\u0000\u0000\u010f\u0110\u0003 \u0010\u0000\u0110\u0111"+
		"\u0005\u0013\u0000\u0000\u0111\u0112\u0003 \u0010\u0000\u0112\u0113\u0006"+
		"\r\uffff\uffff\u0000\u0113\u001b\u0001\u0000\u0000\u0000\u0114\u0115\u0005"+
		"\u0001\u0000\u0000\u0115\u0116\u0005.\u0000\u0000\u0116\u0117\u0005\u0002"+
		"\u0000\u0000\u0117\u0118\u0003\u0012\t\u0000\u0118\u0119\u0005\u0013\u0000"+
		"\u0000\u0119\u011a\u0003 \u0010\u0000\u011a\u011b\u0006\u000e\uffff\uffff"+
		"\u0000\u011b\u001d\u0001\u0000\u0000\u0000\u011c\u011d\u0003\u0016\u000b"+
		"\u0000\u011d\u011e\u0006\u000f\uffff\uffff\u0000\u011e\u012a\u0001\u0000"+
		"\u0000\u0000\u011f\u0123\u0005\t\u0000\u0000\u0120\u0121\u0003\u0016\u000b"+
		"\u0000\u0121\u0122\u0006\u000f\uffff\uffff\u0000\u0122\u0124\u0001\u0000"+
		"\u0000\u0000\u0123\u0120\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000"+
		"\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000"+
		"\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0128\u0005\n\u0000"+
		"\u0000\u0128\u012a\u0001\u0000\u0000\u0000\u0129\u011c\u0001\u0000\u0000"+
		"\u0000\u0129\u011f\u0001\u0000\u0000\u0000\u012a\u001f\u0001\u0000\u0000"+
		"\u0000\u012b\u012c\u0006\u0010\uffff\uffff\u0000\u012c\u012d\u0005\u0006"+
		"\u0000\u0000\u012d\u012e\u0003 \u0010\u0000\u012e\u012f\u0005\u0007\u0000"+
		"\u0000\u012f\u0130\u0006\u0010\uffff\uffff\u0000\u0130\u015a\u0001\u0000"+
		"\u0000\u0000\u0131\u0132\u0005.\u0000\u0000\u0132\u013e\u0005\u0006\u0000"+
		"\u0000\u0133\u0134\u0003 \u0010\u0000\u0134\u013b\u0006\u0010\uffff\uffff"+
		"\u0000\u0135\u0136\u0005\u0004\u0000\u0000\u0136\u0137\u0003 \u0010\u0000"+
		"\u0137\u0138\u0006\u0010\uffff\uffff\u0000\u0138\u013a\u0001\u0000\u0000"+
		"\u0000\u0139\u0135\u0001\u0000\u0000\u0000\u013a\u013d\u0001\u0000\u0000"+
		"\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000"+
		"\u0000\u013c\u013f\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000"+
		"\u0000\u013e\u0133\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000"+
		"\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u0141\u0005\u0007\u0000"+
		"\u0000\u0141\u015a\u0006\u0010\uffff\uffff\u0000\u0142\u0143\u0005\u0006"+
		"\u0000\u0000\u0143\u0144\u0003 \u0010\u0000\u0144\u0145\u0005\u001a\u0000"+
		"\u0000\u0145\u0146\u0003\u0010\b\u0000\u0146\u0147\u0005\u0007\u0000\u0000"+
		"\u0147\u0148\u0006\u0010\uffff\uffff\u0000\u0148\u015a\u0001\u0000\u0000"+
		"\u0000\u0149\u014a\u0005\u001b\u0000\u0000\u014a\u014b\u0003 \u0010\n"+
		"\u014b\u014c\u0006\u0010\uffff\uffff\u0000\u014c\u015a\u0001\u0000\u0000"+
		"\u0000\u014d\u014e\u0005\u001c\u0000\u0000\u014e\u014f\u0003 \u0010\t"+
		"\u014f\u0150\u0006\u0010\uffff\uffff\u0000\u0150\u015a\u0001\u0000\u0000"+
		"\u0000\u0151\u0152\u0005,\u0000\u0000\u0152\u015a\u0006\u0010\uffff\uffff"+
		"\u0000\u0153\u0154\u0005+\u0000\u0000\u0154\u015a\u0006\u0010\uffff\uffff"+
		"\u0000\u0155\u0156\u0005-\u0000\u0000\u0156\u015a\u0006\u0010\uffff\uffff"+
		"\u0000\u0157\u0158\u0005.\u0000\u0000\u0158\u015a\u0006\u0010\uffff\uffff"+
		"\u0000\u0159\u012b\u0001\u0000\u0000\u0000\u0159\u0131\u0001\u0000\u0000"+
		"\u0000\u0159\u0142\u0001\u0000\u0000\u0000\u0159\u0149\u0001\u0000\u0000"+
		"\u0000\u0159\u014d\u0001\u0000\u0000\u0000\u0159\u0151\u0001\u0000\u0000"+
		"\u0000\u0159\u0153\u0001\u0000\u0000\u0000\u0159\u0155\u0001\u0000\u0000"+
		"\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u015a\u017b\u0001\u0000\u0000"+
		"\u0000\u015b\u015c\n\b\u0000\u0000\u015c\u015d\u0007\u0000\u0000\u0000"+
		"\u015d\u015e\u0003 \u0010\t\u015e\u015f\u0006\u0010\uffff\uffff\u0000"+
		"\u015f\u017a\u0001\u0000\u0000\u0000\u0160\u0161\n\u0007\u0000\u0000\u0161"+
		"\u0162\u0007\u0001\u0000\u0000\u0162\u0163\u0003 \u0010\b\u0163\u0164"+
		"\u0006\u0010\uffff\uffff\u0000\u0164\u017a\u0001\u0000\u0000\u0000\u0165"+
		"\u0166\n\u0006\u0000\u0000\u0166\u0167\u0007\u0002\u0000\u0000\u0167\u0168"+
		"\u0003 \u0010\u0007\u0168\u0169\u0006\u0010\uffff\uffff\u0000\u0169\u017a"+
		"\u0001\u0000\u0000\u0000\u016a\u016b\n\u0005\u0000\u0000\u016b\u016c\u0007"+
		"\u0003\u0000\u0000\u016c\u016d\u0003 \u0010\u0006\u016d\u016e\u0006\u0010"+
		"\uffff\uffff\u0000\u016e\u017a\u0001\u0000\u0000\u0000\u016f\u0170\n\r"+
		"\u0000\u0000\u0170\u0171\u0005\u000f\u0000\u0000\u0171\u0172\u0003 \u0010"+
		"\u0000\u0172\u0173\u0005\u0010\u0000\u0000\u0173\u0174\u0006\u0010\uffff"+
		"\uffff\u0000\u0174\u017a\u0001\u0000\u0000\u0000\u0175\u0176\n\f\u0000"+
		"\u0000\u0176\u0177\u0005\u0019\u0000\u0000\u0177\u0178\u0005.\u0000\u0000"+
		"\u0178\u017a\u0006\u0010\uffff\uffff\u0000\u0179\u015b\u0001\u0000\u0000"+
		"\u0000\u0179\u0160\u0001\u0000\u0000\u0000\u0179\u0165\u0001\u0000\u0000"+
		"\u0000\u0179\u016a\u0001\u0000\u0000\u0000\u0179\u016f\u0001\u0000\u0000"+
		"\u0000\u0179\u0175\u0001\u0000\u0000\u0000\u017a\u017d\u0001\u0000\u0000"+
		"\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000"+
		"\u0000\u017c!\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000"+
		"\u0019\'5ENWhqy\u008e\u009f\u00a4\u00b6\u00c4\u00d3\u00d6\u00ea\u0105"+
		"\u010d\u0125\u0129\u013b\u013e\u0159\u0179\u017b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}