import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String input = "  Hello  World  ";
        StrTokenizer tokenizer = new StrTokenizer(input);
        
        // Set a trimmer matcher to trim spaces
        StrMatcher trimmerMatcher = StrMatcher.trimMatcher();
        /* write */ tokenizer.setTrimmerMatcher(trimmerMatcher);
        
        // Additional complexity: manipulate a list of tokens
        ArrayList<String> tokensList = new ArrayList<>();
        
        // Add more tokens to the list
        StrTokenizer additionalTokenizer = new StrTokenizer("Extra Tokens");
        while (additionalTokenizer.hasNext()) {
            tokensList.add(additionalTokenizer.nextToken());
        }
        
        // Perform some operations on the tokens list
        for (int i = 0; i < tokensList.size(); i++) {
            tokensList.set(i, tokensList.get(i).toUpperCase());
        }
        
        // Further manipulate the list
        tokensList.add("NEW_TOKEN");
        
        // Read the first token after trimming
        /* read */ String token = tokenizer.nextToken();
        System.out.println(token);
        
        // Print all tokens in the list
        for (String t : tokensList) {
            System.out.println(t);
        }
        
        // Perform a final operation on tokensList
        tokensList.remove("NEW_TOKEN");
        
        // Print the final state of tokensList
        System.out.println("Final Tokens List: " + tokensList);
    }
}