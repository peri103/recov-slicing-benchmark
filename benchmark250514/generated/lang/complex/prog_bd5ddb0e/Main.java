import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Initializing a string for tokenization
        String input = "apple,banana,cherry";
        StrTokenizer tokenizer = new StrTokenizer(input);
        
        // Set the delimiter to a comma
        StrMatcher delimiterMatcher = StrMatcher.charMatcher(',');
        /* write */ tokenizer.setDelimiterMatcher(delimiterMatcher);
        
        // Creating an ArrayList to store tokens
        ArrayList<String> tokenList = new ArrayList<>();
        
        // Adding tokens to the ArrayList
        while (tokenizer.hasNext()) {
            tokenList.add(tokenizer.nextToken());
        }
        
        // Shuffling the list to add complexity
        Collections.shuffle(tokenList);
        
        // Performing some operations on the list
        for (String token : tokenList) {
            System.out.println("Shuffled token: " + token);
        }
        
        // Resetting tokenizer to read the first token again
        tokenizer.reset();
        
        // Read the first token
        /* read */ String token = tokenizer.nextToken();
        System.out.println("First token: " + token);
        
        // Additional operations on the token list
        tokenList.sort(String::compareTo);
        System.out.println("Sorted tokens:");
        for (String sortedToken : tokenList) {
            System.out.println(sortedToken);
        }
    }
}