import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        // Initialize a StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("  Hello World  ");
        
        // Set the TrimmerMatcher to trim leading and trailing spaces
        /* write */ tokenizer.setTrimmerMatcher(StrMatcher.trimMatcher());

        // Retrieve the next token after trimming
        /* read */ String token = tokenizer.nextToken();

        // Print the token
        System.out.println(token);
    }
}