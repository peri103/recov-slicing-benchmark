import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello 'World'");

        // Set a custom quote matcher to recognize single quotes
        /* write */ tokenizer.setQuoteMatcher(StrMatcher.singleQuoteMatcher());

        // Read the next token, which should respect the quote matcher
        /* read */ String token = tokenizer.nextToken();
        
        // Print the token to verify the read operation
        System.out.println(token);
    }
}