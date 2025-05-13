import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello,World,Java,Programming");

        // Set the delimiter character to ','
        /* write */ tokenizer.setDelimiterChar(',');

        // Create an ArrayList to store tokens
        ArrayList<String> tokens = new ArrayList<>();

        // Use a loop to tokenize the entire string and store tokens in the ArrayList
        while (tokenizer.hasNext()) {
            tokens.add(tokenizer.nextToken());
        }

        // Create a HashMap to count occurrences of each token
        HashMap<String, Integer> tokenCount = new HashMap<>();

        // Populate the HashMap with token counts
        for (String token : tokens) {
            tokenCount.put(token, tokenCount.getOrDefault(token, 0) + 1);
        }

        // Print the token counts
        for (String key : tokenCount.keySet()) {
            System.out.println("Token: " + key + ", Count: " + tokenCount.get(key));
        }

        // Read the first token using nextToken method
        tokenizer.reset();
        /* read */ String firstToken = tokenizer.nextToken();

        // Print the first token
        System.out.println("First token: " + firstToken);

        // Additional operations on ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        // Print the numbers
        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}