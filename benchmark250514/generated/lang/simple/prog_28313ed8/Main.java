import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        // Initialize a StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello, World!");

        // Create a StrMatcher that matches commas
        StrMatcher commaMatcher = StrMatcher.charMatcher(',');

        // Use the write method to set the ignored matcher to ignore commas
        /* write */ tokenizer.setIgnoredMatcher(commaMatcher);

        // Use the read method to get the next token, which should be "Hello"
        /* read */ String token = tokenizer.nextToken();
        
        // Output the token
        System.out.println(token);
    }
}