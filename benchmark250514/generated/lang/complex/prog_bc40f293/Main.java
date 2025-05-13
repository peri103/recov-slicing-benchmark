import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("apple,,banana,,cherry");

        // Set the tokenizer to ignore empty tokens
        /* write */ tokenizer.setIgnoreEmptyTokens(true);

        // Additional complex operations
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("mango");
        fruits.add("grape");
        fruits.add("orange");

        // Process each fruit in the list
        for (String fruit : fruits) {
            System.out.println("Processing fruit: " + fruit);
            // Reverse the fruit name
            String reversedFruit = new StringBuilder(fruit).reverse().toString();
            System.out.println("Reversed: " + reversedFruit);
        }

        // Create another StrTokenizer for a different string
        StrTokenizer anotherTokenizer = new StrTokenizer("car,,bike,,bus");
        anotherTokenizer.setIgnoreEmptyTokens(false);

        // Read tokens from the second tokenizer
        while (anotherTokenizer.hasNext()) {
            String vehicle = anotherTokenizer.nextToken();
            System.out.println("Vehicle: " + vehicle);
        }

        // Read the first token from the original tokenizer
        /* read */ String firstToken = tokenizer.nextToken();
        System.out.println("First token from original tokenizer: " + firstToken); // Output should be "apple"

        // More complex operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 10);
        }

        // Calculate the sum of all numbers
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Print each number doubled
        for (int number : numbers) {
            System.out.println("Doubled number: " + (number * 2));
        }
    }
}