import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize StrTokenizer and StrMatcher
        StrTokenizer tokenizer = new StrTokenizer("Hello World from Java");
        StrMatcher matcher = StrMatcher.charSetMatcher(new char[] {' '});
        
        // Initialize additional data structures
        ArrayList<String> tokenList = new ArrayList<>();
        HashMap<String, Integer> tokenCount = new HashMap<>();
        
        // Set the token matcher
        /* write */ tokenizer.setTokenMatcher(matcher);
        
        // Process tokens and store them in the list
        while (tokenizer.hasNext()) {
            String token = tokenizer.nextToken();
            tokenList.add(token);
            tokenCount.put(token, tokenCount.getOrDefault(token, 0) + 1);
        }
        
        // Print the tokens and their counts
        for (String token : tokenList) {
            System.out.println("Token: " + token + ", Count: " + tokenCount.get(token));
        }
        
        // Additional processing
        int totalTokens = tokenList.size();
        System.out.println("Total number of tokens: " + totalTokens);
        
        // Access the first token directly using the original tokenizer
        tokenizer = new StrTokenizer("Hello World from Java");
        /* read */ String firstToken = tokenizer.nextToken();
        System.out.println("First token: " + firstToken);
        
        // Further manipulation
        tokenList.add("Extra");
        tokenCount.put("Extra", 1);
        
        // Re-print the tokens and their counts
        for (String token : tokenList) {
            System.out.println("Token: " + token + ", Count: " + tokenCount.get(token));
        }
    }
}