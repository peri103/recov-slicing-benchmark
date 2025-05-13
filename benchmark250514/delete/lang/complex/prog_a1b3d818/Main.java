import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("apple,banana,orange");

        // Create a custom StrMatcher that matches commas
        StrMatcher matcher = StrMatcher.charMatcher(',');

        // Use setTokenMatcher to set the custom matcher
        /* write */ tokenizer.setTokenMatcher(matcher);

        // Add complexity: Reverse the tokens and join them with a hyphen
        String[] tokens = tokenizer.getTokenArray();
        String reversedTokens = StringUtils.reverse(StringUtils.join(tokens, "-"));
        System.out.println("Reversed Tokens: " + reversedTokens);

        // Add complexity: Check if the original string contains the word "apple"
        boolean containsApple = StringUtils.containsIgnoreCase("apple,banana,orange", "apple");
        System.out.println("Contains 'apple': " + containsApple);

        // Read the first token using nextToken
        /* read */ String token = tokenizer.nextToken();

        // Output the first token
        System.out.println("First Token: " + token);

        // Add complexity: Convert the first token to uppercase
        String upperToken = StringUtils.upperCase(token);
        System.out.println("Uppercase First Token: " + upperToken);

        // Add complexity: Calculate the length of the original string
        int originalLength = StringUtils.length("apple,banana,orange");
        System.out.println("Original String Length: " + originalLength);
    }
}