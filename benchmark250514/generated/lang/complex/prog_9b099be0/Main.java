import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("apple,banana,orange");

        // Set a custom delimiter matcher to split tokens by comma
        /* write */ tokenizer.setDelimiterMatcher(StrMatcher.charMatcher(','));

        // Initialize an ArrayList to store tokens
        ArrayList<String> tokensList = new ArrayList<>();

        // Initialize a HashMap to count occurrences of each token
        HashMap<String, Integer> tokenCountMap = new HashMap<>();

        // Process all tokens and store them in the ArrayList
        while (tokenizer.hasNext()) {
            String token = tokenizer.nextToken();
            tokensList.add(token);

            // Count occurrences of each token
            tokenCountMap.put(token, tokenCountMap.getOrDefault(token, 0) + 1);
        }

        // Read the first token using the nextToken method
        StrTokenizer tokenizer2 = new StrTokenizer("grape,melon,berry");
        tokenizer2.setDelimiterMatcher(StrMatcher.charMatcher(','));
        /* read */ String firstToken = tokenizer.nextToken();

        // Print the first token
        System.out.println("First token: " + firstToken);

        // Print all tokens from the ArrayList
        System.out.println("Tokens List: " + tokensList);

        // Print the token count map
        System.out.println("Token Count Map: " + tokenCountMap);

        // Process the second tokenizer
        ArrayList<String> tokensList2 = new ArrayList<>();
        while (tokenizer2.hasNext()) {
            tokensList2.add(tokenizer2.nextToken());
        }
        System.out.println("Second Tokens List: " + tokensList2);
    }
}