import org.apache.commons.lang3.text.StrTokenizer;

public class Main {
    public static void main(String[] args) {
        // Initialize StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello 'World'!");

        // Set the quote character using the write method
        /* write */ tokenizer.setQuoteChar('\'');

        // Retrieve the next token using the read method
        /* read */ String token = tokenizer.nextToken();

        // Print the token to verify the output
        System.out.println(token);
    }
}