import org.apache.commons.lang3.text.StrTokenizer;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample text
        StrTokenizer tokenizer = new StrTokenizer("Hello 'World'");

        // Set the quote character to handle quoted text
        /* write */ tokenizer.setQuoteChar('\'');

        // Read the next token, which should respect the quote character setting
        /* read */ String token = tokenizer.nextToken();
        
        // Output the token
        System.out.println(token);
    }
}