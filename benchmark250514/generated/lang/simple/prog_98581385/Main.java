import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        // Initialize StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("  Hello World  ");

        // Set a trimmer matcher to trim whitespace
        /* write */ tokenizer.setTrimmerMatcher(StrMatcher.trimMatcher());

        // Read the next token after trimming
        /* read */ String token = tokenizer.nextToken();

        // Output the token
        System.out.println(token);
    }
}