import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("apple,banana,orange");

        // Set the delimiter string to a comma
        /* write */ tokenizer.setDelimiterString(",");

        // Additional complexity: Use an ArrayList to store tokens
        ArrayList<String> tokenList = new ArrayList<>();

        // Use a HashMap to store some arbitrary key-value pairs
        HashMap<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("apple", 1);
        fruitMap.put("banana", 2);
        fruitMap.put("orange", 3);

        // Add elements to the ArrayList
        tokenList.add("grape");
        tokenList.add("melon");

        // Retrieve and print a value from the HashMap
        Integer fruitValue = fruitMap.get("banana");
        System.out.println("Fruit value for banana: " + fruitValue);

        // Perform some operations on the ArrayList
        tokenList.remove("melon");
        tokenList.add("kiwi");

        // Read the first token using nextToken method
        /* read */ String token = tokenizer.nextToken();

        // Print the token
        System.out.println(token);

        // Additional operations on the ArrayList
        for (String fruit : tokenList) {
            System.out.println("Token list contains: " + fruit);
        }

        // Perform a simple calculation
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 4: " + sum);
    }
}