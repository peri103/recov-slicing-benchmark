import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("apple,banana,orange");

        // Set a custom token matcher to split tokens by commas
        /* write */ tokenizer.setTokenMatcher(StrMatcher.commaMatcher());

        // Create a new ArrayList to store tokens
        ArrayList<String> tokensList = new ArrayList<>();

        // Use another StrTokenizer to split a different string
        StrTokenizer additionalTokenizer = new StrTokenizer("cat,dog,mouse");
        additionalTokenizer.setTokenMatcher(StrMatcher.commaMatcher());
        while (additionalTokenizer.hasNext()) {
            tokensList.add(additionalTokenizer.nextToken());
        }

        // Perform some operations on the tokensList
        tokensList.add("elephant");
        tokensList.remove(1);
        tokensList.add("tiger");

        // Iterate over the tokensList and print each token
        for (String token : tokensList) {
            System.out.println("Token from additionalTokenizer: " + token);
        }

        // Read the first token from the original tokenizer
        /* read */ String firstToken = tokenizer.nextToken();

        // Print the first token from the original tokenizer
        System.out.println("First token from original tokenizer: " + firstToken);

        // Further operations to make the program complex
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Create another ArrayList to demonstrate unrelated code
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 10);
        }

        // Print numbers from the unrelated ArrayList
        for (int number : numbers) {
            System.out.println("Number from unrelated list: " + number);
        }
    }
}