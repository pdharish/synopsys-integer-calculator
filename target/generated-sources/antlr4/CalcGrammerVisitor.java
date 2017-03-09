// Generated from CalcGrammer.g4 by ANTLR 4.6

package antlr4;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalcGrammerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalcGrammerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalcGrammerParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CalcGrammerParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numExp}
	 * labeled alternative in {@link CalcGrammerParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumExp(CalcGrammerParser.NumExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExp}
	 * labeled alternative in {@link CalcGrammerParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExp(CalcGrammerParser.IdExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExp}
	 * labeled alternative in {@link CalcGrammerParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExp(CalcGrammerParser.AddExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subExp}
	 * labeled alternative in {@link CalcGrammerParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExp(CalcGrammerParser.SubExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExp}
	 * labeled alternative in {@link CalcGrammerParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExp(CalcGrammerParser.MultExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divExp}
	 * labeled alternative in {@link CalcGrammerParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExp(CalcGrammerParser.DivExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code letExp}
	 * labeled alternative in {@link CalcGrammerParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetExp(CalcGrammerParser.LetExpContext ctx);
}