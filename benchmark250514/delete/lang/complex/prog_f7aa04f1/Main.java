import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.StringJoiner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello World");

        // Set a custom token matcher using the write method
        /* write */ tokenizer.setTokenMatcher(StrMatcher.charMatcher(' '));

        // Unrelated code to demonstrate more complexity
        String[] words = {"Java", "is", "fun"};
        StringJoiner joiner = new StringJoiner(", ");
        for (String word : words) {
            joiner.add(word);
        }
        System.out.println("Joined words: " + joiner.toString());

        // Another StrTokenizer instance to tokenize a different string
        StrTokenizer tokenizer2 = new StrTokenizer("Apache Commons Lang");
        tokenizer2.setDelimiterMatcher(StrMatcher.charMatcher(' '));
        while (tokenizer2.hasNext()) {
            System.out.println("Token from tokenizer2: " + tokenizer2.nextToken());
        }

        // Read the first token using the read method
        /* read */ String token = tokenizer.nextToken();

        // Print the token
        System.out.println(token);

        // Additional logic using arrays
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = Arrays.stream(numbers).sum();
        System.out.println("Sum of numbers: " + sum);
    }
}