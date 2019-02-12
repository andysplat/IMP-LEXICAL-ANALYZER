// Generated from Hello.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#mainNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainNode(HelloParser.MainNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#varList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarList(HelloParser.VarListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(HelloParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#sequenceNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequenceNode(HelloParser.SequenceNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(HelloParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#assignmentNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentNode(HelloParser.AssignmentNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#ifNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNode(HelloParser.IfNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#whileNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileNode(HelloParser.WhileNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#blockNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockNode(HelloParser.BlockNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#bracketNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketNode(HelloParser.BracketNodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#bExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBExpr(HelloParser.BExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#aExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAExpr(HelloParser.AExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#bVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBVal(HelloParser.BValContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#aVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAVal(HelloParser.AValContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(HelloParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(HelloParser.VarContext ctx);
}