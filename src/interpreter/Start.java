package interpreter;

import grammar.TextToWebLexer;
import grammar.TextToWebParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stringtemplate.v4.ST;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class Start {
    public static void saveResultToHtml(String content, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, false))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CharStream input = null;
        try {
            input = CharStreams.fromFileName("input.TextToWeb"); // Nazwa pliku wejściowego
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Utworzenie lexer'a i parser'a
        TextToWebLexer lexer = new TextToWebLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TextToWebParser parser = new TextToWebParser(tokens);

        // Rozpoczęcie parsowania od reguły głównej page
        ParseTree tree = parser.page();

        // Utworzenie i uruchomienie visitor'a do generowania HTML/CSS
        TextToWebVisitor visitor = new TextToWebVisitor();
        ST result = visitor.visit(tree);

        // Wyświetlenie wygenerowanego kodu HTML/CSS
        System.out.println(result.render());

        //Zapisywanie do pliku
        String htmlContent = result.render();
        String filePath = "WebPage.html";
        saveResultToHtml(htmlContent, filePath);

    }
}