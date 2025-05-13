import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello World");
        
        // Initialize another StrTokenizer with a different string
        StrTokenizer tokenizer2 = new StrTokenizer("Java Programming");

        // Reset the tokenizer to ensure it starts from the beginning
        /* write */ tokenizer.reset();

        // Create an ArrayList to store tokens from the second tokenizer
        ArrayList<String> tokensList = new ArrayList<>();
        
        // Use the second tokenizer to extract tokens and store them in the list
        while (tokenizer2.hasNext()) {
            String token2 = tokenizer2.nextToken();
            tokensList.add(token2);
        }
        
        // Perform some unrelated operations on the tokens list
        for (String s : tokensList) {
            System.out.println("Token from tokenizer2: " + s);
        }
        
        // Add a new token to the list
        tokensList.add("Extra Token");
        
        // Read the first token from the original tokenizer
        /* read */ String token = tokenizer.nextToken();
        
        // Output the token to verify the result
        System.out.println("Token from tokenizer: " + token);
        
        // Perform additional operations on the tokens list
        for (int i = 0; i < tokensList.size(); i++) {
            System.out.println("Token at index " + i + ": " + tokensList.get(i));
        }
    }
}