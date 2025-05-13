import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;

public class Main {
    public static void main(String[] args) {
        String input = "apple,banana,cherry";
        StrTokenizer tokenizer = new StrTokenizer(input);
        
        // Set the delimiter to a comma
        StrMatcher delimiterMatcher = StrMatcher.charMatcher(',');
        /* write */ tokenizer.setDelimiterMatcher(delimiterMatcher);
        
        // Read the first token
        /* read */ String token = tokenizer.nextToken();
        System.out.println(token);
    }
}