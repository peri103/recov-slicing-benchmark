import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello,World,Apache,Commons");
        
        // Initialize another StrTokenizer with different delimiters
        StrTokenizer anotherTokenizer = new StrTokenizer("Java;Python;C++");
        anotherTokenizer.setDelimiterMatcher(StrMatcher.charMatcher(';'));
        
        // Initialize an ArrayList to store tokens from anotherTokenizer
        ArrayList<String> tokensList = new ArrayList<>();
        
        // Add tokens from anotherTokenizer to tokensList
        while (anotherTokenizer.hasNext()) {
            tokensList.add(anotherTokenizer.nextToken());
        }
        
        // Perform some operations on tokensList
        for (String token : tokensList) {
            System.out.println("Programming Language: " + token);
        }
        
        // Setting a delimiter matcher to split tokens by comma
        /* write */ tokenizer.setDelimiterMatcher(StrMatcher.charMatcher(','));
        
        // Perform unrelated operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 4 is: " + sum);
        
        // Initialize another StrTokenizer with space delimiter
        StrTokenizer spaceTokenizer = new StrTokenizer("One Two Three");
        spaceTokenizer.setDelimiterMatcher(StrMatcher.spaceMatcher());
        
        // Print tokens from spaceTokenizer
        while (spaceTokenizer.hasNext()) {
            System.out.println("Number word: " + spaceTokenizer.nextToken());
        }
        
        // Reading the next token after applying the delimiter matcher
        /* read */ String token = tokenizer.nextToken();
        
        System.out.println("First token from original tokenizer: " + token); // Output should be "Hello"
    }
}