import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello 'World' 'Java' 'Programming'");
        
        // Set the quote character to single quote
        /* write */ tokenizer.setQuoteChar('\'');

        // Initialize another StrTokenizer for a different string
        StrTokenizer tokenizer2 = new StrTokenizer("Complex 'Code' 'Example'");
        tokenizer2.setQuoteChar('\'');

        // Process tokens from the second tokenizer
        while (tokenizer2.hasNext()) {
            String token2 = tokenizer2.nextToken();
            System.out.println("Token from tokenizer2: " + token2);
        }

        // Perform some unrelated operations to make the program more complex
        String sampleString = "Apache Commons Lang";
        String reversedString = StringUtils.reverse(sampleString);
        System.out.println("Reversed String: " + reversedString);

        // Use StringUtils to check if a string is empty
        boolean isEmpty = StringUtils.isEmpty(sampleString);
        System.out.println("Is sample string empty? " + isEmpty);

        // Read the next token from the original tokenizer, which should be quoted
        /* read */ String token = tokenizer.nextToken();
        
        // Output the token
        System.out.println("Token from tokenizer: " + token);

        // Further processing with the original tokenizer
        while (tokenizer.hasNext()) {
            String nextToken = tokenizer.nextToken();
            System.out.println("Next token from tokenizer: " + nextToken);
        }
    }
}