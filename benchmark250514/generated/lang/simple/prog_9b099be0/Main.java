import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("apple,banana,orange");

        // Set a custom delimiter matcher to split tokens by comma
        /* write */ tokenizer.setDelimiterMatcher(StrMatcher.charMatcher(','));

        // Read the first token using the nextToken method
        /* read */ String firstToken = tokenizer.nextToken();

        // Print the first token
        System.out.println(firstToken);
    }
}