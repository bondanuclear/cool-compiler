package gen;// Generated from X:/JavaProjects/cool-compiler/src/main/resources\Grammar.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, ELSE=2, FI=3, TRUE=4, FALSE=5, IF=6, IN=7, INHERITS=8, LET=9, 
		LOOP=10, POOL=11, THEN=12, WHILE=13, CASE=14, ESAC=15, OF=16, NEW=17, 
		ISVOID=18, NOT=19, ADD=20, SUB=21, DIV=22, MUL=23, LEFTPAREN=24, RIGHTPAREN=25, 
		LEFTCURLY=26, RIGHTCURLY=27, EQUAL=28, LT=29, LE=30, ASSIGN=31, DARROW=32, 
		COLON=33, SEMICOLON=34, AT=35, COMMA=36, DOT=37, TL=38, WHITESPACE=39, 
		LINECOMMENT=40, NUM=41, OBJECTID=42, TYPEID=43, ERROR=44;
	public static final int
		RULE_program = 0, RULE_class_def = 1, RULE_insides = 2, RULE_parameter = 3, 
		RULE_expr = 4, RULE_branch = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "class_def", "insides", "parameter", "expr", "branch"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "'+'", "'-'", "'/'", 
			"'*'", "'('", "')'", "'{'", "'}'", "'='", "'<'", "'<='", "'<-'", "'=>'", 
			"':'", "';'", "'@'", "','", "'.'", "'~'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "ELSE", "FI", "TRUE", "FALSE", "IF", "IN", "INHERITS", 
			"LET", "LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "OF", "NEW", 
			"ISVOID", "NOT", "ADD", "SUB", "DIV", "MUL", "LEFTPAREN", "RIGHTPAREN", 
			"LEFTCURLY", "RIGHTCURLY", "EQUAL", "LT", "LE", "ASSIGN", "DARROW", "COLON", 
			"SEMICOLON", "AT", "COMMA", "DOT", "TL", "WHITESPACE", "LINECOMMENT", 
			"NUM", "OBJECTID", "TYPEID", "ERROR"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<Class_defContext> class_def() {
			return getRuleContexts(Class_defContext.class);
		}
		public Class_defContext class_def(int i) {
			return getRuleContext(Class_defContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				class_def();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CLASS );
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

	public static class Class_defContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(GrammarParser.CLASS, 0); }
		public List<TerminalNode> TYPEID() { return getTokens(GrammarParser.TYPEID); }
		public TerminalNode TYPEID(int i) {
			return getToken(GrammarParser.TYPEID, i);
		}
		public TerminalNode LEFTCURLY() { return getToken(GrammarParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(GrammarParser.RIGHTCURLY, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public TerminalNode INHERITS() { return getToken(GrammarParser.INHERITS, 0); }
		public List<InsidesContext> insides() {
			return getRuleContexts(InsidesContext.class);
		}
		public InsidesContext insides(int i) {
			return getRuleContext(InsidesContext.class,i);
		}
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterClass_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitClass_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitClass_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(CLASS);
			setState(18);
			match(TYPEID);
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(19);
				match(INHERITS);
				setState(20);
				match(TYPEID);
				}
			}

			setState(23);
			match(LEFTCURLY);
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OBJECTID) {
				{
				{
				setState(24);
				insides();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(RIGHTCURLY);
			setState(31);
			match(SEMICOLON);
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

	public static class InsidesContext extends ParserRuleContext {
		public InsidesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insides; }
	 
		public InsidesContext() { }
		public void copyFrom(InsidesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodContext extends InsidesContext {
		public TerminalNode OBJECTID() { return getToken(GrammarParser.OBJECTID, 0); }
		public TerminalNode LEFTPAREN() { return getToken(GrammarParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(GrammarParser.RIGHTPAREN, 0); }
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public TerminalNode TYPEID() { return getToken(GrammarParser.TYPEID, 0); }
		public TerminalNode LEFTCURLY() { return getToken(GrammarParser.LEFTCURLY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHTCURLY() { return getToken(GrammarParser.RIGHTCURLY, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public MethodContext(InsidesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttributeContext extends InsidesContext {
		public TerminalNode OBJECTID() { return getToken(GrammarParser.OBJECTID, 0); }
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public TerminalNode TYPEID() { return getToken(GrammarParser.TYPEID, 0); }
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AttributeContext(InsidesContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsidesContext insides() throws RecognitionException {
		InsidesContext _localctx = new InsidesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_insides);
		int _la;
		try {
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new MethodContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(OBJECTID);
				setState(34);
				match(LEFTPAREN);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OBJECTID) {
					{
					{
					setState(35);
					parameter();
					}
					setState(40);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(36);
						match(COMMA);
						setState(37);
						parameter();
						}
						}
						setState(42);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(45);
				match(RIGHTPAREN);
				setState(46);
				match(COLON);
				setState(47);
				match(TYPEID);
				setState(48);
				match(LEFTCURLY);
				setState(49);
				expr(0);
				setState(50);
				match(RIGHTCURLY);
				setState(51);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new AttributeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(OBJECTID);
				setState(54);
				match(COLON);
				setState(55);
				match(TYPEID);
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(56);
					match(ASSIGN);
					setState(57);
					expr(0);
					}
				}

				setState(60);
				match(SEMICOLON);
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode OBJECTID() { return getToken(GrammarParser.OBJECTID, 0); }
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public TerminalNode TYPEID() { return getToken(GrammarParser.TYPEID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(OBJECTID);
			setState(64);
			match(COLON);
			setState(65);
			match(TYPEID);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpEqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUAL() { return getToken(GrammarParser.EQUAL, 0); }
		public OpEqualContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOpEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOpEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitOpEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpAssignContext extends ExprContext {
		public TerminalNode OBJECTID() { return getToken(GrammarParser.OBJECTID, 0); }
		public TerminalNode ASSIGN() { return getToken(GrammarParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OpAssignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOpAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOpAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitOpAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NewTypeContext extends ExprContext {
		public TerminalNode NEW() { return getToken(GrammarParser.NEW, 0); }
		public TerminalNode TYPEID() { return getToken(GrammarParser.TYPEID, 0); }
		public NewTypeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterNewType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitNewType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitNewType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileLoopContext extends ExprContext {
		public TerminalNode WHILE() { return getToken(GrammarParser.WHILE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LOOP() { return getToken(GrammarParser.LOOP, 0); }
		public TerminalNode POOL() { return getToken(GrammarParser.POOL, 0); }
		public WhileLoopContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpNotContext extends ExprContext {
		public TerminalNode NOT() { return getToken(GrammarParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OpNotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOpNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOpNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitOpNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Block1Context extends ExprContext {
		public TerminalNode LEFTCURLY() { return getToken(GrammarParser.LEFTCURLY, 0); }
		public TerminalNode RIGHTCURLY() { return getToken(GrammarParser.RIGHTCURLY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GrammarParser.SEMICOLON, i);
		}
		public Block1Context(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlock1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlock1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlock1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfThenElseContext extends ExprContext {
		public TerminalNode IF() { return getToken(GrammarParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(GrammarParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(GrammarParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(GrammarParser.FI, 0); }
		public IfThenElseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIfThenElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIfThenElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIfThenElse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolFalseContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(GrammarParser.FALSE, 0); }
		public BoolFalseContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBoolFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBoolFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBoolFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpComplementContext extends ExprContext {
		public TerminalNode TL() { return getToken(GrammarParser.TL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OpComplementContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOpComplement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOpComplement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitOpComplement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallingmethodContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DOT() { return getToken(GrammarParser.DOT, 0); }
		public TerminalNode OBJECTID() { return getToken(GrammarParser.OBJECTID, 0); }
		public TerminalNode LEFTPAREN() { return getToken(GrammarParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(GrammarParser.RIGHTPAREN, 0); }
		public CallingmethodContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCallingmethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCallingmethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCallingmethod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(GrammarParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(GrammarParser.SUB, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerContext extends ExprContext {
		public TerminalNode NUM() { return getToken(GrammarParser.NUM, 0); }
		public IntegerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(GrammarParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(GrammarParser.DIV, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwitchContext extends ExprContext {
		public TerminalNode CASE() { return getToken(GrammarParser.CASE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OF() { return getToken(GrammarParser.OF, 0); }
		public TerminalNode ESAC() { return getToken(GrammarParser.ESAC, 0); }
		public List<BranchContext> branch() {
			return getRuleContexts(BranchContext.class);
		}
		public BranchContext branch(int i) {
			return getRuleContext(BranchContext.class,i);
		}
		public SwitchContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSwitch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolTrueContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(GrammarParser.TRUE, 0); }
		public BoolTrueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBoolTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBoolTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBoolTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsVoidContext extends ExprContext {
		public TerminalNode ISVOID() { return getToken(GrammarParser.ISVOID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IsVoidContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIsVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIsVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIsVoid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(GrammarParser.LT, 0); }
		public LessThanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLessThan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLessThan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLessThan(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjIdContext extends ExprContext {
		public TerminalNode OBJECTID() { return getToken(GrammarParser.OBJECTID, 0); }
		public ObjIdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterObjId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitObjId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitObjId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockContext extends ExprContext {
		public TerminalNode LEFTCURLY() { return getToken(GrammarParser.LEFTCURLY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHTCURLY() { return getToken(GrammarParser.RIGHTCURLY, 0); }
		public BlockContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessEqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LE() { return getToken(GrammarParser.LE, 0); }
		public LessEqualContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterLessEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitLessEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitLessEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GroupContext extends ExprContext {
		public TerminalNode LEFTPAREN() { return getToken(GrammarParser.LEFTPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(GrammarParser.RIGHTPAREN, 0); }
		public GroupContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new OpAssignContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(68);
				match(OBJECTID);
				setState(69);
				match(ASSIGN);
				setState(70);
				expr(21);
				}
				break;
			case 2:
				{
				_localctx = new WhileLoopContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				match(WHILE);
				setState(72);
				expr(0);
				setState(73);
				match(LOOP);
				setState(74);
				expr(0);
				setState(75);
				match(POOL);
				}
				break;
			case 3:
				{
				_localctx = new BlockContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				match(LEFTCURLY);
				setState(78);
				expr(0);
				setState(79);
				match(RIGHTCURLY);
				}
				break;
			case 4:
				{
				_localctx = new Block1Context(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				match(LEFTCURLY);
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(82);
					expr(0);
					setState(83);
					match(SEMICOLON);
					}
					}
					setState(87); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << IF) | (1L << WHILE) | (1L << CASE) | (1L << NEW) | (1L << ISVOID) | (1L << NOT) | (1L << LEFTPAREN) | (1L << LEFTCURLY) | (1L << TL) | (1L << NUM) | (1L << OBJECTID))) != 0) );
				setState(89);
				match(RIGHTCURLY);
				}
				break;
			case 5:
				{
				_localctx = new IfThenElseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(IF);
				setState(92);
				expr(0);
				setState(93);
				match(THEN);
				setState(94);
				expr(0);
				setState(95);
				match(ELSE);
				setState(96);
				expr(0);
				setState(97);
				match(FI);
				}
				break;
			case 6:
				{
				_localctx = new SwitchContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(99);
				match(CASE);
				setState(100);
				expr(0);
				setState(101);
				match(OF);
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(102);
					branch();
					}
					}
					setState(105); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==OBJECTID );
				setState(107);
				match(ESAC);
				}
				break;
			case 7:
				{
				_localctx = new NewTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(NEW);
				setState(110);
				match(TYPEID);
				}
				break;
			case 8:
				{
				_localctx = new IsVoidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111);
				match(ISVOID);
				setState(112);
				expr(13);
				}
				break;
			case 9:
				{
				_localctx = new OpComplementContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(TL);
				setState(114);
				expr(12);
				}
				break;
			case 10:
				{
				_localctx = new OpNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				match(NOT);
				setState(116);
				expr(6);
				}
				break;
			case 11:
				{
				_localctx = new GroupContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(LEFTPAREN);
				setState(118);
				expr(0);
				setState(119);
				match(RIGHTPAREN);
				}
				break;
			case 12:
				{
				_localctx = new ObjIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(OBJECTID);
				}
				break;
			case 13:
				{
				_localctx = new IntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(NUM);
				}
				break;
			case 14:
				{
				_localctx = new BoolTrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(TRUE);
				}
				break;
			case 15:
				{
				_localctx = new BoolFalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(150);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(127);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(128);
						_la = _input.LA(1);
						if ( !(_la==DIV || _la==MUL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(129);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(130);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(131);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(132);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new LessThanContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(133);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(134);
						match(LT);
						setState(135);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new LessEqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(136);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(137);
						match(LE);
						setState(138);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new OpEqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(139);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(140);
						match(EQUAL);
						setState(141);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new CallingmethodContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(142);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(143);
						match(DOT);
						setState(144);
						match(OBJECTID);
						setState(145);
						match(LEFTPAREN);
						setState(147);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << IF) | (1L << WHILE) | (1L << CASE) | (1L << NEW) | (1L << ISVOID) | (1L << NOT) | (1L << LEFTPAREN) | (1L << LEFTCURLY) | (1L << TL) | (1L << NUM) | (1L << OBJECTID))) != 0)) {
							{
							setState(146);
							expr(0);
							}
						}

						setState(149);
						match(RIGHTPAREN);
						}
						break;
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class BranchContext extends ParserRuleContext {
		public TerminalNode OBJECTID() { return getToken(GrammarParser.OBJECTID, 0); }
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public TerminalNode TYPEID() { return getToken(GrammarParser.TYPEID, 0); }
		public TerminalNode DARROW() { return getToken(GrammarParser.DARROW, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GrammarParser.SEMICOLON, 0); }
		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBranch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBranch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_branch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(OBJECTID);
			setState(156);
			match(COLON);
			setState(157);
			match(TYPEID);
			setState(158);
			match(DARROW);
			setState(159);
			expr(0);
			setState(160);
			match(SEMICOLON);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 20);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001,\u00a3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000\f"+
		"\u0000\u000f\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u0016\b\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001a\b\u0001\n\u0001"+
		"\f\u0001\u001d\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\'\b\u0002"+
		"\n\u0002\f\u0002*\t\u0002\u0003\u0002,\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		";\b\u0002\u0001\u0002\u0003\u0002>\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0004\u0004V\b\u0004\u000b\u0004\f\u0004W\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0004\u0004h\b\u0004\u000b\u0004\f\u0004i\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004~\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0094\b\u0004\u0001\u0004\u0005"+
		"\u0004\u0097\b\u0004\n\u0004\f\u0004\u009a\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0000\u0001\b\u0006\u0000\u0002\u0004\u0006\b\n\u0000\u0002\u0001\u0000"+
		"\u0016\u0017\u0001\u0000\u0014\u0015\u00ba\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0002\u0011\u0001\u0000\u0000\u0000\u0004=\u0001\u0000\u0000\u0000\u0006"+
		"?\u0001\u0000\u0000\u0000\b}\u0001\u0000\u0000\u0000\n\u009b\u0001\u0000"+
		"\u0000\u0000\f\u000e\u0003\u0002\u0001\u0000\r\f\u0001\u0000\u0000\u0000"+
		"\u000e\u000f\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000\u000f"+
		"\u0010\u0001\u0000\u0000\u0000\u0010\u0001\u0001\u0000\u0000\u0000\u0011"+
		"\u0012\u0005\u0001\u0000\u0000\u0012\u0015\u0005+\u0000\u0000\u0013\u0014"+
		"\u0005\b\u0000\u0000\u0014\u0016\u0005+\u0000\u0000\u0015\u0013\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0017\u0001"+
		"\u0000\u0000\u0000\u0017\u001b\u0005\u001a\u0000\u0000\u0018\u001a\u0003"+
		"\u0004\u0002\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001d\u0001"+
		"\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001"+
		"\u0000\u0000\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u001b\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0005\u001b\u0000\u0000\u001f \u0005\""+
		"\u0000\u0000 \u0003\u0001\u0000\u0000\u0000!\"\u0005*\u0000\u0000\"+\u0005"+
		"\u0018\u0000\u0000#(\u0003\u0006\u0003\u0000$%\u0005$\u0000\u0000%\'\u0003"+
		"\u0006\u0003\u0000&$\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000\u0000"+
		"(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000),\u0001\u0000\u0000"+
		"\u0000*(\u0001\u0000\u0000\u0000+#\u0001\u0000\u0000\u0000+,\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0005\u0019\u0000\u0000./\u0005"+
		"!\u0000\u0000/0\u0005+\u0000\u000001\u0005\u001a\u0000\u000012\u0003\b"+
		"\u0004\u000023\u0005\u001b\u0000\u000034\u0005\"\u0000\u00004>\u0001\u0000"+
		"\u0000\u000056\u0005*\u0000\u000067\u0005!\u0000\u00007:\u0005+\u0000"+
		"\u000089\u0005\u001f\u0000\u00009;\u0003\b\u0004\u0000:8\u0001\u0000\u0000"+
		"\u0000:;\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<>\u0005\"\u0000"+
		"\u0000=!\u0001\u0000\u0000\u0000=5\u0001\u0000\u0000\u0000>\u0005\u0001"+
		"\u0000\u0000\u0000?@\u0005*\u0000\u0000@A\u0005!\u0000\u0000AB\u0005+"+
		"\u0000\u0000B\u0007\u0001\u0000\u0000\u0000CD\u0006\u0004\uffff\uffff"+
		"\u0000DE\u0005*\u0000\u0000EF\u0005\u001f\u0000\u0000F~\u0003\b\u0004"+
		"\u0015GH\u0005\r\u0000\u0000HI\u0003\b\u0004\u0000IJ\u0005\n\u0000\u0000"+
		"JK\u0003\b\u0004\u0000KL\u0005\u000b\u0000\u0000L~\u0001\u0000\u0000\u0000"+
		"MN\u0005\u001a\u0000\u0000NO\u0003\b\u0004\u0000OP\u0005\u001b\u0000\u0000"+
		"P~\u0001\u0000\u0000\u0000QU\u0005\u001a\u0000\u0000RS\u0003\b\u0004\u0000"+
		"ST\u0005\"\u0000\u0000TV\u0001\u0000\u0000\u0000UR\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000YZ\u0005\u001b\u0000\u0000Z~\u0001\u0000"+
		"\u0000\u0000[\\\u0005\u0006\u0000\u0000\\]\u0003\b\u0004\u0000]^\u0005"+
		"\f\u0000\u0000^_\u0003\b\u0004\u0000_`\u0005\u0002\u0000\u0000`a\u0003"+
		"\b\u0004\u0000ab\u0005\u0003\u0000\u0000b~\u0001\u0000\u0000\u0000cd\u0005"+
		"\u000e\u0000\u0000de\u0003\b\u0004\u0000eg\u0005\u0010\u0000\u0000fh\u0003"+
		"\n\u0005\u0000gf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"kl\u0005\u000f\u0000\u0000l~\u0001\u0000\u0000\u0000mn\u0005\u0011\u0000"+
		"\u0000n~\u0005+\u0000\u0000op\u0005\u0012\u0000\u0000p~\u0003\b\u0004"+
		"\rqr\u0005&\u0000\u0000r~\u0003\b\u0004\fst\u0005\u0013\u0000\u0000t~"+
		"\u0003\b\u0004\u0006uv\u0005\u0018\u0000\u0000vw\u0003\b\u0004\u0000w"+
		"x\u0005\u0019\u0000\u0000x~\u0001\u0000\u0000\u0000y~\u0005*\u0000\u0000"+
		"z~\u0005)\u0000\u0000{~\u0005\u0004\u0000\u0000|~\u0005\u0005\u0000\u0000"+
		"}C\u0001\u0000\u0000\u0000}G\u0001\u0000\u0000\u0000}M\u0001\u0000\u0000"+
		"\u0000}Q\u0001\u0000\u0000\u0000}[\u0001\u0000\u0000\u0000}c\u0001\u0000"+
		"\u0000\u0000}m\u0001\u0000\u0000\u0000}o\u0001\u0000\u0000\u0000}q\u0001"+
		"\u0000\u0000\u0000}s\u0001\u0000\u0000\u0000}u\u0001\u0000\u0000\u0000"+
		"}y\u0001\u0000\u0000\u0000}z\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000}|\u0001\u0000\u0000\u0000~\u0098\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\n\u000b\u0000\u0000\u0080\u0081\u0007\u0000\u0000\u0000\u0081\u0097"+
		"\u0003\b\u0004\f\u0082\u0083\n\n\u0000\u0000\u0083\u0084\u0007\u0001\u0000"+
		"\u0000\u0084\u0097\u0003\b\u0004\u000b\u0085\u0086\n\t\u0000\u0000\u0086"+
		"\u0087\u0005\u001d\u0000\u0000\u0087\u0097\u0003\b\u0004\n\u0088\u0089"+
		"\n\b\u0000\u0000\u0089\u008a\u0005\u001e\u0000\u0000\u008a\u0097\u0003"+
		"\b\u0004\t\u008b\u008c\n\u0007\u0000\u0000\u008c\u008d\u0005\u001c\u0000"+
		"\u0000\u008d\u0097\u0003\b\u0004\b\u008e\u008f\n\u0014\u0000\u0000\u008f"+
		"\u0090\u0005%\u0000\u0000\u0090\u0091\u0005*\u0000\u0000\u0091\u0093\u0005"+
		"\u0018\u0000\u0000\u0092\u0094\u0003\b\u0004\u0000\u0093\u0092\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u0097\u0005\u0019\u0000\u0000\u0096\u007f\u0001\u0000"+
		"\u0000\u0000\u0096\u0082\u0001\u0000\u0000\u0000\u0096\u0085\u0001\u0000"+
		"\u0000\u0000\u0096\u0088\u0001\u0000\u0000\u0000\u0096\u008b\u0001\u0000"+
		"\u0000\u0000\u0096\u008e\u0001\u0000\u0000\u0000\u0097\u009a\u0001\u0000"+
		"\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0099\t\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0005*\u0000\u0000\u009c\u009d\u0005!\u0000\u0000\u009d"+
		"\u009e\u0005+\u0000\u0000\u009e\u009f\u0005 \u0000\u0000\u009f\u00a0\u0003"+
		"\b\u0004\u0000\u00a0\u00a1\u0005\"\u0000\u0000\u00a1\u000b\u0001\u0000"+
		"\u0000\u0000\r\u000f\u0015\u001b(+:=Wi}\u0093\u0096\u0098";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}