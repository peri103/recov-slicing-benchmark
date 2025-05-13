import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello 'world'!");

        // Set the quote matcher to handle quoted text
        /* write */ tokenizer.setQuoteMatcher(StrMatcher.quoteMatcher());

        // Read the next token from the tokenizer
        /* read */ String token = tokenizer.nextToken();

        // Print the token to verify the output
        System.out.println(token);
    }
}