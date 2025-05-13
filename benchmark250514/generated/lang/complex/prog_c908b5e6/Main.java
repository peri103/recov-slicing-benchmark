import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello, World!");
        ArrayList<String> stringList = new ArrayList<>();
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Manipulate string using StrBuilder
        strBuilder.append(" How are you doing today?");
        strBuilder.replaceFirst("World", "Universe");

        // Add words to the list
        stringList.add("Hello");
        stringList.add("Universe");
        stringList.add("How");
        stringList.add("are");
        stringList.add("you");
        stringList.add("doing");
        stringList.add("today");
        
        // Count the occurrence of each word
        for (String word : stringList) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Print the word count
        for (String word : wordCount.keySet()) {
            System.out.println("Word: " + word + ", Count: " + wordCount.get(word));
        }

        /* write */ strBuilder.delete(0, 7);

        // More string manipulations
        strBuilder.insert(0, "Greetings,");
        strBuilder.append(" Have a nice day!");

        // Using the string list
        for (String word : stringList) {
            System.out.println("List word: " + word);
        }

        /* read */ String result = strBuilder.toString();
        System.out.println(result);

        // Additional operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
    }
}