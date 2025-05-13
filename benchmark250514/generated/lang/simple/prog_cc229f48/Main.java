import org.apache.commons.lang3.text.StrTokenizer;

public class Main {
    public static void main(String[] args) {
        // Initialize StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello,World");

        // Set the delimiter character to ','
        /* write */ tokenizer.setDelimiterChar(',');

        // Read the first token using nextToken method
        /* read */ String token = tokenizer.nextToken();

        // Print the token
        System.out.println(token);
    }
}