// Generated from Hello.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, DIGIT=20, STRING=21, WS=22;
	public static final int
		RULE_mainNode = 0, RULE_varList = 1, RULE_start = 2, RULE_sequenceNode = 3, 
		RULE_stmt = 4, RULE_assignmentNode = 5, RULE_ifNode = 6, RULE_whileNode = 7, 
		RULE_blockNode = 8, RULE_bracketNode = 9, RULE_bExpr = 10, RULE_aExpr = 11, 
		RULE_bVal = 12, RULE_aVal = 13, RULE_number = 14, RULE_var = 15;
	public static final String[] ruleNames = {
		"mainNode", "varList", "start", "sequenceNode", "stmt", "assignmentNode", 
		"ifNode", "whileNode", "blockNode", "bracketNode", "bExpr", "aExpr", "bVal", 
		"aVal", "number", "var"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "','", "';'", "'='", "'if'", "'else'", "'while'", "'{'", 
		"'}'", "'('", "')'", "'!'", "'>'", "'&&'", "'/'", "'+'", "'true'", "'false'", 
		"'0'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "DIGIT", "STRING", "WS"
	};
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
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MainNodeContext extends ParserRuleContext {
		public VarListContext varList() {
			return getRuleContext(VarListContext.class,0);
		}
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public MainNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMainNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMainNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMainNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainNodeContext mainNode() throws RecognitionException {
		MainNodeContext _localctx = new MainNodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mainNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			varList(0);
			setState(33);
			start();
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

	public static class VarListContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VarListContext varList() {
			return getRuleContext(VarListContext.class,0);
		}
		public VarListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterVarList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitVarList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitVarList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarListContext varList() throws RecognitionException {
		return varList(0);
	}

	private VarListContext varList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VarListContext _localctx = new VarListContext(_ctx, _parentState);
		VarListContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_varList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(36);
			match(T__0);
			setState(37);
			var();
			}
			_ctx.stop = _input.LT(-1);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(44);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new VarListContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_varList);
						setState(39);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(40);
						match(T__1);
						setState(41);
						var();
						}
						break;
					case 2:
						{
						_localctx = new VarListContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_varList);
						setState(42);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(43);
						match(T__2);
						}
						break;
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class StartContext extends ParserRuleContext {
		public SequenceNodeContext sequenceNode() {
			return getRuleContext(SequenceNodeContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_start);
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				sequenceNode();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				stmt();
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

	public static class SequenceNodeContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public SequenceNodeContext sequenceNode() {
			return getRuleContext(SequenceNodeContext.class,0);
		}
		public SequenceNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequenceNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterSequenceNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitSequenceNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitSequenceNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceNodeContext sequenceNode() throws RecognitionException {
		SequenceNodeContext _localctx = new SequenceNodeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sequenceNode);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				stmt();
				setState(54);
				stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				stmt();
				setState(57);
				sequenceNode();
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

	public static class StmtContext extends ParserRuleContext {
		public AssignmentNodeContext assignmentNode() {
			return getRuleContext(AssignmentNodeContext.class,0);
		}
		public IfNodeContext ifNode() {
			return getRuleContext(IfNodeContext.class,0);
		}
		public WhileNodeContext whileNode() {
			return getRuleContext(WhileNodeContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				assignmentNode();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				ifNode();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				whileNode();
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

	public static class AssignmentNodeContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public AExprContext aExpr() {
			return getRuleContext(AExprContext.class,0);
		}
		public AssignmentNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAssignmentNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAssignmentNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAssignmentNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentNodeContext assignmentNode() throws RecognitionException {
		AssignmentNodeContext _localctx = new AssignmentNodeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignmentNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			var();
			setState(67);
			match(T__3);
			setState(68);
			aExpr(0);
			setState(69);
			match(T__2);
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

	public static class IfNodeContext extends ParserRuleContext {
		public BExprContext bExpr() {
			return getRuleContext(BExprContext.class,0);
		}
		public List<BlockNodeContext> blockNode() {
			return getRuleContexts(BlockNodeContext.class);
		}
		public BlockNodeContext blockNode(int i) {
			return getRuleContext(BlockNodeContext.class,i);
		}
		public IfNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterIfNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitIfNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitIfNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfNodeContext ifNode() throws RecognitionException {
		IfNodeContext _localctx = new IfNodeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__4);
			setState(72);
			bExpr(0);
			setState(73);
			blockNode();
			setState(74);
			match(T__5);
			setState(75);
			blockNode();
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

	public static class WhileNodeContext extends ParserRuleContext {
		public BExprContext bExpr() {
			return getRuleContext(BExprContext.class,0);
		}
		public BlockNodeContext blockNode() {
			return getRuleContext(BlockNodeContext.class,0);
		}
		public WhileNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterWhileNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitWhileNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitWhileNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileNodeContext whileNode() throws RecognitionException {
		WhileNodeContext _localctx = new WhileNodeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__6);
			setState(78);
			bExpr(0);
			setState(79);
			blockNode();
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

	public static class BlockNodeContext extends ParserRuleContext {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public BlockNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterBlockNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitBlockNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitBlockNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockNodeContext blockNode() throws RecognitionException {
		BlockNodeContext _localctx = new BlockNodeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_blockNode);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(T__7);
				setState(82);
				match(T__8);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(T__7);
				setState(84);
				start();
				setState(85);
				match(T__8);
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

	public static class BracketNodeContext extends ParserRuleContext {
		public AExprContext aExpr() {
			return getRuleContext(AExprContext.class,0);
		}
		public BExprContext bExpr() {
			return getRuleContext(BExprContext.class,0);
		}
		public BracketNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bracketNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterBracketNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitBracketNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitBracketNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BracketNodeContext bracketNode() throws RecognitionException {
		BracketNodeContext _localctx = new BracketNodeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bracketNode);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(T__9);
				setState(90);
				aExpr(0);
				setState(91);
				match(T__10);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(T__9);
				setState(94);
				bExpr(0);
				setState(95);
				match(T__10);
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

	public static class BExprContext extends ParserRuleContext {
		public BracketNodeContext bracketNode() {
			return getRuleContext(BracketNodeContext.class,0);
		}
		public List<BExprContext> bExpr() {
			return getRuleContexts(BExprContext.class);
		}
		public BExprContext bExpr(int i) {
			return getRuleContext(BExprContext.class,i);
		}
		public List<AExprContext> aExpr() {
			return getRuleContexts(AExprContext.class);
		}
		public AExprContext aExpr(int i) {
			return getRuleContext(AExprContext.class,i);
		}
		public BValContext bVal() {
			return getRuleContext(BValContext.class,0);
		}
		public BExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterBExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitBExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitBExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BExprContext bExpr() throws RecognitionException {
		return bExpr(0);
	}

	private BExprContext bExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BExprContext _localctx = new BExprContext(_ctx, _parentState);
		BExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_bExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(100);
				bracketNode();
				}
				break;
			case 2:
				{
				setState(101);
				match(T__11);
				setState(102);
				bExpr(4);
				}
				break;
			case 3:
				{
				setState(103);
				aExpr(0);
				setState(104);
				match(T__12);
				setState(105);
				aExpr(0);
				}
				break;
			case 4:
				{
				setState(107);
				bVal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_bExpr);
					setState(110);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(111);
					match(T__13);
					setState(112);
					bExpr(3);
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class AExprContext extends ParserRuleContext {
		public BracketNodeContext bracketNode() {
			return getRuleContext(BracketNodeContext.class,0);
		}
		public AValContext aVal() {
			return getRuleContext(AValContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<AExprContext> aExpr() {
			return getRuleContexts(AExprContext.class);
		}
		public AExprContext aExpr(int i) {
			return getRuleContext(AExprContext.class,i);
		}
		public AExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AExprContext aExpr() throws RecognitionException {
		return aExpr(0);
	}

	private AExprContext aExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AExprContext _localctx = new AExprContext(_ctx, _parentState);
		AExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_aExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				{
				setState(119);
				bracketNode();
				}
				break;
			case T__18:
			case DIGIT:
				{
				setState(120);
				aVal();
				}
				break;
			case STRING:
				{
				setState(121);
				var();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(130);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new AExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_aExpr);
						setState(124);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(125);
						match(T__14);
						setState(126);
						aExpr(5);
						}
						break;
					case 2:
						{
						_localctx = new AExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_aExpr);
						setState(127);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(128);
						match(T__15);
						setState(129);
						aExpr(4);
						}
						break;
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class BValContext extends ParserRuleContext {
		public BValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterBVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitBVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitBVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BValContext bVal() throws RecognitionException {
		BValContext _localctx = new BValContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bVal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_la = _input.LA(1);
			if ( !(_la==T__16 || _la==T__17) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AValContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public AValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterAVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitAVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AValContext aVal() throws RecognitionException {
		AValContext _localctx = new AValContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_aVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			number();
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

	public static class NumberContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(HelloParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(HelloParser.DIGIT, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_number);
		int _la;
		try {
			int _alt;
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(DIGIT);
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(140);
						_la = _input.LA(1);
						if ( !(_la==T__18 || _la==DIGIT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(145);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(T__18);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(HelloParser.STRING, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(STRING);
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
		case 1:
			return varList_sempred((VarListContext)_localctx, predIndex);
		case 10:
			return bExpr_sempred((BExprContext)_localctx, predIndex);
		case 11:
			return aExpr_sempred((AExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean varList_sempred(VarListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean bExpr_sempred(BExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean aExpr_sempred(AExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\u009a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3\4"+
		"\3\4\5\4\66\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5>\n\5\3\6\3\6\3\6\5\6C\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\nZ\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13d"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fo\n\f\3\f\3\f\3\f\7\ft\n"+
		"\f\f\f\16\fw\13\f\3\r\3\r\3\r\3\r\5\r}\n\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r"+
		"\u0085\n\r\f\r\16\r\u0088\13\r\3\16\3\16\3\17\3\17\3\20\3\20\7\20\u0090"+
		"\n\20\f\20\16\20\u0093\13\20\3\20\5\20\u0096\n\20\3\21\3\21\3\21\2\5\4"+
		"\26\30\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\4\3\2\23\24\3\2\25"+
		"\26\2\u009b\2\"\3\2\2\2\4%\3\2\2\2\6\65\3\2\2\2\b=\3\2\2\2\nB\3\2\2\2"+
		"\fD\3\2\2\2\16I\3\2\2\2\20O\3\2\2\2\22Y\3\2\2\2\24c\3\2\2\2\26n\3\2\2"+
		"\2\30|\3\2\2\2\32\u0089\3\2\2\2\34\u008b\3\2\2\2\36\u0095\3\2\2\2 \u0097"+
		"\3\2\2\2\"#\5\4\3\2#$\5\6\4\2$\3\3\2\2\2%&\b\3\1\2&\'\7\3\2\2\'(\5 \21"+
		"\2(\60\3\2\2\2)*\f\4\2\2*+\7\4\2\2+/\5 \21\2,-\f\3\2\2-/\7\5\2\2.)\3\2"+
		"\2\2.,\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\5\3\2\2\2\62\60"+
		"\3\2\2\2\63\66\5\b\5\2\64\66\5\n\6\2\65\63\3\2\2\2\65\64\3\2\2\2\66\7"+
		"\3\2\2\2\678\5\n\6\289\5\n\6\29>\3\2\2\2:;\5\n\6\2;<\5\b\5\2<>\3\2\2\2"+
		"=\67\3\2\2\2=:\3\2\2\2>\t\3\2\2\2?C\5\f\7\2@C\5\16\b\2AC\5\20\t\2B?\3"+
		"\2\2\2B@\3\2\2\2BA\3\2\2\2C\13\3\2\2\2DE\5 \21\2EF\7\6\2\2FG\5\30\r\2"+
		"GH\7\5\2\2H\r\3\2\2\2IJ\7\7\2\2JK\5\26\f\2KL\5\22\n\2LM\7\b\2\2MN\5\22"+
		"\n\2N\17\3\2\2\2OP\7\t\2\2PQ\5\26\f\2QR\5\22\n\2R\21\3\2\2\2ST\7\n\2\2"+
		"TZ\7\13\2\2UV\7\n\2\2VW\5\6\4\2WX\7\13\2\2XZ\3\2\2\2YS\3\2\2\2YU\3\2\2"+
		"\2Z\23\3\2\2\2[\\\7\f\2\2\\]\5\30\r\2]^\7\r\2\2^d\3\2\2\2_`\7\f\2\2`a"+
		"\5\26\f\2ab\7\r\2\2bd\3\2\2\2c[\3\2\2\2c_\3\2\2\2d\25\3\2\2\2ef\b\f\1"+
		"\2fo\5\24\13\2gh\7\16\2\2ho\5\26\f\6ij\5\30\r\2jk\7\17\2\2kl\5\30\r\2"+
		"lo\3\2\2\2mo\5\32\16\2ne\3\2\2\2ng\3\2\2\2ni\3\2\2\2nm\3\2\2\2ou\3\2\2"+
		"\2pq\f\4\2\2qr\7\20\2\2rt\5\26\f\5sp\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2"+
		"\2\2v\27\3\2\2\2wu\3\2\2\2xy\b\r\1\2y}\5\24\13\2z}\5\34\17\2{}\5 \21\2"+
		"|x\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\u0086\3\2\2\2~\177\f\6\2\2\177\u0080\7"+
		"\21\2\2\u0080\u0085\5\30\r\7\u0081\u0082\f\5\2\2\u0082\u0083\7\22\2\2"+
		"\u0083\u0085\5\30\r\6\u0084~\3\2\2\2\u0084\u0081\3\2\2\2\u0085\u0088\3"+
		"\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\31\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\u008a\t\2\2\2\u008a\33\3\2\2\2\u008b\u008c\5\36\20"+
		"\2\u008c\35\3\2\2\2\u008d\u0091\7\26\2\2\u008e\u0090\t\3\2\2\u008f\u008e"+
		"\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0096\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0096\7\25\2\2\u0095\u008d\3"+
		"\2\2\2\u0095\u0094\3\2\2\2\u0096\37\3\2\2\2\u0097\u0098\7\27\2\2\u0098"+
		"!\3\2\2\2\20.\60\65=BYcnu|\u0084\u0086\u0091\u0095";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}