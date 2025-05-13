import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String input = "Hello, World! This is a test.";
        StrTokenizer tokenizer = new StrTokenizer(input);

        // Set the ignored matcher to ignore spaces
        /* write */ tokenizer.setIgnoredMatcher(StrMatcher.spaceMatcher());

        // Additional unrelated code to make the program more complex
        List<String> sampleList = Arrays.asList("Java", "Python", "C++", "JavaScript");
        for (String language : sampleList) {
            System.out.println("Programming Language: " + language);
        }

        // Another StrTokenizer operation
        StrTokenizer tokenizer2 = new StrTokenizer("A B C D");
        tokenizer2.setDelimiterMatcher(StrMatcher.charSetMatcher(' '));
        while (tokenizer2.hasNext()) {
            System.out.println("Token from tokenizer2: " + tokenizer2.nextToken());
        }

        // Read the first token from the original tokenizer
        /* read */ String token = tokenizer.nextToken();
        System.out.println(token);

        // More complex operations
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 100: " + sum);

        // Another unrelated StrTokenizer operation
        StrTokenizer tokenizer3 = new StrTokenizer("X Y Z");
        tokenizer3.setDelimiterMatcher(StrMatcher.charSetMatcher(' '));
        while (tokenizer3.hasNext()) {
            System.out.println("Token from tokenizer3: " + tokenizer3.nextToken());
        }
    }
}