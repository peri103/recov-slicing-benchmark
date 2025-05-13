import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with an initial string
        StrTokenizer tokenizer = new StrTokenizer("Hello World");

        // Set the delimiter string to space
        /* write */ tokenizer.setDelimiterString(" ");

        // Additional complex logic
        ArrayList<String> words = new ArrayList<>();
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Add some words to the list
        words.add("Java");
        words.add("Python");
        words.add("C++");

        // Count the frequency of each word
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Print the word counts
        for (String word : wordCount.keySet()) {
            System.out.println("Word: " + word + ", Count: " + wordCount.get(word));
        }

        // Additional manipulation with StrTokenizer
        StrTokenizer tokenizer2 = new StrTokenizer("This is a test");
        tokenizer2.setDelimiterString(" ");
        while (tokenizer2.hasNext()) {
            System.out.println("Token: " + tokenizer2.nextToken());
        }

        // Read the first token using nextToken method
        /* read */ String token = tokenizer.nextToken();

        // Print the token
        System.out.println("First token from original tokenizer: " + token);

        // More complex logic
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        // Print all the numbers
        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}