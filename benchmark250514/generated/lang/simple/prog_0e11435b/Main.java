import org.apache.commons.lang3.text.StrTokenizer;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("apple,banana,orange");

        // Set the delimiter string to a comma
        /* write */ tokenizer.setDelimiterString(",");

        // Read the first token using nextToken method
        /* read */ String token = tokenizer.nextToken();

        // Print the token
        System.out.println(token);
    }
}