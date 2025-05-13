import org.apache.commons.lang3.text.StrTokenizer;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a string
        StrTokenizer tokenizer = new StrTokenizer("Hello,World");

        // Reset the tokenizer to the initial state
        /* write */ tokenizer.reset();

        // Read the first token
        /* read */ String token = tokenizer.nextToken();

        // Output the token
        System.out.println(token);
    }
}