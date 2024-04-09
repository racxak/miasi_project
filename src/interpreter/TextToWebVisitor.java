package interpreter;

import interpreter.Translator;
import grammar.TextToWebBaseVisitor;
import grammar.TextToWebParser;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupDir;

import java.util.Stack;



public class TextToWebVisitor extends TextToWebBaseVisitor<ST> {
    // Tworzenie grupy szablonów z niestandardowymi delimiterami
    STGroup group = new STGroup('$', '$');

    int currentLevel = 1; // Początkowy poziom nagłówka (np. h1)
    Stack<Integer> levelStack = new Stack<>();


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
                if (child instanceof TextToWebParser.SectionContext) {

                    if (levelStack.isEmpty()){
                        levelStack.push(1);
                    }
                    else {
                        levelStack.push(levelStack.peek()+1);
                    }

                    ST section = visitSection((TextToWebParser.SectionContext) child);
                    template.add("content", section);
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


//    void visitSection(TextToWebParser.HeaderContext ctx) {
//        // Wygeneruj nagłówek dla bieżącej sekcji
//        String headerTag = "h" + currentLevel;
//        String sectionTitle = ctx.STRING().getText(); // Pobierz tytuł sekcji
//
//        // Wygeneruj kod HTML dla nagłówka
//        String htmlHeader = "<" + headerTag + ">" + sectionTitle + "</" + headerTag + ">";
//        System.out.println(htmlHeader);
//
//        // Zwiększ poziom dla zagnieżdżonych sekcji
//        currentLevel++;
//
//        // Przetwórz zagnieżdżone sekcje rekurencyjnie
//        for (TextToWebParser.HeaderContext subsection : ctx.level()) {
//            visitSection(subsection);
//        }
//
//        // Powrót do poprzedniego poziomu po zakończeniu zagnieżdżonych sekcji
//        currentLevel--;
//    }

    @Override
    public ST visitHeader(TextToWebParser.HeaderContext ctx) {
        ST headerTemplate = new ST(group, "<$level$$fontColor$>$headerContent$</$level$>");
        String headerContent = ctx.STRING().getText().replaceAll("^\"|\"$", "");
        headerTemplate.add("headerContent", headerContent);

        Integer level;
        //level
        if (ctx.level() != null && !ctx.level().isEmpty()) {
            ST levelTemplate = visitLevel(ctx.level().get(0)); //lista contextów?
            headerTemplate.add("level", levelTemplate);
        }
        else {

            level = levelStack.peek();

            headerTemplate.add("level", "h" + level);
        }

        if (ctx.color() != null && !ctx.color().isEmpty()) {
            ST colorTemplate = visitColor(ctx.color().get(0)); //lista contextów?
            ST colorFinalTemplate = new ST(group, "$space$style=\"$fontColor$;\"");
            colorFinalTemplate.add("space", " ");
            colorFinalTemplate.add("fontColor", colorTemplate);
            headerTemplate.add("fontColor", colorFinalTemplate);
        }else {
            headerTemplate.add("fontColor", "");
        }

        return headerTemplate;
    }

    @Override
    public ST visitLevel(TextToWebParser.LevelContext ctx) {
        ST levelTemplate = new ST(group, "h$level$");
        String headerLevel = ctx.STRING().getText().replaceAll("^\"|\"$", "");
        if (Integer.parseInt(headerLevel)>6 || Integer.parseInt(headerLevel)<1){
            //Domyślna wartoś dla niepoprawnego poziomu headera
            headerLevel = "2";
        }
        levelTemplate.add("level", headerLevel);
        return levelTemplate;
    }


    @Override
    public ST visitColor(TextToWebParser.ColorContext ctx) {
        ST fontColorTemplate = new ST(group, "color: $fontColor$");
        String fontColor = ctx.STRING().getText().replaceAll("^\"|\"$", "");
        if(!fontColor.isEmpty()){
            if (!fontColor.startsWith("#")) {
                Translator translator = new Translator();
                try {
                    fontColor = translator.translate("pl", "en", fontColor);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        fontColorTemplate.add("fontColor", fontColor);
        return fontColorTemplate;
    }

    @Override
    public ST visitSection(TextToWebParser.SectionContext ctx) {
        ST sectionTemplate = new ST(group, "\n<$styles$>\n$content$\n</div>\n");

        ST styles = new ST(group, "div$styles$");

        if ( ctx.sectionContent().children != null) {
            for (ParseTree child : ctx.sectionContent().children) {
                if (child instanceof TextToWebParser.HeaderContext) {
                    ST header = visitHeader((TextToWebParser.HeaderContext) child);
                    sectionTemplate.add("content", header);
                }
                if (child instanceof TextToWebParser.SectionContext) {

                    if (levelStack.isEmpty()){
                        levelStack.push(1);
                    }
                    else {
                        levelStack.push(levelStack.peek()+1);
                    }

                    ST section = visitSection((TextToWebParser.SectionContext) child);
                    sectionTemplate.add("content", section);
                }
                if (child instanceof TextToWebParser.TextContext) {
                    ST text = visitText((TextToWebParser.TextContext) child);
                    sectionTemplate.add("content", text);
                }
//                TODO: Nie działa kiedy w sekcji jest tyko style
                if (child instanceof TextToWebParser.BackgroundColorContext) {
                    ST backgroundColor = visitBackgroundColor((TextToWebParser.BackgroundColorContext) child);
                    styles.add("styles", "style=\"");
                    styles.add("styles", backgroundColor);
                    styles.add("styles", "\"");
                }else {
                    styles.add("styles", "");
                }
            }
            sectionTemplate.add("styles", styles);
        }

        if (!levelStack.isEmpty()){
            levelStack.pop();
        }
        return sectionTemplate;
    }

    @Override
    public ST visitBackgroundColor(TextToWebParser.BackgroundColorContext ctx) {
        ST backgroundColorTemplate = new ST(group, "background-color: $backgroundColor$;");
        String backgroundColor = ctx.STRING().getText().replaceAll("^\"|\"$", "");
        if(!backgroundColor.isEmpty()){
            if (!backgroundColor.startsWith("#")) {
//                TODO: Zemienić API - darmowy okres wykończony
                Translator translator = new Translator();
                try {
                    backgroundColor = translator.translate("pl", "en", backgroundColor);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        backgroundColorTemplate.add("backgroundColor", backgroundColor);
        return backgroundColorTemplate;
    }

    @Override
    public ST visitText(TextToWebParser.TextContext ctx) {
        ST textTemplate = new ST(group, "\n<$styles$>\n$text$\n</p>\n");

        ST styles = new ST(group, "p$styles$");
//        zmienić to roziwązanie kiedy pojawią się faktyczne style
        styles.add("styles","");
        textTemplate.add("styles",styles);

        String text = ctx.STRING().getText().replaceAll("^\"|\"$", "");
        textTemplate.add("text", text);

        if ( ctx.textAttributes() != null && ctx.textAttributes().children != null) {
            styles.add("styles", "style=\"");
            for (ParseTree child : ctx.textAttributes().children) {
                if (child instanceof TextToWebParser.BackgroundColorContext) {
                    ST backgroundColor = visitBackgroundColor((TextToWebParser.BackgroundColorContext) child);
                    styles.add("styles", backgroundColor);
                }
                if (child instanceof TextToWebParser.ColorContext) {
                    ST color = visitColor((TextToWebParser.ColorContext) child);
                    styles.add("styles", color);
                }
                if (child instanceof TextToWebParser.FontSizeContext) {
                    ST fontSize = visitFontSize((TextToWebParser.FontSizeContext) child);
                    styles.add("styles", fontSize);
                }

            }
            styles.add("styles", "\"");
        }
        return textTemplate;
    }

    @Override
    public ST visitFontSize(TextToWebParser.FontSizeContext ctx) {
        ST fontSizeTemplate = new ST(group, "font-size: $fontSize$;");
        String fontSize = ctx.STRING().getText().replaceAll("^\"|\"$", "");
        if(!fontSize.isEmpty()){
            if (!fontSize.endsWith("px")) {
                switch (fontSize) {
                    case "mala":
                        fontSize ="small";
                        break;
                    case "duza":
                        fontSize ="large";
                        break;
                    case "mniejsza":
                        fontSize ="smaller";
                        break;
                    case "wieksza":
                        fontSize ="larger";
                        break;
                    default:
                        fontSize ="medium";
                        break;
                }
            }
        }
        fontSizeTemplate.add("fontColor", fontSize);
        return fontSizeTemplate;
    }
}
