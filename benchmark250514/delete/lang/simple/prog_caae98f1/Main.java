import org.apache.commons.lang3.text.StrTokenizer;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a string
        StrTokenizer tokenizer = new StrTokenizer("Hello World");

        // Set a token character (write method)
        /* write */ tokenizer.setTokenChar('H');

        // Read the next token (read method)
        /* read */ String token = tokenizer.nextToken();
        
        // Print the token
        System.out.println(token);
    }
}