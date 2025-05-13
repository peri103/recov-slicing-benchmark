import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello,,World");

        // Set the tokenizer to ignore empty tokens
        /* write */ tokenizer.setIgnoreEmptyTokens(true);

        // Initialize another StrTokenizer with a different string
        StrTokenizer tokenizer2 = new StrTokenizer("Java,,Programming");
        tokenizer2.setIgnoreEmptyTokens(true);

        // Create an ArrayList to store tokens from tokenizer2
        ArrayList<String> tokenList = new ArrayList<>();
        while (tokenizer2.hasNext()) {
            tokenList.add(tokenizer2.nextToken());
        }

        // Create a HashMap to store token frequencies
        HashMap<String, Integer> tokenFrequency = new HashMap<>();
        for (String token : tokenList) {
            tokenFrequency.put(token, tokenFrequency.getOrDefault(token, 0) + 1);
        }

        // Perform some calculations with token frequencies
        int totalTokens = 0;
        for (int frequency : tokenFrequency.values()) {
            totalTokens += frequency;
        }
        System.out.println("Total number of tokens: " + totalTokens);

        // Read the next token from the original tokenizer
        /* read */ String token = tokenizer.nextToken();

        // Print the token
        System.out.println(token);

        // Perform additional operations
        for (String key : tokenFrequency.keySet()) {
            System.out.println("Token: " + key + ", Frequency: " + tokenFrequency.get(key));
        }

        // Calculate average token length
        int totalLength = 0;
        for (String t : tokenList) {
            totalLength += t.length();
        }
        double averageTokenLength = (double) totalLength / tokenList.size();
        System.out.println("Average token length: " + averageTokenLength);
    }
}