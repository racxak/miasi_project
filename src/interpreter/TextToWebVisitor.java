package interpreter;

import grammar.TextToWebBaseVisitor;
import grammar.TextToWebParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;

import java.util.Stack;



public class TextToWebVisitor extends TextToWebBaseVisitor<ST> {
    // Tworzenie grupy szablonów z niestandardowymi delimiterami
    STGroup group = new STGroup('$', '$');

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
        ST styles2 = new ST(group, "$space$style=\"$styles$\"");
        styles2.add("space"," ");
        if ( ctx.sectionContent().children != null) {
            for (ParseTree child : ctx.sectionContent().children) {
                if (child instanceof TextToWebParser.HeaderContext) {
                    ST header = visitHeader((TextToWebParser.HeaderContext) child);
                    sectionTemplate.add("content", header);
                }else
                if (child instanceof TextToWebParser.SectionContext) {

                    if (levelStack.isEmpty()){
                        levelStack.push(1);
                    }
                    else {
                        levelStack.push(levelStack.peek()+1);
                    }

                    ST section = visitSection((TextToWebParser.SectionContext) child);
                    sectionTemplate.add("content", section);
                }else
                if (child instanceof TextToWebParser.TextContext) {
                    ST text = visitText((TextToWebParser.TextContext) child);
                    sectionTemplate.add("content", text);
            }else
            if (child instanceof TextToWebParser.ImageContext) {
                ST image = visitImage((TextToWebParser.ImageContext) child);
                sectionTemplate.add("content", image);}
            else{
                    styles.add("content", "");
                }

                if (child instanceof TextToWebParser.BackgroundColorContext) {
                    ST backgroundColor = visitBackgroundColor((TextToWebParser.BackgroundColorContext) child);
                    styles2.add("styles", backgroundColor);
                } else if (child instanceof TextToWebParser.WidthContext) {
                    ST width = visitWidth((TextToWebParser.WidthContext) child);
                    styles2.add("styles", width);
                }  else if (child instanceof TextToWebParser.HeightContext) {
                    ST height = visitHeight((TextToWebParser.HeightContext) child);
                    styles2.add("styles", height);
                } else {
                    styles2.add("styles", "");

                    }
                }
                styles.add("styles",styles2);
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

        String text = ctx.STRING().getText().replaceAll("^\"|\"$", "");
        textTemplate.add("text", text);
        if ( ctx.textAttributes() != null && ctx.textAttributes().children != null) {
            styles.add("styles", " style=\"");
            for (ParseTree child : ctx.textAttributes().children) {
                if (child instanceof TextToWebParser.BackgroundColorContext) {
                    ST backgroundColor = visitBackgroundColor((TextToWebParser.BackgroundColorContext) child);
                    styles.add("styles", backgroundColor);
                } else if (child instanceof TextToWebParser.ColorContext) {
                    ST color = visitColor((TextToWebParser.ColorContext) child);
                    styles.add("styles", color);
                } else if (child instanceof TextToWebParser.FontSizeContext) {
                    ST fontSize = visitFontSize((TextToWebParser.FontSizeContext) child);
                    styles.add("styles", fontSize);
                }
                else if (child instanceof TextToWebParser.WidthContext) {
                    ST width = visitWidth((TextToWebParser.WidthContext) child);
                    styles.add("styles", width);
                }  else if (child instanceof TextToWebParser.HeightContext) {
                    ST height = visitHeight((TextToWebParser.HeightContext) child);
                    styles.add("styles", height);}
                else if (child instanceof TextToWebParser.TextAlignmentContext) {
                    ST textAlignment = visitTextAlignment((TextToWebParser.TextAlignmentContext) child);
                    styles.add("styles", textAlignment);}
                else if (child instanceof TextToWebParser.TextDecorationContext) {
                    ST textDecoration = visitTextDecoration((TextToWebParser.TextDecorationContext) child);
                    styles.add("styles", textDecoration);}
                else {
                    styles.add("styles", "");
                }
            }
            styles.add("styles", "\"");
        }else {
            styles.add("styles", "");
        }
        textTemplate.add("styles", styles);

        return textTemplate;
    }

