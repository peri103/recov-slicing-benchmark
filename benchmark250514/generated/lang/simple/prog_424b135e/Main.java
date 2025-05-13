import org.apache.commons.lang3.text.StrTokenizer;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("a,b,c");

        // Set the ignored character to a comma
        /* write */ tokenizer.setIgnoredChar(',');

        // Read the next token, which should be the first token before the ignored character was set
        /* read */ String token = tokenizer.nextToken();

        // Print the token
        System.out.println(token);
    }
}