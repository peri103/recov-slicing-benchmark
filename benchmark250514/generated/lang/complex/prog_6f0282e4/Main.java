import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello 'World' and 'Universe'");
        
        // Additional StrTokenizer with different settings
        StrTokenizer tokenizer2 = new StrTokenizer("Java,Python,C++", ',');
        tokenizer2.setIgnoreEmptyTokens(true);
        tokenizer2.setTrimmerMatcher(StrMatcher.trimMatcher());

        // Process tokens from tokenizer2
        while (tokenizer2.hasNext()) {
            System.out.println("Token from tokenizer2: " + tokenizer2.nextToken());
        }

        // Set up a quote matcher to handle quoted text
        StrMatcher quoteMatcher = StrMatcher.quoteMatcher();
        /* write */ tokenizer.setQuoteMatcher(quoteMatcher);

        // Additional operations
        StrTokenizer tokenizer3 = new StrTokenizer("One|Two|Three", '|');
        tokenizer3.setEmptyTokenAsNull(true);
        tokenizer3.setDelimiterMatcher(StrMatcher.charMatcher('|'));

        // Process tokens from tokenizer3
        while (tokenizer3.hasNext()) {
            System.out.println("Token from tokenizer3: " + tokenizer3.nextToken());
        }

        // Read the next token from the original tokenizer, which should respect the quote matcher
        /* read */ String token = tokenizer.nextToken();
        System.out.println("Token from tokenizer: " + token);

        // More complex operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // String manipulation
        String str = "Apache Commons Lang";
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + reversedStr);
    }
}