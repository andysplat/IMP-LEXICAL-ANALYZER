// Generated from Hello.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#mainNode}.
	 * @param ctx the parse tree
	 */
	void enterMainNode(HelloParser.MainNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#mainNode}.
	 * @param ctx the parse tree
	 */
	void exitMainNode(HelloParser.MainNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#varList}.
	 * @param ctx the parse tree
	 */
	void enterVarList(HelloParser.VarListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#varList}.
	 * @param ctx the parse tree
	 */
	void exitVarList(HelloParser.VarListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(HelloParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(HelloParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#sequenceNode}.
	 * @param ctx the parse tree
	 */
	void enterSequenceNode(HelloParser.SequenceNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#sequenceNode}.
	 * @param ctx the parse tree
	 */
	void exitSequenceNode(HelloParser.SequenceNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(HelloParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(HelloParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#assignmentNode}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentNode(HelloParser.AssignmentNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#assignmentNode}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentNode(HelloParser.AssignmentNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#ifNode}.
	 * @param ctx the parse tree
	 */
	void enterIfNode(HelloParser.IfNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#ifNode}.
	 * @param ctx the parse tree
	 */
	void exitIfNode(HelloParser.IfNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#whileNode}.
	 * @param ctx the parse tree
	 */
	void enterWhileNode(HelloParser.WhileNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#whileNode}.
	 * @param ctx the parse tree
	 */
	void exitWhileNode(HelloParser.WhileNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#blockNode}.
	 * @param ctx the parse tree
	 */
	void enterBlockNode(HelloParser.BlockNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#blockNode}.
	 * @param ctx the parse tree
	 */
	void exitBlockNode(HelloParser.BlockNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#bracketNode}.
	 * @param ctx the parse tree
	 */
	void enterBracketNode(HelloParser.BracketNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#bracketNode}.
	 * @param ctx the parse tree
	 */
	void exitBracketNode(HelloParser.BracketNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#bExpr}.
	 * @param ctx the parse tree
	 */
	void enterBExpr(HelloParser.BExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#bExpr}.
	 * @param ctx the parse tree
	 */
	void exitBExpr(HelloParser.BExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#aExpr}.
	 * @param ctx the parse tree
	 */
	void enterAExpr(HelloParser.AExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#aExpr}.
	 * @param ctx the parse tree
	 */
	void exitAExpr(HelloParser.AExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#bVal}.
	 * @param ctx the parse tree
	 */
	void enterBVal(HelloParser.BValContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#bVal}.
	 * @param ctx the parse tree
	 */
	void exitBVal(HelloParser.BValContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#aVal}.
	 * @param ctx the parse tree
	 */
	void enterAVal(HelloParser.AValContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#aVal}.
	 * @param ctx the parse tree
	 */
	void exitAVal(HelloParser.AValContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(HelloParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(HelloParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(HelloParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(HelloParser.VarContext ctx);
}