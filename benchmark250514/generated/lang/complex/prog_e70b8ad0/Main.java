import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello 'World' and 'Java'");
        
        // Set quote matcher to recognize single quotes
        /* write */ tokenizer.setQuoteMatcher(StrMatcher.singleQuoteMatcher());

        // Additional unrelated code to increase complexity
        ArrayList<String> tokensList = new ArrayList<>();
        
        // Process all tokens and add them to the list
        while (tokenizer.hasNext()) {
            String token = tokenizer.nextToken();
            tokensList.add(token);
        }
        
        // Perform some operations on the list
        for (int i = 0; i < tokensList.size(); i++) {
            tokensList.set(i, tokensList.get(i).toUpperCase());
        }
        
        // Initialize another StrTokenizer for a different purpose
        StrTokenizer anotherTokenizer = new StrTokenizer("Complex 'Example' Code");
        anotherTokenizer.setQuoteMatcher(StrMatcher.doubleQuoteMatcher());

        // Read the next token which should respect the quote matcher
        /* read */ String firstToken = tokenizer.nextToken();

        // Output the original token
        System.out.println("First Token: " + firstToken);

        // Output the processed tokens
        for (String processedToken : tokensList) {
            System.out.println("Processed Token: " + processedToken);
        }
        
        // Use another tokenizer to demonstrate different string handling
        while (anotherTokenizer.hasNext()) {
            System.out.println("Another Tokenizer Token: " + anotherTokenizer.nextToken());
        }
    }
}