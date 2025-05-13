import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        // Initialize a StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("apple, banana, cherry");

        // Create a custom StrMatcher that matches commas
        StrMatcher commaMatcher = StrMatcher.commaMatcher();

        // Use the setTokenMatcher method to set the custom matcher
        /* write */ tokenizer.setTokenMatcher(commaMatcher);

        // Read the first token using the nextToken method
        /* read */ String firstToken = tokenizer.nextToken();

        // Print the first token
        System.out.println(firstToken);
    }
}