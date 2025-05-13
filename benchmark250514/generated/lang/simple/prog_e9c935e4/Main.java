import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        String input = "Hello, World! This is a test.";
        StrTokenizer tokenizer = new StrTokenizer(input);
        
        // Set the ignored matcher to ignore spaces
        /* write */ tokenizer.setIgnoredMatcher(StrMatcher.spaceMatcher());
        
        // Read the first token
        /* read */ String token = tokenizer.nextToken();
        System.out.println(token);
    }
}