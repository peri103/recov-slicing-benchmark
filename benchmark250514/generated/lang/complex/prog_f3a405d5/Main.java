import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a string
        StrTokenizer tokenizer = new StrTokenizer("Hello,World");
        
        // Initialize another StrTokenizer with different delimiters
        StrTokenizer tokenizer2 = new StrTokenizer("Java-Programming-Language", '-');

        // Reset the tokenizer to the initial state
        /* write */ tokenizer.reset();

        // Perform some operations using StringUtils
        String reversed = StringUtils.reverse("Complexity");
        System.out.println("Reversed String: " + reversed);

        // Split another string using StrTokenizer
        tokenizer2.reset();
        while (tokenizer2.hasNext()) {
            System.out.println("Token from tokenizer2: " + tokenizer2.nextToken());
        }

        // Perform a mathematical calculation
        int a = 5;
        int b = 10;
        int sum = a + b;
        System.out.println("Sum: " + sum);

        // Read the first token from the original tokenizer
        /* read */ String token = tokenizer.nextToken();

        // Output the token
        System.out.println("Token from tokenizer: " + token);

        // Use StringUtils to check if a string is numeric
        boolean isNumeric = StringUtils.isNumeric("12345");
        System.out.println("Is numeric: " + isNumeric);

        // Perform a loop operation
        for (int i = 0; i < 3; i++) {
            System.out.println("Loop iteration: " + i);
        }
    }
}