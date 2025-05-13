import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello 'World'");

        // Set up a quote matcher to handle quoted text
        StrMatcher quoteMatcher = StrMatcher.quoteMatcher();
        /* write */ tokenizer.setQuoteMatcher(quoteMatcher);

        // Read the next token, which should respect the quote matcher
        /* read */ String token = tokenizer.nextToken();
        System.out.println(token);
    }
}