import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello,,World");

        // Create an ArrayList to store tokens
        ArrayList<String> tokensList = new ArrayList<>();

        // Create a HashMap to map tokens to their lengths
        HashMap<String, Integer> tokenLengthMap = new HashMap<>();

        // Set the tokenizer to ignore empty tokens
        /* write */ tokenizer.setIgnoreEmptyTokens(true);

        // Add some unrelated code to make the program more complex
        for (int i = 0; i < 5; i++) {
            tokensList.add("Token" + i);
        }

        // Process the tokens from the tokenizer and add them to the list
        while (tokenizer.hasNext()) {
            String currentToken = tokenizer.nextToken();
            tokensList.add(currentToken);
            tokenLengthMap.put(currentToken, currentToken.length());
        }

        // Calculate and print the total length of all tokens in the list
        int totalLength = 0;
        for (String token : tokensList) {
            totalLength += token.length();
        }
        System.out.println("Total length of tokens: " + totalLength);

        // Read the first token from the tokenizer
        /* read */ String token = tokenizer.nextToken();

        // Print the token to verify the operation
        System.out.println("First token: " + token);

        // Print the lengths of all tokens
        for (String key : tokenLengthMap.keySet()) {
            System.out.println("Token: " + key + ", Length: " + tokenLengthMap.get(key));
        }
    }
}