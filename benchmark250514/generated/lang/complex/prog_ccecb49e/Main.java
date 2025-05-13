import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("apple,banana,orange");

        // Additional unrelated code: Create a map to store fruits and their colors
        Map<String, String> fruitColors = new HashMap<>();
        fruitColors.put("apple", "red");
        fruitColors.put("banana", "yellow");
        fruitColors.put("orange", "orange");

        // Set the delimiter matcher to a comma
        /* write */ tokenizer.setDelimiterMatcher(StrMatcher.charMatcher(','));

        // Perform some operations on the map
        for (Map.Entry<String, String> entry : fruitColors.entrySet()) {
            System.out.println("Fruit: " + entry.getKey() + ", Color: " + entry.getValue());
        }

        // Additional unrelated code: Calculate the sum of numbers
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Read the first token using nextToken
        /* read */ String firstToken = tokenizer.nextToken();

        // Print the first token
        System.out.println("First token: " + firstToken);

        // Additional unrelated code: Reverse a string
        String str = "Hello World";
        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + reversedStr);
    }
}