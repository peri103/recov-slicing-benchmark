import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("apple,banana,orange");

        // Set the delimiter to comma using setDelimiterMatcher
        /* write */ tokenizer.setDelimiterMatcher(StrMatcher.commaMatcher());

        // Read the first token using nextToken
        /* read */ String token = tokenizer.nextToken();
        
        // Print the token to verify the result
        System.out.println(token);
    }
}