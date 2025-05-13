import org.apache.commons.lang3.text.StrTokenizer;

public class Main {
    public static void main(String[] args) {
        // Initialize the tokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("example");

        // Set a token character
        /* write */ tokenizer.setTokenChar('x');

        // Read the next token
        /* read */ String token = tokenizer.nextToken();

        // Print the token
        System.out.println(token);
    }
}