    @Override
    public ST visitFontSize(TextToWebParser.FontSizeContext ctx) {
        ST fontSizeTemplate = new ST(group, "font-size: $fontSize$;");
        String fontSize = ctx.STRING().getText().replaceAll("^\"|\"$", "");
        if(!fontSize.isEmpty()){
            if (!fontSize.endsWith("px")) {
                fontSize = switch (fontSize) {
                    case "mala" -> "small";
                    case "duza" -> "large";
                    case "mniejsza" -> "smaller";
                    case "wieksza" -> "larger";
                    default -> "medium";
                };
            }
        }
        fontSizeTemplate.add("fontColor", fontSize);
        return fontSizeTemplate;
    }

    @Override
    public ST visitWidth(TextToWebParser.WidthContext ctx) {
        ST widthTemplate = new ST(group, "width: $width$;");
        String width = ctx.STRING().getText().replaceAll("^\"|\"$", "");

        widthTemplate.add("width", width);
        return widthTemplate;
    }

    @Override
    public ST visitHeight(TextToWebParser.HeightContext ctx) {
        ST heightTemplate = new ST(group, "height: $height$;");
        String height = ctx.STRING().getText().replaceAll("^\"|\"$", "");

        heightTemplate.add("height", height);
        return heightTemplate;
    }

    @Override
    public ST visitImage(TextToWebParser.ImageContext ctx) {
        ST imageTemplate = new ST(group, "<$tag$ alt=\"$alt$\" $stylesImage$>");
        String alt = ctx.STRING().getText().replaceAll("^\"|\"$", "");
        imageTemplate.add("alt",alt);

        ST tag = new ST(group, "img$source$");
        ST stylesImage = new ST(group, "style=\" $imgStyle$\"");

        if ( ctx.imageAttributes().children != null) {
            for (ParseTree child : ctx.imageAttributes().children) {
                if (child instanceof TextToWebParser.SourceContext) {
                    ST source = visitSource((TextToWebParser.SourceContext) child);
                    tag.add("source", source);
                }else{
                    tag.add("source", "src=\"../noSource.jpg\"");
                }
                if (child instanceof TextToWebParser.HeaderContext) {
                    ST height = visitHeight((TextToWebParser.HeightContext) child);
                    stylesImage.add("imgStyle", height);
                }
                if (child instanceof TextToWebParser.WidthContext) {
                    ST width = visitWidth((TextToWebParser.WidthContext) child);
                    stylesImage.add("imgStyle", width);
                }
            }
        }else {
            tag.add("source", " src=\"../noSource.jpg\"");
        }
        imageTemplate.add("tag",tag);
        imageTemplate.add("stylesImage",stylesImage);

        return imageTemplate;
    }
    @Override
    public ST visitSource(TextToWebParser.SourceContext ctx) {
        ST sourceTemplate = new ST(group, "$space$src=\"$source$\" ");
        sourceTemplate.add("space"," ");
        String source = ctx.STRING().getText().replaceAll("^\"|\"$", "");

        sourceTemplate.add("source", source);
        return sourceTemplate;
    }

    @Override
    public ST visitTextAlignment(TextToWebParser.TextAlignmentContext ctx) {
        ST alignmentTemplate = new ST(group, "text-align: $alignment$;");

        String alignmentValue = ctx.STRING().getText().replaceAll("^\"|\"$", "");
        String alignment = switch (alignmentValue.toLowerCase()) {
            case "srodek" -> "center";
            case "prawo" -> "right";
            case "justify" -> "justify";
            default -> "left";
        }; // Domyślne wyrównanie, na wypadek gdyby nie zostało określone w kontekście

        alignmentTemplate.add("alignment", alignment);
        return alignmentTemplate;
    }

    @Override
    public ST visitTextDecoration(TextToWebParser.TextDecorationContext ctx) {
        ST decorationTemplate = new ST(group, "text-decoration: $decoration$; ");

        String decorationValue = ctx.STRING().getText().replaceAll("^\"|\"$", "");
        String decoration = "none";

        switch (decorationValue.toLowerCase()) {
            case "podkreslenie" -> decoration = "underline";
            case "przekreslenie" -> decoration = "line-through";
            case "nadkreslenie" -> decoration = "overline";
            default -> decoration = "none";

        }

        decorationTemplate.add("decoration", decoration);
        return decorationTemplate;
    }

}
