import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample input
        StrTokenizer tokenizer = new StrTokenizer("a,b,c");

        // Set the character to be ignored
        /* write */ tokenizer.setIgnoredChar(',');

        // Additional complex operations
        ArrayList<String> tokens = new ArrayList<>();
        StrTokenizer tokenizer2 = new StrTokenizer("d,e,f");
        tokenizer2.setIgnoredChar('e');
        
        // Process tokens from tokenizer2 and add to list
        while (tokenizer2.hasNext()) {
            tokens.add(tokenizer2.nextToken());
        }
        
        // Perform operations on the list of tokens
        tokens.addAll(Arrays.asList("g", "h", "i"));
        
        for (String tok : tokens) {
            System.out.println("Token from tokens list: " + tok);
        }
        
        // Read the next token, which should ignore the character set above
        /* read */ String token = tokenizer.nextToken();
        
        // Output the token to verify the read operation
        System.out.println("First token from tokenizer: " + token);

        // Further operations to make the program more complex
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 2);
        }
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        System.out.println("Sum of numbers: " + sum);
    }
}