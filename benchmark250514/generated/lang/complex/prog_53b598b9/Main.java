import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrTokenizer tokenizer = new StrTokenizer("Hello,World");
        
        // Perform some unrelated operations
        ArrayList<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Python");
        words.add("C++");
        for (String word : words) {
            System.out.println("Language: " + word);
        }
        
        // Additional StrTokenizer operation
        StrTokenizer tokenizer2 = new StrTokenizer("Apple|Banana|Cherry");
        tokenizer2.setDelimiterMatcher(StrMatcher.charMatcher('|'));
        while (tokenizer2.hasNext()) {
            System.out.println("Fruit: " + tokenizer2.nextToken());
        }
        
        /* write */ tokenizer.setDelimiterMatcher(StrMatcher.charMatcher(','));
        
        // More unrelated logic
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of 1 to 10: " + sum);
        
        // Continue with unrelated operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
        
        /* read */ String token = tokenizer.nextToken();
        System.out.println("First token: " + token);
        
        // Final unrelated computation
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of 1 to 5: " + product);
    }
}