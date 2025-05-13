import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize tokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello, World! Welcome to Java Programming.");

        // Set a matcher to ignore commas
        /* write */ tokenizer.setIgnoredMatcher(StrMatcher.charMatcher(','));

        // Create a list to store tokens
        ArrayList<String> tokenList = new ArrayList<>();

        // Process tokens and add them to the list
        while (tokenizer.hasNext()) {
            tokenList.add(tokenizer.nextToken());
        }

        // Print all tokens
        for (String token : tokenList) {
            System.out.println(token);
        }

        // Initialize another tokenizer
        StrTokenizer tokenizer2 = new StrTokenizer("Java is fun. Let's code!");
        tokenizer2.setIgnoredMatcher(StrMatcher.charMatcher('.'));

        // Read the next token from the first tokenizer
        /* read */ String firstToken = tokenizer.nextToken();
        System.out.println("First token from original tokenizer: " + firstToken);

        // Process tokens from the second tokenizer
        ArrayList<String> tokenList2 = new ArrayList<>();
        while (tokenizer2.hasNext()) {
            tokenList2.add(tokenizer2.nextToken());
        }

        // Print all tokens from the second tokenizer
        for (String token : tokenList2) {
            System.out.println(token);
        }

        // Additional logic to manipulate tokens in tokenList
        for (int i = 0; i < tokenList.size(); i++) {
            String modifiedToken = tokenList.get(i).toUpperCase();
            System.out.println("Modified Token: " + modifiedToken);
        }
    }
}