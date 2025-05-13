import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("a,b,c");

        // Set the character to be ignored
        /* write */ tokenizer.setIgnoredChar(',');

        // Initialize another StrTokenizer
        StrTokenizer tokenizer2 = new StrTokenizer("1|2|3");
        tokenizer2.setDelimiterChar('|');

        // Tokenize using the second tokenizer
        List<String> tokens = new ArrayList<>();
        while (tokenizer2.hasNext()) {
            tokens.add(tokenizer2.nextToken());
        }

        // Perform some operations on the tokens list
        for (String t : tokens) {
            System.out.println("Token from tokenizer2: " + t);
        }

        // Read the next token from the first tokenizer
        /* read */ String token = tokenizer.nextToken();

        // Print the token
        System.out.println("Token from tokenizer: " + token);

        // Additional logic with the tokens
        List<Integer> numbers = new ArrayList<>();
        for (String t : tokens) {
            numbers.add(Integer.parseInt(t));
        }

        // Sum the numbers
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Print remaining tokens from the first tokenizer
        while (tokenizer.hasNext()) {
            System.out.println("Remaining token: " + tokenizer.nextToken());
        }
    }
}