import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with some input
        StrTokenizer tokenizer = new StrTokenizer("Hello, World!");

        // Set the ignored matcher to ignore commas
        /* write */ tokenizer.setIgnoredMatcher(StrMatcher.charMatcher(','));

        // Read the next token
        /* read */ String token = tokenizer.nextToken();

        // Output the token
        System.out.println(token);
    }
}