import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("apple,banana,orange");

        // Initialize another StrTokenizer for a different string
        StrTokenizer anotherTokenizer = new StrTokenizer("dog;cat;mouse");

        // Set the delimiter to comma using setDelimiterMatcher
        /* write */ tokenizer.setDelimiterMatcher(StrMatcher.commaMatcher());

        // Set the delimiter for the second tokenizer
        anotherTokenizer.setDelimiterMatcher(StrMatcher.charSetMatcher(';'));

        // Process tokens from the second tokenizer
        while (anotherTokenizer.hasNext()) {
            String animalToken = anotherTokenizer.nextToken();
            System.out.println("Animal Token: " + animalToken);
        }

        // Unrelated computation to make the program more complex
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(numbers).sum();
        System.out.println("Sum of numbers: " + sum);

        // Read the first token from the original tokenizer using nextToken
        /* read */ String token = tokenizer.nextToken();
        
        // Print the token to verify the result
        System.out.println("Fruit Token: " + token);

        // Additional processing with the original tokenizer
        while (tokenizer.hasNext()) {
            String fruitToken = tokenizer.nextToken();
            System.out.println("Next Fruit Token: " + fruitToken);
        }

        // Perform some mathematical operations
        double result = Math.pow(sum, 2) + Math.sqrt(sum);
        System.out.println("Complex Calculation Result: " + result);
    }
}