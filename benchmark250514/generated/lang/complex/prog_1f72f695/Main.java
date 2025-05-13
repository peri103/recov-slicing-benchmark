import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with some input
        StrTokenizer tokenizer = new StrTokenizer("Hello, World! This is a test.");

        // Set the ignored matcher to ignore commas
        /* write */ tokenizer.setIgnoredMatcher(StrMatcher.charMatcher(','));

        // Additional complex operations
        ArrayList<String> tokens = new ArrayList<>();
        while (tokenizer.hasNext()) {
            tokens.add(tokenizer.nextToken());
        }

        // Perform some operations on the tokens
        int totalLength = 0;
        for (String token : tokens) {
            totalLength += token.length();
        }

        // Print total length of tokens
        System.out.println("Total length of tokens: " + totalLength);

        // Reinitialize tokenizer to demonstrate the original read operation
        tokenizer = new StrTokenizer("Hello, World! This is a test.");
        tokenizer.setIgnoredMatcher(StrMatcher.charMatcher(','));

        // Read the next token
        /* read */ String token = tokenizer.nextToken();

        // Output the token
        System.out.println("First token after ignoring commas: " + token);

        // Additional unrelated code for complexity
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 2);
        }

        // Calculate the sum of numbers
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Print the sum of numbers
        System.out.println("Sum of numbers: " + sum);
    }
}