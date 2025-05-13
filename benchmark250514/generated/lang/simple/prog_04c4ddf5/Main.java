import org.apache.commons.lang3.text.StrTokenizer;

public class Main {
    public static void main(String[] args) {
        // Initialize StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello,World,This,Is,A,Test");

        // Use the nextToken method to read the first token
        /* read */ String firstToken = tokenizer.nextToken();
        
        // Reset the tokenizer to start reading from the beginning again
        /* write */ tokenizer.reset();

        // Use the nextToken method again to read the first token after reset
        /* read */ String resetToken = tokenizer.nextToken();

        // Print the first token read after reset
        System.out.println(resetToken);
    }
}