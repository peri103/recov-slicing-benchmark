import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize a StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("apple, banana, cherry");

        // Create a custom StrMatcher that matches commas
        StrMatcher commaMatcher = StrMatcher.commaMatcher();

        // Use the setTokenMatcher method to set the custom matcher
        /* write */ tokenizer.setTokenMatcher(commaMatcher);

        // Additional unrelated code for complexity
        List<String> fruits = Arrays.asList("orange", "grape", "melon");
        for (String fruit : fruits) {
            System.out.println("Processing fruit: " + fruit);
        }
        
        // Initialize another StrTokenizer with a different string
        StrTokenizer anotherTokenizer = new StrTokenizer("cat; dog; rabbit");
        anotherTokenizer.setDelimiterMatcher(StrMatcher.semicolonMatcher());
        
        // Process tokens from anotherTokenizer
        while (anotherTokenizer.hasNext()) {
            String animalToken = anotherTokenizer.nextToken();
            System.out.println("Animal: " + animalToken);
        }

        // Read the first token using the nextToken method
        /* read */ String firstToken = tokenizer.nextToken();

        // Print the first token
        System.out.println("First fruit token: " + firstToken);

        // Additional unrelated code for complexity
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Another StrTokenizer with different delimiter
        StrTokenizer yetAnotherTokenizer = new StrTokenizer("lion|tiger|bear");
        yetAnotherTokenizer.setDelimiterMatcher(StrMatcher.charMatcher('|'));
        
        // Process tokens from yetAnotherTokenizer
        while (yetAnotherTokenizer.hasNext()) {
            String wildAnimalToken = yetAnotherTokenizer.nextToken();
            System.out.println("Wild Animal: " + wildAnimalToken);
        }
    }
}