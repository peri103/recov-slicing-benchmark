import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        // Initialize StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello,World");

        // Set the delimiter matcher to split tokens by comma
        /* write */ tokenizer.setDelimiterMatcher(StrMatcher.charMatcher(','));

        // Read the next token, which should be "Hello"
        /* read */ String token = tokenizer.nextToken();
        
        // Output the token
        System.out.println(token);
    }
}