import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("apple,banana,orange");

        // Set a custom token matcher to split tokens by commas
        /* write */ tokenizer.setTokenMatcher(StrMatcher.commaMatcher());

        // Read the first token
        /* read */ String firstToken = tokenizer.nextToken();

        // Print the first token
        System.out.println(firstToken);
    }
}