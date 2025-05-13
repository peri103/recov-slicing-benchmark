import org.apache.commons.lang3.text.StrTokenizer;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a StrTokenizer with a simple string
        StrTokenizer tokenizer = new StrTokenizer("a,b,c", ',');

        // Create a HashMap to store tokens and their counts
        HashMap<String, Integer> tokenCountMap = new HashMap<>();

        // Create an ArrayList to hold tokens temporarily
        ArrayList<String> tokenList = new ArrayList<>();

        // Configure tokenizer to treat empty tokens as null
        /* write */ tokenizer.setEmptyTokenAsNull(true);

        // Populate the ArrayList with tokens
        while (tokenizer.hasNext()) {
            String token = tokenizer.nextToken();
            if (token != null) {
                tokenList.add(token);
            }
        }

        // Count occurrences of each token
        for (String token : tokenList) {
            tokenCountMap.put(token, tokenCountMap.getOrDefault(token, 0) + 1);
        }

        // Print token counts
        for (String key : tokenCountMap.keySet()) {
            System.out.println("Token: " + key + ", Count: " + tokenCountMap.get(key));
        }

        // Reset tokenizer to process the same string again
        tokenizer.reset();

        // Process tokens from the tokenizer and print them
        /* read */ String token = tokenizer.nextToken();
        System.out.println("First token: " + token);

        // Further processing of tokens
        while (tokenizer.hasNext()) {
            String nextToken = tokenizer.nextToken();
            System.out.println("Next token: " + nextToken);
        }

        // Additional complex operations
        for (int i = 0; i < tokenList.size(); i++) {
            System.out.println("Token from list: " + tokenList.get(i));
        }
    }
}