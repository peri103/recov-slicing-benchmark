import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("   Hello World   ");
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Adding numbers to the list
        for (int i = 0; i < 10; i++) {
            numbers.add(i * i);
        }

        // Counting words in a sentence
        String sentence = "This is a test sentence for counting words";
        String[] words = sentence.split(" ");
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        /* write */ strBuilder.trim();

        // Processing numbers
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of squares: " + sum);

        // Display word counts
        System.out.println("Word counts:");
        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }

        /* read */ String result = strBuilder.toString();
        System.out.println("Trimmed string: " + result);

        // Additional string manipulation
        StrBuilder anotherStrBuilder = new StrBuilder(result);
        anotherStrBuilder.append(" - Additional text");
        System.out.println("Modified string: " + anotherStrBuilder.toString());
    }
}