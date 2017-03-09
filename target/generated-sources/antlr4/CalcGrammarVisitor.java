// Generated from CalcGrammar.g4 by ANTLR 4.6

package antlr4;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalcGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalcGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalcGrammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CalcGrammarParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numExp}
	 * labeled alternative in {@link CalcGrammarParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExp(CalcGrammarParser.NumExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExp}
	 * labeled alternative in {@link CalcGrammarParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExp(CalcGrammarParser.IdExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExp}
	 * labeled alternative in {@link CalcGrammarParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExp(CalcGrammarParser.AddExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subExp}
	 * labeled alternative in {@link CalcGrammarParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExp(CalcGrammarParser.SubExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExp}
	 * labeled alternative in {@link CalcGrammarParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExp(CalcGrammarParser.MultExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divExp}
	 * labeled alternative in {@link CalcGrammarParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExp(CalcGrammarParser.DivExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letExp}
	 * labeled alternative in {@link CalcGrammarParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetExp(CalcGrammarParser.LetExpContext ctx);
}