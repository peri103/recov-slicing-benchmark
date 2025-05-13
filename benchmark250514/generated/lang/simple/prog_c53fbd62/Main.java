import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        // Initialize StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello 'World'");

        // Set a quote matcher to handle quoted strings
        /* write */ tokenizer.setQuoteMatcher(StrMatcher.quoteMatcher());

        // Read the first token, which should respect the quote matcher
        /* read */ String token = tokenizer.nextToken();

        // Print the token
        System.out.println(token);
    }
}