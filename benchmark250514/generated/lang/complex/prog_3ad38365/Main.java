import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello 'world'!");
        
        // Additional code for complexity: ArrayList operations
        ArrayList<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Programming");
        words.add("Language");
        
        // Process each word in the ArrayList
        for (String word : words) {
            System.out.println("Processing word: " + word);
            for (int i = 0; i < word.length(); i++) {
                System.out.print(word.charAt(i) + " ");
            }
            System.out.println();
        }
        
        // Set the quote matcher to handle single quotes in StrTokenizer
        /* write */ tokenizer.setQuoteMatcher(StrMatcher.quoteMatcher());

        // More operations on StrTokenizer
        tokenizer.reset("New 'example' string!");
        tokenizer.setDelimiterMatcher(StrMatcher.spaceMatcher());
        
        // Another unrelated operation: reverse a string
        StringBuilder sb = new StringBuilder("Reverse this string");
        String reversed = sb.reverse().toString();
        System.out.println("Reversed string: " + reversed);
        
        // Read the next token, which should respect the quote matcher
        /* read */ String token = tokenizer.nextToken();

        // Output the token
        System.out.println("Token: " + token);
        
        // Additional ArrayList processing
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * i);
        }
        
        for (Integer number : numbers) {
            System.out.println("Square: " + number);
        }
    }
}