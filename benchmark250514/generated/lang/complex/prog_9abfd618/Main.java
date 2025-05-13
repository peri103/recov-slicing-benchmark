import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initial setup for StrTokenizer
        String input = "Hello,,World";
        StrTokenizer tokenizer = new StrTokenizer(input, ',');

        // Create and manipulate an ArrayList
        List<String> stringList = new ArrayList<>();
        stringList.add("First");
        stringList.add("Second");
        stringList.add("Third");

        // Process the list elements
        for (String str : stringList) {
            System.out.println("Processing: " + str);
        }

        // Manipulating the tokenizer
        /* write */ tokenizer.setIgnoreEmptyTokens(false);

        // Additional logic before reading the token
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        // Reading the token from the tokenizer
        /* read */ String token = tokenizer.nextToken();
        System.out.println("Token: " + token);

        // More complex operations
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 10);
        }

        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        System.out.println("Product: " + product);
    }
}