import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello,World,Java,Programming");

        // Reset the tokenizer to ensure it starts from the beginning
        /* write */ tokenizer.reset();

        // Additional unrelated code to make the program more complex
        ArrayList<String> words = new ArrayList<>();
        StrTokenizer anotherTokenizer = new StrTokenizer("Complex,Code,Example");
        while (anotherTokenizer.hasNext()) {
            words.add(anotherTokenizer.nextToken());
        }

        // Perform some operations on the collected words
        for (String word : words) {
            System.out.println("Word from another tokenizer: " + word);
        }

        // More complex operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Read the first token using nextToken
        /* read */ String token = tokenizer.nextToken();

        // Print the token to ensure the read method worked correctly
        System.out.println("First token from tokenizer: " + token);

        // More complex operations with the original tokenizer
        ArrayList<String> tokensList = new ArrayList<>();
        while (tokenizer.hasNext()) {
            tokensList.add(tokenizer.nextToken());
        }

        // Print all tokens collected from the original tokenizer
        for (String t : tokensList) {
            System.out.println("Token from original tokenizer: " + t);
        }
    }
}