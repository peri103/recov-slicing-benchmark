import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a tokenizer with a sample string
        String input = "apple,banana,cherry";
        StrTokenizer tokenizer = new StrTokenizer(input);

        // Initialize an ArrayList to store tokens
        ArrayList<String> tokensList = new ArrayList<>();

        // Initialize a HashMap to count occurrences of each token
        HashMap<String, Integer> tokenCountMap = new HashMap<>();

        /* write */ tokenizer.setDelimiterChar(',');

        // Add tokens to the tokensList and count occurrences
        while (tokenizer.hasNext()) {
            String token = tokenizer.nextToken();
            tokensList.add(token);
            tokenCountMap.put(token, tokenCountMap.getOrDefault(token, 0) + 1);
        }

        // Print all tokens
        System.out.println("Tokens:");
        for (String token : tokensList) {
            System.out.println(token);
        }

        // Print token occurrences
        System.out.println("\nToken Occurrences:");
        for (String key : tokenCountMap.keySet()) {
            System.out.println(key + ": " + tokenCountMap.get(key));
        }

        // Initialize another tokenizer with a different string
        String input2 = "dog,cat,bird";
        StrTokenizer tokenizer2 = new StrTokenizer(input2);
        tokenizer2.setDelimiterChar(',');

        // Add tokens from the second tokenizer to the list
        while (tokenizer2.hasNext()) {
            tokensList.add(tokenizer2.nextToken());
        }

        // Print all tokens again after adding new ones
        System.out.println("\nAll Tokens:");
        for (String token : tokensList) {
            System.out.println(token);
        }

        // Retrieve the first token from the original tokenizer
        /* read */ String firstToken = tokenizer.nextToken();
        System.out.println("\nFirst Token from Original Tokenizer: " + firstToken);
    }
}