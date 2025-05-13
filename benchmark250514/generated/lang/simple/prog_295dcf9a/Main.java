import org.apache.commons.lang3.text.StrTokenizer;

public class Main {
    public static void main(String[] args) {
        // Initialize a StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("apple,banana,,cherry", ',');

        // Set the tokenizer to treat empty tokens as null
        /* write */ tokenizer.setEmptyTokenAsNull(true);

        // Iterate through the tokens and read them
        while (tokenizer.hasNext()) {
            /* read */ String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}