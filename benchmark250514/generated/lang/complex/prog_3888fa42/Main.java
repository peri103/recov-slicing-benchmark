import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello 'World' from 'Java'");

        // Set the quote character to single quote
        /* write */ tokenizer.setQuoteChar('\'');

        // Initialize a HashMap to store tokens and their counts
        HashMap<String, Integer> tokenCountMap = new HashMap<>();

        // Process tokens and store them in the HashMap
        while (tokenizer.hasNext()) {
            String token = tokenizer.nextToken();
            tokenCountMap.put(token, tokenCountMap.getOrDefault(token, 0) + 1);
        }

        // Initialize a new StrTokenizer with another string
        StrTokenizer tokenizer2 = new StrTokenizer("Coding 'is' fun 'with' Java");
        tokenizer2.setQuoteChar('\'');
        
        // Use ArrayList to store tokens from the second tokenizer
        ArrayList<String> tokenList = new ArrayList<>();
        while (tokenizer2.hasNext()) {
            tokenList.add(tokenizer2.nextToken());
        }

        // Read the next token from the first tokenizer, which should respect the quote character
        /* read */ String firstToken = tokenizer.nextToken();

        // Print the token to verify the correct value is read
        System.out.println(firstToken);

        // Process and print tokens from the second tokenizer
        for (String tok : tokenList) {
            System.out.println("Token from second tokenizer: " + tok);
        }

        // Print the token counts from the first tokenizer
        System.out.println("Token counts from first tokenizer:");
        for (String key : tokenCountMap.keySet()) {
            System.out.println(key + ": " + tokenCountMap.get(key));
        }
    }
}