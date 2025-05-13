import org.apache.commons.lang3.text.StrTokenizer;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello 'World'!");

        // Additional code: Create and manipulate a list
        List<String> words = Arrays.asList("Java", "Python", "C++");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word).append(" ");
        }

        // Set the quote character using the write method
        /* write */ tokenizer.setQuoteChar('\'');

        // More complex operations: Tokenize and process the string
        StrTokenizer tokenizer2 = new StrTokenizer(sb.toString());
        tokenizer2.setDelimiterChar(' ');
        while (tokenizer2.hasNext()) {
            String language = tokenizer2.nextToken();
            System.out.println("Language: " + language);
        }

        // Retrieve the next token using the read method
        /* read */ String token = tokenizer.nextToken();

        // Print the token to verify the output
        System.out.println("First Token: " + token);

        // Additional logic: Perform arithmetic operations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 numbers: " + sum);

        // Final operations: Concatenate strings
        String finalString = sb.toString() + "is fun!";
        System.out.println(finalString);
    }
}