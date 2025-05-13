import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the tokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("  Hello, World!  ");
        
        // Use setTrimmerMatcher to trim the whitespace characters
        /* write */ tokenizer.setTrimmerMatcher(StrMatcher.trimMatcher());
        
        // Create a list to hold tokens
        ArrayList<String> tokens = new ArrayList<>();
        
        // Add additional functionality: reverse a string
        String reversedString = StringUtils.reverse("Hello, World!");
        System.out.println("Reversed: " + reversedString);
        
        // Add tokens to the list while processing the tokenizer
        while (tokenizer.hasNext()) {
            tokens.add(tokenizer.nextToken());
        }
        
        // Process the list of tokens and perform some operations
        for (String token : tokens) {
            // Convert each token to uppercase
            String upperToken = token.toUpperCase();
            System.out.println("Uppercase Token: " + upperToken);
        }
        
        // Read the first token after trimming
        /* read */ String token = tokenizer.nextToken();
        
        // Print the token
        System.out.println("First Token: " + token);
        
        // Add more complex logic: concatenate all tokens
        StringBuilder concatenatedTokens = new StringBuilder();
        for (String token : tokens) {
            concatenatedTokens.append(token).append(" ");
        }
        System.out.println("Concatenated Tokens: " + concatenatedTokens.toString().trim());
    }
}