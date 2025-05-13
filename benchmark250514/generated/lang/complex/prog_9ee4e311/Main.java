import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrTokenizer tokenizer = new StrTokenizer("  Hello World  ");
        List<String> tokens = new ArrayList<>();

        // Initialize another tokenizer with a different string
        StrTokenizer tokenizer2 = new StrTokenizer("Java is fun");
        tokenizer2.setTrimmerMatcher(StrMatcher.trimMatcher());
        while (tokenizer2.hasNext()) {
            tokens.add(tokenizer2.nextToken());
        }

        // Perform some operations on the list of tokens
        for (String token : tokens) {
            System.out.println("Token from tokenizer2: " + token);
        }

        // Set trimmer matcher on the original tokenizer
        /* write */ tokenizer.setTrimmerMatcher(StrMatcher.trimMatcher());

        // Initialize a list to store tokens from the original tokenizer
        List<String> originalTokens = new ArrayList<>();

        // Add tokens from the original tokenizer to the list
        while (tokenizer.hasNext()) {
            originalTokens.add(tokenizer.nextToken());
        }

        // Perform some operations on the original tokens
        for (String token : originalTokens) {
            System.out.println("Original Token: " + token);
        }

        // Read the first token from the original tokenizer
        /* read */ String token = tokenizer.nextToken();
        System.out.println("Read Token: " + token);

        // Add the token to the list and print the list
        originalTokens.add(token);
        System.out.println("Tokens in originalTokens list: " + originalTokens);
    }
}