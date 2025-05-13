import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        String input = "  Hello  World  ";
        StrTokenizer tokenizer = new StrTokenizer(input);
        
        // Set a trimmer matcher to trim spaces
        StrMatcher trimmerMatcher = StrMatcher.trimMatcher();
        /* write */ tokenizer.setTrimmerMatcher(trimmerMatcher);
        
        // Read the first token after trimming
        /* read */ String token = tokenizer.nextToken();
        System.out.println(token);
    }
}