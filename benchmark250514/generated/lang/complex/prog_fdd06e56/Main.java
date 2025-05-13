import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with some data
        StrTokenizer tokenizer = new StrTokenizer("  Hello World  ");
        
        // Initialize another StrTokenizer with different data
        StrTokenizer tokenizer2 = new StrTokenizer("Java Programming Language");
        
        // Set a trimmer matcher to trim spaces for the first tokenizer
        /* write */ tokenizer.setTrimmerMatcher(StrMatcher.trimMatcher());

        // Perform some unrelated operations
        ArrayList<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        
        for (String str : list) {
            System.out.println("List item: " + str);
        }

        // Use the second tokenizer to tokenize and process data
        while (tokenizer2.hasNext()) {
            String token2 = tokenizer2.nextToken();
            System.out.println("Token from tokenizer2: " + token2);
        }

        // Read the next token from the first tokenizer
        /* read */ String token = tokenizer.nextToken();
        
        // Output the read token
        System.out.println("Token from tokenizer: " + token);
        
        // Perform additional unrelated operations
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
        
        StrTokenizer tokenizer3 = new StrTokenizer("Apache Commons Lang");
        tokenizer3.setIgnoreEmptyTokens(true);
        while (tokenizer3.hasNext()) {
            String token3 = tokenizer3.nextToken();
            System.out.println("Token from tokenizer3: " + token3);
        }
    }
}