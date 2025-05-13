import org.apache.commons.lang3.text.StrTokenizer;

public class Main {
    public static void main(String[] args) {
        // Initialize StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello 'World'");

        // Set the quote character to single quote
        /* write */ tokenizer.setQuoteChar('\'');

        // Read the next token, which should be quoted
        /* read */ String token = tokenizer.nextToken();
        
        // Output the token
        System.out.println(token);
    }
}