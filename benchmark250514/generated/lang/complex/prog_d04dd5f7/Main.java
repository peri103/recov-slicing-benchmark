import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a string
        StrTokenizer tokenizer = new StrTokenizer("apple,banana,orange");

        // Initialize an ArrayList and a HashMap for additional operations
        ArrayList<String> fruits = new ArrayList<>();
        HashMap<String, Integer> fruitCount = new HashMap<>();

        // Add some initial elements to the ArrayList
        fruits.add("kiwi");
        fruits.add("grape");

        // Set the delimiter character to ','
        /* write */ tokenizer.setDelimiterChar(',');

        // Perform some operations on the ArrayList
        fruits.add("mango");
        fruits.remove("kiwi");

        // Count occurrences of each fruit in the ArrayList
        for (String fruit : fruits) {
            fruitCount.put(fruit, fruitCount.getOrDefault(fruit, 0) + 1);
        }

        // Print the fruit counts
        for (String fruit : fruitCount.keySet()) {
            System.out.println(fruit + ": " + fruitCount.get(fruit));
        }

        // Read the first token
        /* read */ String token = tokenizer.nextToken();

        // Perform more operations after reading the token
        fruits.add(token);
        System.out.println("Added token to fruits list: " + token);

        // Print the final state of the ArrayList
        System.out.println("Final fruits list: " + fruits);
    }
}