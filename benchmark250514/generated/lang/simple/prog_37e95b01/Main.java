import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello,World");

        // Set the delimiter matcher to split tokens based on comma
        /* write */ tokenizer.setDelimiterMatcher(StrMatcher.charMatcher(','));

        // Read the first token using the nextToken method
        /* read */ String token = tokenizer.nextToken();

        // Print the token
        System.out.println(token);
    }
}