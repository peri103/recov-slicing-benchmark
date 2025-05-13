import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello World from Java");

        // Reset the tokenizer to ensure it starts from the beginning
        /* write */ tokenizer.reset();

        // Initialize a list to hold tokens
        List<String> tokens = new ArrayList<>();

        // Add some unrelated operations
        for (int i = 0; i < 5; i++) {
            tokens.add("Token" + i);
        }

        // Add another StrTokenizer operation
        StrTokenizer anotherTokenizer = new StrTokenizer("Another Test String");
        anotherTokenizer.reset();
        while (anotherTokenizer.hasNext()) {
            tokens.add(anotherTokenizer.nextToken());
        }

        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < tokens.size(); i++) {
            sum += i;
        }

        // Add more unrelated code
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        // Use the original tokenizer to read the next token after resetting
        /* read */ String token = tokenizer.nextToken();

        // Print the token to verify the read operation
        System.out.println(token);

        // Print the tokens collected from the unrelated tokenizer
        for (String str : tokens) {
            System.out.println(str);
        }

        // Print the sum of indices
        System.out.println("Sum of indices: " + sum);

        // Print the numbers
        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}