import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("  Hello World  ");
        
        // Set the trimmer matcher to trim spaces from tokens
        /* write */ tokenizer.setTrimmerMatcher(StrMatcher.trimMatcher());
        
        // Read the first token after trimming spaces
        /* read */ String token = tokenizer.nextToken();
        
        // Print the token
        System.out.println(token);
    }
}