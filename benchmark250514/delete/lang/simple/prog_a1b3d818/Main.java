import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("apple,banana,orange");

        // Create a custom StrMatcher that matches commas
        StrMatcher matcher = StrMatcher.charMatcher(',');

        // Use setTokenMatcher to set the custom matcher
        /* write */ tokenizer.setTokenMatcher(matcher);

        // Read the first token using nextToken
        /* read */ String token = tokenizer.nextToken();

        // Output the first token
        System.out.println(token);
    }
}