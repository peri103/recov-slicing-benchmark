import org.apache.commons.lang3.text.StrTokenizer;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample text
        StrTokenizer tokenizer = new StrTokenizer("Hello 'World'");

        // Set the quote character using the write method
        /* write */ tokenizer.setQuoteChar('\'');

        // Read the next token using the read method
        /* read */ String token = tokenizer.nextToken();

        // Output the token read
        System.out.println(token);
    }
}