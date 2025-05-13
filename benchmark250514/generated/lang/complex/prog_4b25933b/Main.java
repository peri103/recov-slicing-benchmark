import org.apache.commons.lang3.text.StrBuilder;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        StrBuilder builder = new StrBuilder("   Hello World!   ");
        
        // Additional code to make the program more complex
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};
        
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        System.out.println("Word counts:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Perform some operations before the write method
        builder.append(" Welcome to the jungle!");
        builder.insert(0, "Greetings!");
        
        /* write */ builder.trim();
        
        // More operations after the write method
        builder.append(" Have a great day!");
        builder.replaceFirst("jungle", "world");
        
        // Use a different StrBuilder instance
        StrBuilder anotherBuilder = new StrBuilder("Initial text.");
        anotherBuilder.append(" More text.");
        anotherBuilder.deleteFirst("Initial");
        
        // Print the result of anotherBuilder
        System.out.println("Another Builder: " + anotherBuilder.toString());
        
        /* read */ String result = builder.toString();
        System.out.println("Trimmed and modified Builder: " + result);
        
        // Additional operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
        
        // Final operations
        StrBuilder finalBuilder = new StrBuilder("End of program.");
        finalBuilder.append(" Goodbye!");
        System.out.println(finalBuilder.toString());
    }
}