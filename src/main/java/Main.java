

import Lexer.GLexer;
import gen.GrammarParser;
import CoolParser.GParser;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World");

        try {
            String file = "complex-good-test.cl";

            GLexer lexer = new GLexer(file);
            lexer.PutTokensInFile(file + "-l");

           GParser parser = new GParser();
            parser.parse(lexer, file + "-p");
        }
        catch (Exception e){
            System.out.println("Error :" + e);
        }
    }
}
