import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello 'World'!");

        // Set a custom quote matcher to recognize single quotes
        /* write */ tokenizer.setQuoteMatcher(StrMatcher.singleQuoteMatcher());

        // Read the next token, which should be 'World' due to the quote matcher
        /* read */ String token = tokenizer.nextToken();

        // Output the token
        System.out.println(token);
    }
}