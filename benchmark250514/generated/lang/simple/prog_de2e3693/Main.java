import org.apache.commons.lang3.text.StrTokenizer;

public class Main {
    public static void main(String[] args) {
        // Create a string to tokenize
        String str = "apple,banana,orange";

        // Initialize StrTokenizer with the string
        StrTokenizer tokenizer = new StrTokenizer(str);

        // Set the delimiter character to comma
        /* write */ tokenizer.setDelimiterChar(',');

        // Read the first token
        /* read */ String token = tokenizer.nextToken();

        // Print the token
        System.out.println(token);
    }
}