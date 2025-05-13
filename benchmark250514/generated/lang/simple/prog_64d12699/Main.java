import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        StrTokenizer tokenizer = new StrTokenizer("Hello,World");
        
        // Set the delimiter to a comma
        StrMatcher delimiterMatcher = StrMatcher.charMatcher(',');
        /* write */ tokenizer.setDelimiterMatcher(delimiterMatcher);
        
        // Read the next token, which should be "Hello"
        /* read */ String token = tokenizer.nextToken();
        
        System.out.println(token);
    }
}