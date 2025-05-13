import org.apache.commons.lang3.text.StrBuilder;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize StrBuilder with a string
        StrBuilder strBuilder = new StrBuilder("Hello World");
        
        // Create a HashMap for storing key-value pairs
        HashMap<String, Integer> wordCount = new HashMap<>();
        wordCount.put("Hello", 1);
        wordCount.put("World", 1);

        // Create a list of words
        List<String> words = new ArrayList<>();
        words.add("Hi");
        words.add("Earth");

        // Replace the beginning of the string
        /* write */ strBuilder.replace(0, 5, words.get(0));

        // Perform some operations on the HashMap
        if (wordCount.containsKey("Hello")) {
            wordCount.put("Hello", wordCount.get("Hello") + 1);
        }

        // Iterate over the list and print each word
        for (String word : words) {
            System.out.println("Word: " + word);
        }

        // More operations on the HashMap
        wordCount.put("Earth", 2);
        for (String key : wordCount.keySet()) {
            System.out.println("Key: " + key + ", Count: " + wordCount.get(key));
        }

        // Convert StrBuilder to String
        /* read */ String result = strBuilder.toString();
        System.out.println("Final String: " + result);

        // Additional complex operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
    }
}