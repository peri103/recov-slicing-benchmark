import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("apple,banana,orange");

        // Set a custom delimiter matcher using the write method
        /* write */ tokenizer.setDelimiterMatcher(StrMatcher.charMatcher(','));

        // Read the first token using the read method
        /* read */ String token = tokenizer.nextToken();

        // Print the token to verify the correct operation
        System.out.println(token);
    }
}