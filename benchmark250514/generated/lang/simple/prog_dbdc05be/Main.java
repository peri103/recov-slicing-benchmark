import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        StrTokenizer tokenizer = new StrTokenizer("Hello,World");
        
        // Setting a delimiter matcher to split tokens by comma
        /* write */ tokenizer.setDelimiterMatcher(StrMatcher.charMatcher(','));
        
        // Reading the next token after applying the delimiter matcher
        /* read */ String token = tokenizer.nextToken();
        
        System.out.println(token); // Output should be "Hello"
    }
}