import org.apache.commons.lang3.text.StrTokenizer;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with some sample data
        StrTokenizer tokenizer = new StrTokenizer("a,b,c");

        // Set the character to be ignored
        /* write */ tokenizer.setIgnoredChar(',');

        // Read the next token, which should be the first character 'a'
        /* read */ String token = tokenizer.nextToken();

        // Print the token to verify the operation
        System.out.println(token);
    }
}