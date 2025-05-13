import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        // Create a StrTokenizer instance
        StrTokenizer tokenizer = new StrTokenizer("apple,banana,orange", ',');

        // Create a custom StrMatcher to match tokens
        StrMatcher matcher = StrMatcher.charSetMatcher("aeiou");

        // Set the custom token matcher to the tokenizer
        /* write */ tokenizer.setTokenMatcher(matcher);

        // Read the next token using the tokenizer
        /* read */ String token = tokenizer.nextToken();

        // Print the token
        System.out.println(token);
    }
}