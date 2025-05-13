import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        // Initialize a StrTokenizer with some initial text
        StrTokenizer tokenizer = new StrTokenizer("Hello,World,This,Is,A,Test");

        // Set the delimiter to a comma using the setDelimiterMatcher method
        /* write */ tokenizer.setDelimiterMatcher(StrMatcher.charMatcher(','));

        // Read the first token using the nextToken method
        /* read */ String firstToken = tokenizer.nextToken();

        // Print the first token
        System.out.println(firstToken);
    }
}