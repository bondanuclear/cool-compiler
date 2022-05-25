package CoolParser;


import Lexer.GLexer;
import gen.GrammarParser;

import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GParser {
    public GrammarParser grammarParser;
    public void parse(GLexer lexer, String file)
    {
        grammarParser = new GrammarParser(lexer.tokensStream);
        grammarParser.removeErrorListeners();
        grammarParser.addErrorListener(new ThrowingErrorListener());
        ParseTree Tree = grammarParser.program();
        String tree = Tree.toStringTree(grammarParser);
        System.out.println(tree);
        try
        {
            PutTreeInFile(file, tree);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void PutTreeInFile(String file, String tree) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write(tree);
        bufferedWriter.close();
    }
}
