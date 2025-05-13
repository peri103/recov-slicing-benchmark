import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        StrTokenizer tokenizer = new StrTokenizer("Hello, World!");

        // Set a matcher to ignore commas
        /* write */ tokenizer.setIgnoredMatcher(StrMatcher.charMatcher(','));

        // Read the next token
        /* read */ String token = tokenizer.nextToken();
        System.out.println(token);
    }
}