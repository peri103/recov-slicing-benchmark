import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize the tokenizer with a string
        StrTokenizer tokenizer = new StrTokenizer("a,b,c,d");
        
        // Use StringUtils to perform some operations
        String reversed = StringUtils.reverse("abcd");
        System.out.println("Reversed String: " + reversed);

        // Set ignored character in the tokenizer
        /* write */ tokenizer.setIgnoredChar(',');

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers 1 to 10: " + sum);

        // Use another StrTokenizer for different operations
        StrTokenizer tokenizer2 = new StrTokenizer("e,f,g,h");
        tokenizer2.setDelimiterChar(';');
        while (tokenizer2.hasNext()) {
            System.out.println("Token from tokenizer2: " + tokenizer2.nextToken());
        }

        // Read the next token from the original tokenizer
        /* read */ String token = tokenizer.nextToken();
        System.out.println("First token from tokenizer: " + token);

        // Perform some additional operations
        String joinedString = StringUtils.join(new String[]{"Hello", "World"}, " ");
        System.out.println("Joined String: " + joinedString);

        // Another loop to demonstrate complexity
        for (int j = 0; j < 5; j++) {
            System.out.println("Number: " + j);
        }
    }
}