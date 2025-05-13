import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello,World,Java");

        // Create an ArrayList to store tokens
        ArrayList<String> tokenList = new ArrayList<>();

        // Create a HashMap to count occurrences of each token
        HashMap<String, Integer> tokenCountMap = new HashMap<>();

        // Set the delimiter string to a comma
        /* write */ tokenizer.setDelimiterString(",");

        // Process tokens and store them in the ArrayList
        while (tokenizer.hasNext()) {
            String currentToken = tokenizer.nextToken();
            tokenList.add(currentToken);
        }

        // Count occurrences of each token
        for (String token : tokenList) {
            tokenCountMap.put(token, tokenCountMap.getOrDefault(token, 0) + 1);
        }

        // Read the first token
        /* read */ String firstToken = tokenList.get(0);

        // Print the first token
        System.out.println("First Token: " + firstToken);

        // Print all tokens and their counts
        System.out.println("All Tokens and Counts:");
        for (String token : tokenCountMap.keySet()) {
            System.out.println("Token: " + token + ", Count: " + tokenCountMap.get(token));
        }

        // Perform some additional operations
        int sumOfLengths = 0;
        for (String token : tokenList) {
            sumOfLengths += token.length();
        }
        System.out.println("Sum of token lengths: " + sumOfLengths);
    }
}