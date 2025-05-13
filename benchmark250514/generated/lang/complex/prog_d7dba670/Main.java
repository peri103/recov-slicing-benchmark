import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.StringUtils;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello,,World");

        // Set the tokenizer to ignore empty tokens
        /* write */ tokenizer.setIgnoreEmptyTokens(true);

        // Add complexity: use a different StrTokenizer instance
        StrTokenizer tokenizer2 = new StrTokenizer("Java,,Programming");
        tokenizer2.setIgnoreEmptyTokens(false);
        System.out.println("Tokens from tokenizer2:");
        while (tokenizer2.hasNext()) {
            System.out.println(tokenizer2.nextToken());
        }

        // Add complexity: manipulate strings using StringUtils
        String[] words = {"Apache", "Commons", "Lang3"};
        String joinedWords = StringUtils.join(words, "-");
        System.out.println("Joined words: " + joinedWords);

        // Add complexity: perform operations on arrays
        int[] numbers = {5, 10, 15, 20};
        int sum = Arrays.stream(numbers).sum();
        System.out.println("Sum of numbers: " + sum);

        // Add complexity: use tokenizer to extract tokens
        System.out.println("Tokens from tokenizer:");
        while (tokenizer.hasNext()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }

        // Read the first token from the tokenizer
        /* read */ String token = tokenizer.nextToken();

        // Print the token to ensure the read method works
        System.out.println("First token from tokenizer: " + token);
    }
}