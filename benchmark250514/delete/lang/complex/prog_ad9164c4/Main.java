import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a StrTokenizer instance
        StrTokenizer tokenizer = new StrTokenizer("apple,banana,orange", ',');

        // Create a custom StrMatcher to match tokens
        StrMatcher matcher = StrMatcher.charSetMatcher("aeiou");

        // Set the custom token matcher to the tokenizer
        /* write */ tokenizer.setTokenMatcher(matcher);

        // Create an ArrayList and add some elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        // Create a HashMap to store fruit counts
        HashMap<String, Integer> fruitCounts = new HashMap<>();

        // Populate the HashMap with some data
        for (String fruit : fruits) {
            fruitCounts.put(fruit, fruit.length());
        }

        // Perform some unrelated operations
        int totalLetters = 0;
        for (int count : fruitCounts.values()) {
            totalLetters += count;
        }
        System.out.println("Total letters in all fruits: " + totalLetters);

        // Read the next token using the tokenizer
        /* read */ String token = tokenizer.nextToken();

        // Print the token
        System.out.println("First token: " + token);

        // Further processing of the fruits list
        ArrayList<String> processedFruits = new ArrayList<>();
        for (String fruit : fruits) {
            processedFruits.add(fruit.toUpperCase());
        }

        // Print the processed fruits
        System.out.println("Processed fruits: " + processedFruits);
    }
}