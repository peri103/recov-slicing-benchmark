import org.apache.commons.lang3.text.StrTokenizer;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello,World,Java");

        // Set the delimiter string to a comma
        /* write */ tokenizer.setDelimiterString(",");

        // Read the first token
        /* read */ String token = tokenizer.nextToken();

        // Print the token
        System.out.println(token);
    }
}