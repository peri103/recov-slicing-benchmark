import org.apache.commons.lang3.text.StrTokenizer;

public class Main {
    public static void main(String[] args) {
        // Initialize the tokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello World");

        // Reset the tokenizer to ensure it starts from the beginning
        /* write */ tokenizer.reset("Hello World");

        // Read the first token
        /* read */ String token = tokenizer.nextToken();

        // Print the token
        System.out.println(token);
    }
}