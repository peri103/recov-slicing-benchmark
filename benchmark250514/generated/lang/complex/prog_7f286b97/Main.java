import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the tokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello World");

        // Initialize another tokenizer with a different string
        StrTokenizer tokenizer2 = new StrTokenizer("Java Programming");

        // Reset the tokenizer to ensure it starts from the beginning
        /* write */ tokenizer.reset("Hello World");

        // Initialize a list to store tokens
        ArrayList<String> tokenList = new ArrayList<>();

        // Extract tokens from the second tokenizer and add them to the list
        while (tokenizer2.hasNext()) {
            tokenList.add(tokenizer2.nextToken());
        }

        // Initialize a map to store the frequency of each token
        HashMap<String, Integer> tokenFrequency = new HashMap<>();

        // Calculate frequency of each token in the list
        for (String token : tokenList) {
            tokenFrequency.put(token, tokenFrequency.getOrDefault(token, 0) + 1);
        }

        // Read the first token from the original tokenizer
        /* read */ String token = tokenizer.nextToken();

        // Print the token
        System.out.println(token);

        // Print token frequencies from the map
        for (String key : tokenFrequency.keySet()) {
            System.out.println("Token: " + key + ", Frequency: " + tokenFrequency.get(key));
        }

        // Perform additional operations on the list
        for (int i = 0; i < tokenList.size(); i++) {
            System.out.println("List item: " + tokenList.get(i));
        }
    }
}