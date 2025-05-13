import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.StringUtils;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        StrTokenizer tokenizer = new StrTokenizer("Hello,World");
        /* write */ tokenizer.setDelimiterString(",");
        
        // Additional complex logic
        HashMap<String, Integer> wordCount = new HashMap<>();
        String phrase = "Hello World Hello Universe";
        StrTokenizer tokenizer2 = new StrTokenizer(phrase);
        tokenizer2.setDelimiterString(" ");
        
        while (tokenizer2.hasNext()) {
            String word = tokenizer2.nextToken();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        StringUtils.capitalize("example");

        // More complex operations
        int totalWords = 0;
        for (String key : wordCount.keySet()) {
            totalWords += wordCount.get(key);
        }
        
        // Unrelated logical operations
        int a = 5, b = 10;
        int sum = a + b;
        int product = a * b;
        System.out.println("Sum: " + sum + ", Product: " + product);
        
        /* read */ String token = tokenizer.nextToken();
        System.out.println("First token: " + token);
        
        // Finalize the word count display
        System.out.println("Total words counted: " + totalWords);
        for (String key : wordCount.keySet()) {
            System.out.println(key + ": " + wordCount.get(key));
        }
    }
}