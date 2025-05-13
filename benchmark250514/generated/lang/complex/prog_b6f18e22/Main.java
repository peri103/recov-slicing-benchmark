import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Initialize StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("apple,banana,orange");

        // Set a custom delimiter matcher using the write method
        /* write */ tokenizer.setDelimiterMatcher(StrMatcher.charMatcher(','));

        // Create an ArrayList and add some elements
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("kiwi");
        fruits.add("grape");
        fruits.add("melon");

        // Sort the ArrayList
        Collections.sort(fruits);

        // Print sorted fruits
        System.out.println("Sorted fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Add a new element to the list
        fruits.add("pear");

        // Check if the list contains a specific fruit
        if (fruits.contains("kiwi")) {
            System.out.println("Kiwi is in the list.");
        }

        // Read the first token using the read method
        /* read */ String token = tokenizer.nextToken();

        // Print the token to verify the correct operation
        System.out.println("First token from tokenizer: " + token);

        // Create a complex string and tokenize it
        StrTokenizer complexTokenizer = new StrTokenizer("dog:cat:fish:bird");
        complexTokenizer.setDelimiterMatcher(StrMatcher.charMatcher(':'));

        // Iterate through tokens and print them
        while (complexTokenizer.hasNext()) {
            String animal = complexTokenizer.nextToken();
            System.out.println("Animal: " + animal);
        }
    }
}