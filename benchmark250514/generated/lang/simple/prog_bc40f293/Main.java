import org.apache.commons.lang3.text.StrTokenizer;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("apple,,banana,,cherry");

        // Set the tokenizer to ignore empty tokens
        /* write */ tokenizer.setIgnoreEmptyTokens(true);

        // Read the first token
        /* read */ String firstToken = tokenizer.nextToken();
        System.out.println(firstToken); // Output should be "apple"
    }
}