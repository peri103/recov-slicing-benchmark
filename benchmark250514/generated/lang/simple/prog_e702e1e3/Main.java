import org.apache.commons.lang3.text.StrTokenizer;

public class Main {
    public static void main(String[] args) {
        // Initialize a StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello,,World");

        // Write operation: setIgnoreEmptyTokens to true
        /* write */ tokenizer.setIgnoreEmptyTokens(true);

        // Read operation: get the next token
        /* read */ String token = tokenizer.nextToken();

        // Print the token to ensure the read operation works correctly
        System.out.println(token);
    }
}