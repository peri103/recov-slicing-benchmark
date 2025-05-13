import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello,World,Java,Programming");
        
        // Set the delimiter to a comma
        StrMatcher delimiterMatcher = StrMatcher.charMatcher(',');
        /* write */ tokenizer.setDelimiterMatcher(delimiterMatcher);

        // Initialize another StrTokenizer for additional complexity
        StrTokenizer tokenizer2 = new StrTokenizer("Apache,Commons,Lang3");
        tokenizer2.setDelimiterMatcher(StrMatcher.charMatcher(','));

        // Use StringUtils for additional string operations
        String reversedString = StringUtils.reverse("Example");
        System.out.println("Reversed String: " + reversedString);

        // Process tokens from the second tokenizer
        while (tokenizer2.hasNext()) {
            String token2 = tokenizer2.nextToken();
            System.out.println("Token from tokenizer2: " + token2);
        }

        // Read the next token from the first tokenizer, which should be "Hello"
        /* read */ String token = tokenizer.nextToken();
        
        System.out.println("Token from tokenizer1: " + token);

        // Additional string manipulation using StringUtils
        String capitalizedString = StringUtils.capitalize("java programming");
        System.out.println("Capitalized String: " + capitalizedString);
    }
}