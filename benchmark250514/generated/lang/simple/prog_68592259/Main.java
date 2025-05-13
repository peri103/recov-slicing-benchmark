import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        // Initialize the tokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("  Hello, World!  ");
        
        // Use setTrimmerMatcher to trim the whitespace characters
        /* write */ tokenizer.setTrimmerMatcher(StrMatcher.trimMatcher());
        
        // Read the first token after trimming
        /* read */ String token = tokenizer.nextToken();
        
        // Print the token
        System.out.println(token);
    }
}