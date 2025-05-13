import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello 'world'! This is a 'test'.");

        // Create a map to store tokens and their counts
        HashMap<String, Integer> tokenCountMap = new HashMap<>();

        // Set the quote matcher to handle quoted text
        /* write */ tokenizer.setQuoteMatcher(StrMatcher.quoteMatcher());

        // Use another tokenizer for different string
        StrTokenizer anotherTokenizer = new StrTokenizer("Sample 'text' for tokenizer.");
        anotherTokenizer.setQuoteMatcher(StrMatcher.quoteMatcher());

        // Use an ArrayList to store tokens
        ArrayList<String> tokensList = new ArrayList<>();

        // Process all tokens using the first tokenizer
        while (tokenizer.hasNext()) {
            String token = tokenizer.nextToken();
            tokensList.add(token);
            tokenCountMap.put(token, tokenCountMap.getOrDefault(token, 0) + 1);
        }

        // Process all tokens using the second tokenizer
        while (anotherTokenizer.hasNext()) {
            String token = anotherTokenizer.nextToken();
            tokensList.add(token);
            tokenCountMap.put(token, tokenCountMap.getOrDefault(token, 0) + 1);
        }

        // Read the next token from the tokenizer
        /* read */ String firstToken = tokensList.get(0);

        // Print the first token to verify the output
        System.out.println("First token: " + firstToken);

        // Print all tokens and their counts
        System.out.println("All tokens and their counts:");
        for (String token : tokenCountMap.keySet()) {
            System.out.println("Token: " + token + ", Count: " + tokenCountMap.get(token));
        }
    }
}