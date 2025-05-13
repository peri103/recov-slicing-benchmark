import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize a StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello,,World");

        // Write operation: setIgnoreEmptyTokens to true
        /* write */ tokenizer.setIgnoreEmptyTokens(true);

        // Initialize another StrTokenizer with a different string
        StrTokenizer tokenizer2 = new StrTokenizer("Java,Python,,C++");
        tokenizer2.setIgnoreEmptyTokens(true);

        // Use tokenizer2 to parse tokens and store them in a list
        List<String> tokensList = new ArrayList<>();
        while (tokenizer2.hasNext()) {
            tokensList.add(tokenizer2.nextToken());
        }

        // Perform some operations on the tokensList
        for (String token : tokensList) {
            System.out.println("Token from tokenizer2: " + token);
        }

        // Read operation: get the next token from the original tokenizer
        /* read */ String token = tokenizer.nextToken();

        // Print the token to ensure the read operation works correctly
        System.out.println("Token from tokenizer: " + token);

        // More complex operations with tokensList
        tokensList.add("JavaScript");
        tokensList.add("Ruby");
        tokensList.remove("Python");

        // Print all tokens from tokensList
        for (String t : tokensList) {
            System.out.println("Updated token list: " + t);
        }
    }
}