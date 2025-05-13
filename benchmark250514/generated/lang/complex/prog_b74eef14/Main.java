import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Original StrTokenizer usage
        String input = "Hello,,World";
        StrTokenizer tokenizer = new StrTokenizer(input, ',');

        /* write */ tokenizer.setEmptyTokenAsNull(true);

        // Additional code to make the program more complex
        ArrayList<String> tokens = new ArrayList<>();
        HashMap<String, Integer> tokenCount = new HashMap<>();

        // Process tokens and store them in an ArrayList
        while (tokenizer.hasNext()) {
            String token = tokenizer.nextToken();
            tokens.add(token);
            tokenCount.put(token, tokenCount.getOrDefault(token, 0) + 1);
        }

        // Perform some operations on the tokens
        int totalTokens = tokens.size();
        System.out.println("Total tokens: " + totalTokens);

        for (String token : tokens) {
            System.out.println("Token: " + token + ", Count: " + tokenCount.get(token));
        }

        // Use another StrTokenizer instance with different settings
        String input2 = "Java,,Programming";
        StrTokenizer tokenizer2 = new StrTokenizer(input2, ',');
        tokenizer2.setEmptyTokenAsNull(true);

        // Read tokens from the second tokenizer
        while (tokenizer2.hasNext()) {
            String token = tokenizer2.nextToken();
            System.out.println("Second tokenizer token: " + token);
        }

        // Further unrelated operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Final read operation from the original tokenizer
        /* read */ String firstToken = tokenizer.nextToken();
        System.out.println("First token from original tokenizer: " + firstToken);
    }
}