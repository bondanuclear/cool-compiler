package gen;// Generated from X:/JavaProjects/cool-compiler/src/main/resources\Grammar.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#class_def}.
	 * @param ctx the parse tree
	 */
	void enterClass_def(GrammarParser.Class_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#class_def}.
	 * @param ctx the parse tree
	 */
	void exitClass_def(GrammarParser.Class_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code method}
	 * labeled alternative in {@link GrammarParser#insides}.
	 * @param ctx the parse tree
	 */
	void enterMethod(GrammarParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code method}
	 * labeled alternative in {@link GrammarParser#insides}.
	 * @param ctx the parse tree
	 */
	void exitMethod(GrammarParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attribute}
	 * labeled alternative in {@link GrammarParser#insides}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(GrammarParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attribute}
	 * labeled alternative in {@link GrammarParser#insides}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(GrammarParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(GrammarParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(GrammarParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opEqual}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpEqual(GrammarParser.OpEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opEqual}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpEqual(GrammarParser.OpEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opAssign}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpAssign(GrammarParser.OpAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opAssign}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpAssign(GrammarParser.OpAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code newType}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNewType(GrammarParser.NewTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code newType}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNewType(GrammarParser.NewTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(GrammarParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(GrammarParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opNot}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpNot(GrammarParser.OpNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opNot}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpNot(GrammarParser.OpNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block1}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBlock1(GrammarParser.Block1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code block1}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBlock1(GrammarParser.Block1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ifThenElse}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElse(GrammarParser.IfThenElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifThenElse}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElse(GrammarParser.IfThenElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolFalse}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolFalse(GrammarParser.BoolFalseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolFalse}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolFalse(GrammarParser.BoolFalseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opComplement}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOpComplement(GrammarParser.OpComplementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opComplement}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOpComplement(GrammarParser.OpComplementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callingmethod}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCallingmethod(GrammarParser.CallingmethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callingmethod}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCallingmethod(GrammarParser.CallingmethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(GrammarParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(GrammarParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integer}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInteger(GrammarParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integer}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInteger(GrammarParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(GrammarParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(GrammarParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switch}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSwitch(GrammarParser.SwitchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switch}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSwitch(GrammarParser.SwitchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolTrue}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolTrue(GrammarParser.BoolTrueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolTrue}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolTrue(GrammarParser.BoolTrueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isVoid}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIsVoid(GrammarParser.IsVoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isVoid}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIsVoid(GrammarParser.IsVoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(GrammarParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessThan}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(GrammarParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code objId}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterObjId(GrammarParser.ObjIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code objId}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitObjId(GrammarParser.ObjIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lessEqual}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLessEqual(GrammarParser.LessEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lessEqual}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLessEqual(GrammarParser.LessEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code group}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGroup(GrammarParser.GroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code group}
	 * labeled alternative in {@link GrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGroup(GrammarParser.GroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#branch}.
	 * @param ctx the parse tree
	 */
	void enterBranch(GrammarParser.BranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#branch}.
	 * @param ctx the parse tree
	 */
	void exitBranch(GrammarParser.BranchContext ctx);
}