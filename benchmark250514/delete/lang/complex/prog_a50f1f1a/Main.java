import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a StrTokenizer with some sample data
        StrTokenizer tokenizer = new StrTokenizer("apple,banana,orange");
        
        // Use an ArrayList to store tokens for later processing
        ArrayList<String> tokens = new ArrayList<>();

        // Set token matcher to comma, this will affect how tokens are split
        /* write */ tokenizer.setTokenMatcher(StrMatcher.commaMatcher());

        // Add some unrelated logic to make the program more complex
        for (int i = 0; i < 3; i++) {
            tokens.add("fruit" + i);
        }

        // Perform some operations on the list
        for (String fruit : tokens) {
            System.out.println("Processing: " + fruit);
        }

        // Add more unrelated logic
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Read the first token using the tokenizer
        /* read */ String token = tokenizer.nextToken();
        System.out.println("First token: " + token);

        // Continue with more complex operations
        tokens.add("grape");
        tokens.add("melon");

        for (String fruit : tokens) {
            System.out.println("Final list contains: " + fruit);
        }
    }
}