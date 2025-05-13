import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with some sample data
        StrTokenizer tokenizer = new StrTokenizer("a,b,c");

        // Set the character to be ignored
        /* write */ tokenizer.setIgnoredChar(',');

        // Additional code to make the program more complex
        ArrayList<String> tokensList = new ArrayList<>();
        
        // Simulate some processing before reading the token
        for (int i = 0; i < 3; i++) {
            tokensList.add("Token" + i);
        }
        
        // Process the tokensList
        for (String token : tokensList) {
            System.out.println("Processing: " + token);
        }

        // More unrelated logic
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 natural numbers: " + sum);

        // Read the next token, which should be the first character 'a'
        /* read */ String token = tokenizer.nextToken();

        // Print the token to verify the operation
        System.out.println("Next Token: " + token);

        // Further unrelated logic
        int product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
        }
        System.out.println("Product of first 3 natural numbers: " + product);
    }
}