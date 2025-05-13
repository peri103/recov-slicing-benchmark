import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrTokenizer tokenizer = new StrTokenizer("  Hello World  ");
        
        // Set a trimmer matcher to trim spaces at the start and end of tokens
        /* write */ tokenizer.setTrimmerMatcher(StrMatcher.trimMatcher());
        
        // Additional operations to increase complexity
        ArrayList<String> tokensList = new ArrayList<>();
        
        // Another StrTokenizer instance for demonstration
        StrTokenizer anotherTokenizer = new StrTokenizer("Java,Programming,Language");
        anotherTokenizer.setDelimiterMatcher(StrMatcher.commaMatcher());
        
        // Adding tokens from anotherTokenizer to tokensList
        while (anotherTokenizer.hasNext()) {
            tokensList.add(anotherTokenizer.nextToken());
        }
        
        // Process tokensList
        for (String token : tokensList) {
            System.out.println("Token from anotherTokenizer: " + token);
        }
        
        // Read the first token after trimming spaces
        /* read */ String token = tokenizer.nextToken();
        
        System.out.println("Token from original tokenizer: " + token);
        
        // Further operations on tokensList
        tokensList.add("ExtraToken");
        
        // Print all tokens from tokensList
        for (String t : tokensList) {
            System.out.println("Final list token: " + t);
        }
    }
}