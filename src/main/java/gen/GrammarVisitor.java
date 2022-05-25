package gen;// Generated from X:/JavaProjects/cool-compiler/src/main/resources\Grammar.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#class_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_def(GrammarParser.Class_defContext ctx);
	/**
	 * Visit a parse tree produced by the {@code method}
	 * labeled alternative in {@link GrammarParser#insides}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(GrammarParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attribute}
	 * labeled alternative in {@link GrammarParser#insides}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(GrammarParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(GrammarParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opEqual}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpEqual(GrammarParser.OpEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opAssign}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpAssign(GrammarParser.OpAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code newType}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewType(GrammarParser.NewTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(GrammarParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opNot}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpNot(GrammarParser.OpNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code block1}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock1(GrammarParser.Block1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ifThenElse}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThenElse(GrammarParser.IfThenElseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolFalse}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolFalse(GrammarParser.BoolFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opComplement}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpComplement(GrammarParser.OpComplementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callingmethod}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallingmethod(GrammarParser.CallingmethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(GrammarParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(GrammarParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(GrammarParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switch}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch(GrammarParser.SwitchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolTrue}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolTrue(GrammarParser.BoolTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isVoid}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsVoid(GrammarParser.IsVoidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(GrammarParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objId}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjId(GrammarParser.ObjIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code block}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessEqual}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEqual(GrammarParser.LessEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code group}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup(GrammarParser.GroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch(GrammarParser.BranchContext ctx);
}