import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a string
        StrTokenizer tokenizer = new StrTokenizer("Hello World");

        // Initialize another StrTokenizer with a different string
        StrTokenizer tokenizer2 = new StrTokenizer("Java Programming Language");

        // Set a token character (write method)
        /* write */ tokenizer.setTokenChar('H');

        // Use tokenizer2 to tokenize a different string
        tokenizer2.setTokenChar('J');
        String token2 = tokenizer2.nextToken();
        System.out.println("Token from tokenizer2: " + token2);

        // Initialize an ArrayList with some integers
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        // Perform some operations on the ArrayList
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) * 2);
        }

        // Print the modified ArrayList
        System.out.println("Modified numbers: " + numbers);

        // Read the next token (read method)
        /* read */ String token = tokenizer.nextToken();
        
        // Print the token
        System.out.println("Token from tokenizer: " + token);

        // Additional operations on the ArrayList
        numbers.add(12);
        numbers.remove(0);
        System.out.println("Final numbers: " + numbers);
    }
}