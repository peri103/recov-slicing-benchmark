import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        // Initialize a StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello 'world'!");

        // Set the quote matcher to handle single quotes
        /* write */ tokenizer.setQuoteMatcher(StrMatcher.quoteMatcher());

        // Read the next token, which should respect the quote matcher
        /* read */ String token = tokenizer.nextToken();

        // Output the token
        System.out.println(token);
    }
}