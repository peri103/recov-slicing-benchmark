import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        // Initialize StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("  Hello World  ");
        
        // Initialize another StrTokenizer with a different string
        StrTokenizer tokenizer2 = new StrTokenizer("  Foo Bar Baz  ");
        
        // Set a trimmer matcher to trim whitespace on the first tokenizer
        /* write */ tokenizer.setTrimmerMatcher(StrMatcher.trimMatcher());

        // Perform some unrelated operations using tokenizer2
        tokenizer2.setDelimiterMatcher(StrMatcher.charSetMatcher(' '));
        while (tokenizer2.hasNext()) {
            String token2 = tokenizer2.nextToken();
            System.out.println("Token from tokenizer2: " + token2);
        }

        // Add some complex logic
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
            System.out.println("Intermediate sum: " + sum);
        }
        
        // Read the next token after trimming on the first tokenizer
        /* read */ String token = tokenizer.nextToken();
        
        // Output the token
        System.out.println("Token from tokenizer: " + token);

        // More complex operations
        StrTokenizer tokenizer3 = new StrTokenizer("  Alpha Beta Gamma  ");
        tokenizer3.setDelimiterMatcher(StrMatcher.charSetMatcher(' '));
        while (tokenizer3.hasNext()) {
            String token3 = tokenizer3.nextToken();
            System.out.println("Token from tokenizer3: " + token3);
        }
    }
}