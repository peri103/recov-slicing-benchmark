import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello 'World' from 'Java'");

        // Set a quote matcher to handle quoted strings
        /* write */ tokenizer.setQuoteMatcher(StrMatcher.quoteMatcher());

        // Initialize an ArrayList to store tokens
        ArrayList<String> tokensList = new ArrayList<>();

        // Initialize a HashMap to count occurrences of each token
        HashMap<String, Integer> tokenCount = new HashMap<>();

        // Process all tokens and store them in the list and count them
        while (tokenizer.hasNext()) {
            String token = tokenizer.nextToken();
            tokensList.add(token);
            tokenCount.put(token, tokenCount.getOrDefault(token, 0) + 1);
        }

        // Print all tokens
        System.out.println("All tokens:");
        for (String t : tokensList) {
            System.out.println(t);
        }

        // Print the token count
        System.out.println("\nToken counts:");
        for (String key : tokenCount.keySet()) {
            System.out.println(key + ": " + tokenCount.get(key));
        }

        // Reset the tokenizer to the initial state
        tokenizer.reset();

        // Read the first token, which should respect the quote matcher
        /* read */ String firstToken = tokenizer.nextToken();

        // Print the first token
        System.out.println("\nFirst token after reset: " + firstToken);

        // Additional processing: find the longest token
        String longestToken = "";
        for (String t : tokensList) {
            if (t.length() > longestToken.length()) {
                longestToken = t;
            }
        }

        // Print the longest token
        System.out.println("\nLongest token: " + longestToken);
    }
}