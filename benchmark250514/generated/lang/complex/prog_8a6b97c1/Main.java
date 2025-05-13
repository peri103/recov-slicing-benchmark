import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize StrTokenizer and set quote matcher
        StrTokenizer tokenizer = new StrTokenizer("Hello 'World'! How 'are' you?");
        /* write */ tokenizer.setQuoteMatcher(StrMatcher.quoteMatcher());

        // Additional code using ArrayList
        ArrayList<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Python");
        words.add("C++");

        // Using HashMap to store word frequencies
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, word.length());
        }

        // Processing StrTokenizer tokens
        while (tokenizer.hasNext()) {
            String currentToken = tokenizer.nextToken();
            System.out.println("Processing token: " + currentToken);
        }

        // Output word frequencies
        for (String word : wordCount.keySet()) {
            System.out.println("Word: " + word + ", Length: " + wordCount.get(word));
        }

        // Final token output
        /* read */ String token = tokenizer.nextToken();
        System.out.println("Next token: " + token);
    }
}