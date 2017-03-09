// Generated from CalcGrammar.g4 by ANTLR 4.6

package antlr4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalcGrammarParser}.
 */
public interface CalcGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalcGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CalcGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalcGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CalcGrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numExp}
	 * labeled alternative in {@link CalcGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNumExp(CalcGrammarParser.NumExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numExp}
	 * labeled alternative in {@link CalcGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNumExp(CalcGrammarParser.NumExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExp}
	 * labeled alternative in {@link CalcGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIdExp(CalcGrammarParser.IdExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExp}
	 * labeled alternative in {@link CalcGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIdExp(CalcGrammarParser.IdExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExp}
	 * labeled alternative in {@link CalcGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAddExp(CalcGrammarParser.AddExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExp}
	 * labeled alternative in {@link CalcGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAddExp(CalcGrammarParser.AddExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExp}
	 * labeled alternative in {@link CalcGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSubExp(CalcGrammarParser.SubExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExp}
	 * labeled alternative in {@link CalcGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSubExp(CalcGrammarParser.SubExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExp}
	 * labeled alternative in {@link CalcGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMultExp(CalcGrammarParser.MultExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExp}
	 * labeled alternative in {@link CalcGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMultExp(CalcGrammarParser.MultExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divExp}
	 * labeled alternative in {@link CalcGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterDivExp(CalcGrammarParser.DivExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divExp}
	 * labeled alternative in {@link CalcGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitDivExp(CalcGrammarParser.DivExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code letExp}
	 * labeled alternative in {@link CalcGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLetExp(CalcGrammarParser.LetExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code letExp}
	 * labeled alternative in {@link CalcGrammarParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLetExp(CalcGrammarParser.LetExpContext ctx);
}