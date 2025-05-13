import org.apache.commons.lang3.text.StrTokenizer;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello 'World'");

        // Set the quote character to single quote
        /* write */ tokenizer.setQuoteChar('\'');

        // Read the next token, which should respect the quote character
        /* read */ String token = tokenizer.nextToken();

        // Print the token to verify the correct value is read
        System.out.println(token);
    }
}