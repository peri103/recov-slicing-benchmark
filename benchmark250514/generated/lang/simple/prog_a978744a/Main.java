import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        StrTokenizer tokenizer = new StrTokenizer("  Hello World  ");
        
        // Set a trimmer matcher to trim spaces at the start and end of tokens
        /* write */ tokenizer.setTrimmerMatcher(StrMatcher.trimMatcher());
        
        // Read the first token after trimming spaces
        /* read */ String token = tokenizer.nextToken();
        
        System.out.println(token);
    }
}