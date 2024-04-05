package interpreter;

import grammar.TextToWebBaseVisitor;
import grammar.TextToWebParser;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupDir;

public class TextToWebVisitor extends TextToWebBaseVisitor<ST> {
    // Tworzenie grupy szablonów z niestandardowymi delimiterami
    STGroup group = new STGroup('$', '$');

    @Override
    public ST visitPage(TextToWebParser.PageContext ctx) {
        ST template = new ST(group, "<!DOCTYPE html>\n<html>\n<head>\n<title>$title$</title>\n<style> \nbody{\n $themeStyles$ \n $fontStyles$ \n} \n </style>\n</head>\n<body>$content$</body>\n</html>");

        String defaultThemeStyles = "background-color: #333; \n color: #f0f0f0; "; // Domyślny ciemny motyw
        String defaultFontStyles = "font-family: 'Arial', sans-serif; "; // Domyślna czcionka

        String themeStyles = defaultThemeStyles;
        String fontStyles = defaultFontStyles;

        String pageTitle = ctx.STRING().getText().replaceAll("^\"|\"$", "");
        template.add("title", pageTitle);

        if ( ctx.pageContent().children != null) {
            for (ParseTree child : ctx.pageContent().children) {
                if (child instanceof TextToWebParser.ThemeContext) {
                    ST themeTemplate = visitTheme((TextToWebParser.ThemeContext) child);
                    themeStyles = themeTemplate.render();
                }

                if (child instanceof TextToWebParser.FontContext) {
                    ST fontTemplate = visitFont((TextToWebParser.FontContext) child);
                    fontStyles = fontTemplate.render();
                }
                if (child instanceof TextToWebParser.HeaderContext) {
                    ST header = visitHeader((TextToWebParser.HeaderContext) child);
                    template.add("content", header);
                }
            }
        }

        template.add("themeStyles", themeStyles);
        template.add("fontStyles", fontStyles);

        return template;
    }


    @Override
    public ST visitTheme(TextToWebParser.ThemeContext ctx) {
        ST themeTemplate = new ST(group, "background-color: $bgColor$;  \ncolor: $textColor$;");
        String theme = ctx.STRING().getText().replaceAll("^\"|\"$", "");
        if ("jasny".equals(theme)) {
            themeTemplate.add("bgColor", "#f0f0f0");
            themeTemplate.add("textColor", "#333");
        } else {
            themeTemplate.add("bgColor", "#333");
            themeTemplate.add("textColor", "#f0f0f0");
        }
        return themeTemplate;
    }

    @Override
    public ST visitFont(TextToWebParser.FontContext ctx) {
        ST fontTemplate = new ST(group, "font-family: '$fontName$';");
        String fontName = ctx.STRING().getText().replaceAll("^\"|\"$", "");
            fontTemplate.add("fontName", fontName);
        return fontTemplate;
    }

    @Override
    public ST visitHeader(TextToWebParser.HeaderContext ctx) {
        ST headerTemplate = new ST(group, "<$level$>$headerContent$</$level$>");
        String headerContent = ctx.STRING().getText().replaceAll("^\"|\"$", "");
        headerTemplate.add("headerContent", headerContent);

        //level
        if (ctx.level() != null && !ctx.level().isEmpty()) {
            ST levelTemplate = visitLevel(ctx.level().get(0)); //lista contextów?
            headerTemplate.add("level", levelTemplate);
        }
        else {
            headerTemplate.add("level", "h2");
        }
        return headerTemplate;
    }

    @Override
    public ST visitLevel(TextToWebParser.LevelContext ctx) {
        ST levelTemplate = new ST(group, "h$level$");
        String headerLevel = ctx.STRING().getText().replaceAll("^\"|\"$", "");
        levelTemplate.add("level", headerLevel);
        return levelTemplate;
    }
}
