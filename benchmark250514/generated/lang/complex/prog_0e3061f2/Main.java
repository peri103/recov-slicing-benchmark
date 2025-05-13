import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("  Hello World  ");
        
        // Initialize another StrTokenizer with a different string
        StrTokenizer tokenizer2 = new StrTokenizer("Java Programming Language");
        
        // Set the TrimmerMatcher to trim leading and trailing spaces for the first tokenizer
        /* write */ tokenizer.setTrimmerMatcher(StrMatcher.trimMatcher());
        
        // Use the second tokenizer to split the string into tokens and store them in an ArrayList
        ArrayList<String> tokensList = new ArrayList<>();
        while (tokenizer2.hasNext()) {
            tokensList.add(tokenizer2.nextToken());
        }

        // Process the tokens in the list and print them
        for (String token : tokensList) {
            System.out.println("Token from tokenizer2: " + token);
        }

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Retrieve the next token from the first tokenizer after trimming
        /* read */ String token = tokenizer.nextToken();

        // Print the token from the first tokenizer
        System.out.println("Token from tokenizer1: " + token);

        // Add more complexity with additional operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * i);
        }
        for (Integer number : numbers) {
            System.out.println("Square: " + number);
        }
    }
}