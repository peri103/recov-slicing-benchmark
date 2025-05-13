import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a StrTokenizer with some initial text
        StrTokenizer tokenizer = new StrTokenizer("Hello,World,This,Is,A,Test");

        // Set the delimiter to a comma using the setDelimiterMatcher method
        /* write */ tokenizer.setDelimiterMatcher(StrMatcher.charMatcher(','));

        // Create an ArrayList to store tokens
        ArrayList<String> tokenList = new ArrayList<>();

        // Add tokens to the list using a loop
        while (tokenizer.hasNext()) {
            tokenList.add(tokenizer.nextToken());
        }

        // Perform some operations on the list
        if (!tokenList.isEmpty()) {
            System.out.println("First token in the list: " + tokenList.get(0));
        }

        // Initialize another StrTokenizer with different text
        StrTokenizer tokenizer2 = new StrTokenizer("Java,Programming,Language");

        // Set a different delimiter matcher
        tokenizer2.setDelimiterMatcher(StrMatcher.charMatcher(','));

        // Read the first token of the second tokenizer
        String firstToken2 = tokenizer2.nextToken();
        System.out.println("First token from second tokenizer: " + firstToken2);

        // Perform additional operations
        int tokenCount = tokenList.size();
        System.out.println("Total tokens in the first list: " + tokenCount);

        // Read the first token using the nextToken method
        /* read */ String firstToken = tokenizer.nextToken();

        // Print the first token
        System.out.println("First token from original tokenizer: " + firstToken);

        // Further manipulation of the list
        tokenList.add("End");
        System.out.println("Last token added: " + tokenList.get(tokenList.size() - 1));
    }
}