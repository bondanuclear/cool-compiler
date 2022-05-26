package Lexer;
import gen.GrammarLexer;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class GLexer {
    private ArrayList<String> tokenResult;
    private final int NUM_OF_LETTERS = 26;

    public CommonTokenStream tokensStream;

    private List<Token> tokens;



    private GrammarLexer lexer;

    public GLexer(String fileName) {
        CharStream charStream;
        try {
            charStream = CharStreams.fromFileName(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        lexer = new GrammarLexer(charStream);
        tokensStream = new CommonTokenStream(lexer);
        tokensStream.fill();
        tokens = tokensStream.getTokens();
        for(int i = 0; i < tokens.size(); i++)
        {
            System.out.println(tokens.get(i));
            System.out.println("Token get type: ");
            System.out.println(tokens.get(i).getType());
            System.out.println("Token get line: ");
            System.out.println(tokens.get(i).getLine());
        }
        Tokenizer();

    }
    // correct rule names.
    // the alphabet was written into getRuleName
    // and it gets in the way of the correct working of program
    // lets ignore it then.
    private String[] correctRuleNames()
    {
        String[] incorrectRuleName = lexer.getRuleNames();

        //ArrayList<String> correctNames = new ArrayList<>();
        // subtract the number of redundant letters :)
        String[] correctNames = new String[incorrectRuleName.length-NUM_OF_LETTERS];
        //System.out.println(incorrectRuleName.length);
        for(int i = 0; i < incorrectRuleName.length-NUM_OF_LETTERS; i++)
        {
            correctNames[i] = incorrectRuleName[i+NUM_OF_LETTERS];
            // System.out.println("Correct name " + correctNames[i] + " Incorrect name " + incorrectRuleName[i+26]);
        }

        //  System.out.println(correctNames.length);
//        for(int i = 0; i < correctNames.length; i++)
//        {
//            System.out.println(correctNames[i]);
//        }
        return correctNames;
    }
    private void Tokenizer() {
        // result list of out tokens
        tokenResult = new ArrayList<>();
        // array of our corrected rule names (without alphabet)
        String[] ruleNames = correctRuleNames();
//        for(int i = 0; i < ruleNames.length; i++)
//        {
//            System.out.println(ruleNames[i]);
//        }
        for (var token : tokens) {
            if (token.getType() > 0) {
                // add error to error list
                if (!ruleNames[token.getType() - 1].equals("ERROR"))
                {
                    tokenResult.add(Integer.toString(token.getLine()));
                    //System.out.println("Want to add " + ruleNames[token.getType() - 1]);
                    tokenResult.add(ruleNames[token.getType() - 1]);
                    // When program finds OBJECTID or NUM it will add their values as well
                    // TO DO same for TYPEID
                    if (ruleNames[token.getType() - 1].equals("OBJECTID"))
                        tokenResult.add(token.getText());
                    else if(ruleNames[token.getType() - 1].equals("NUM"))
                        tokenResult.add(token.getText());
                } else if (ruleNames[token.getType()-1].equals("ERROR"))
                {
                    System.out.println("Error occurred at " + token.getLine());
                }
            }
        }
    }
    public void PutTokensInFile(String resultFile) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(resultFile));
            for (String token : tokenResult) {
                writer.write(token + "\n");
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
