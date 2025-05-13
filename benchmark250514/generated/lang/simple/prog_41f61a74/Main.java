import org.apache.commons.lang3.text.StrTokenizer;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello,,World");

        // Set the tokenizer to ignore empty tokens
        /* write */ tokenizer.setIgnoreEmptyTokens(true);

        // Read the first token from the tokenizer
        /* read */ String token = tokenizer.nextToken();

        // Print the token to verify the operation
        System.out.println(token);
    }
}