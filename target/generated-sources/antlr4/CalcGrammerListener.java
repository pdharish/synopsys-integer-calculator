// Generated from CalcGrammer.g4 by ANTLR 4.6

package antlr4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcGrammerParser}.
 */
public interface CalcGrammerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcGrammerParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CalcGrammerParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcGrammerParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CalcGrammerParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numExp}
	 * labeled alternative in {@link CalcGrammerParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNumExp(CalcGrammerParser.NumExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numExp}
	 * labeled alternative in {@link CalcGrammerParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNumExp(CalcGrammerParser.NumExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExp}
	 * labeled alternative in {@link CalcGrammerParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIdExp(CalcGrammerParser.IdExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExp}
	 * labeled alternative in {@link CalcGrammerParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIdExp(CalcGrammerParser.IdExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExp}
	 * labeled alternative in {@link CalcGrammerParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAddExp(CalcGrammerParser.AddExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExp}
	 * labeled alternative in {@link CalcGrammerParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAddExp(CalcGrammerParser.AddExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExp}
	 * labeled alternative in {@link CalcGrammerParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSubExp(CalcGrammerParser.SubExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExp}
	 * labeled alternative in {@link CalcGrammerParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSubExp(CalcGrammerParser.SubExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExp}
	 * labeled alternative in {@link CalcGrammerParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMultExp(CalcGrammerParser.MultExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExp}
	 * labeled alternative in {@link CalcGrammerParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMultExp(CalcGrammerParser.MultExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divExp}
	 * labeled alternative in {@link CalcGrammerParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterDivExp(CalcGrammerParser.DivExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divExp}
	 * labeled alternative in {@link CalcGrammerParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitDivExp(CalcGrammerParser.DivExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letExp}
	 * labeled alternative in {@link CalcGrammerParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLetExp(CalcGrammerParser.LetExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letExp}
	 * labeled alternative in {@link CalcGrammerParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLetExp(CalcGrammerParser.LetExpContext ctx);
}