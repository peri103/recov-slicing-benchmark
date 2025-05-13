import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello,World,Apache,Commons");

        // Set the delimiter matcher to split tokens by comma
        /* write */ tokenizer.setDelimiterMatcher(StrMatcher.charMatcher(','));

        // Initialize a list to store tokens
        List<String> tokenList = new ArrayList<>();

        // Add tokens to the list
        while (tokenizer.hasNext()) {
            tokenList.add(tokenizer.nextToken());
        }

        // Perform some operations on the list
        tokenList.add("Library");
        tokenList.remove(1);
        tokenList.add("Text");

        // Initialize another StrTokenizer with a different string
        StrTokenizer anotherTokenizer = new StrTokenizer("Java,Programming,Language");
        anotherTokenizer.setDelimiterMatcher(StrMatcher.charMatcher(','));

        // Read the next token from the original tokenizer, which should be "Hello"
        /* read */ String token = tokenizer.nextToken();
        
        // Output the token
        System.out.println(token);

        // Perform operations on the second tokenizer
        while (anotherTokenizer.hasNext()) {
            String anotherToken = anotherTokenizer.nextToken();
            System.out.println(anotherToken);
        }

        // Output the final list of tokens
        System.out.println(tokenList);
    }
}