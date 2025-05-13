import org.apache.commons.lang3.text.StrTokenizer;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello,World");

        // Reset the tokenizer to ensure it starts from the beginning
        /* write */ tokenizer.reset();

        // Read the first token using nextToken
        /* read */ String token = tokenizer.nextToken();

        // Print the token to ensure the read method worked correctly
        System.out.println(token);
    }
}