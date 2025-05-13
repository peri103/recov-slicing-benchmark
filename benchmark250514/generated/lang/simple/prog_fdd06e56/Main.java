import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with some data
        StrTokenizer tokenizer = new StrTokenizer("  Hello World  ");
        
        // Set a trimmer matcher to trim spaces
        /* write */ tokenizer.setTrimmerMatcher(StrMatcher.trimMatcher());
        
        // Read the next token
        /* read */ String token = tokenizer.nextToken();
        
        // Output the read token
        System.out.println(token);
    }
}