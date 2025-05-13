import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello 'World' and 'Java'!");

        // Set a custom quote matcher to recognize single quotes
        /* write */ tokenizer.setQuoteMatcher(StrMatcher.singleQuoteMatcher());

        // Create an ArrayList to store tokens
        ArrayList<String> tokens = new ArrayList<>();

        // Create a HashMap to count occurrences of each token
        HashMap<String, Integer> tokenCount = new HashMap<>();

        // Process all tokens in the tokenizer
        while (tokenizer.hasNext()) {
            String currentToken = tokenizer.nextToken();
            tokens.add(currentToken);
            tokenCount.put(currentToken, tokenCount.getOrDefault(currentToken, 0) + 1);
        }

        // Perform some operations on the tokens
        for (String token : tokens) {
            System.out.println("Token: " + token + ", Count: " + tokenCount.get(token));
        }

        // Read the first token, which should be 'World' due to the quote matcher
        /* read */ String token = tokenizer.nextToken();

        // Output the token
        System.out.println("First quoted token: " + token);

        // Additional complex operations
        int totalTokens = tokens.size();
        System.out.println("Total tokens processed: " + totalTokens);

        // Use more StrTokenizer functionality
        StrTokenizer newTokenizer = new StrTokenizer("Java,Python,C++,JavaScript");
        newTokenizer.setDelimiterMatcher(StrMatcher.commaMatcher());

        // Store and print programming languages
        ArrayList<String> languages = new ArrayList<>();
        while (newTokenizer.hasNext()) {
            languages.add(newTokenizer.nextToken());
        }

        System.out.println("Programming Languages:");
        for (String language : languages) {
            System.out.println(language);
        }
    }
}