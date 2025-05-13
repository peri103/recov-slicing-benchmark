import org.apache.commons.lang3.text.StrTokenizer;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample input
        StrTokenizer tokenizer = new StrTokenizer("a,b,c");

        // Set the character to be ignored
        /* write */ tokenizer.setIgnoredChar(',');

        // Read the next token, which should ignore the character set above
        /* read */ String token = tokenizer.nextToken();
        
        // Output the token to verify the read operation
        System.out.println(token);
    }
}