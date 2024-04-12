// Generated from C:/Users/user/IntelliJIDEAProjects/Antlr/Miasi_Project/src/grammar/TextToWeb.g4 by ANTLR 4.13.1
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TextToWebParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TextToWebVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TextToWebParser#page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage(TextToWebParser.PageContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToWebParser#pageContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPageContent(TextToWebParser.PageContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToWebParser#theme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTheme(TextToWebParser.ThemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToWebParser#font}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFont(TextToWebParser.FontContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToWebParser#backgroundColor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackgroundColor(TextToWebParser.BackgroundColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToWebParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(TextToWebParser.SectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToWebParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(TextToWebParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToWebParser#sectionContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSectionContent(TextToWebParser.SectionContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToWebParser#alignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlignment(TextToWebParser.AlignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToWebParser#textAlignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextAlignment(TextToWebParser.TextAlignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToWebParser#textDecoration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextDecoration(TextToWebParser.TextDecorationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToWebParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(TextToWebParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToWebParser#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(TextToWebParser.ImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToWebParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(TextToWebParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToWebParser#listItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListItem(TextToWebParser.ListItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToWebParser#textAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextAttributes(TextToWebParser.TextAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToWebParser#imageAttributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageAttributes(TextToWebParser.ImageAttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToWebParser#fontSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontSize(TextToWebParser.FontSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToWebParser#width}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth(TextToWebParser.WidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToWebParser#height}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeight(TextToWebParser.HeightContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToWebParser#level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevel(TextToWebParser.LevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToWebParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(TextToWebParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToWebParser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource(TextToWebParser.SourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToWebParser#margin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMargin(TextToWebParser.MarginContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToWebParser#padding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPadding(TextToWebParser.PaddingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TextToWebParser#borderRadius}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBorderRadius(TextToWebParser.BorderRadiusContext ctx);
}