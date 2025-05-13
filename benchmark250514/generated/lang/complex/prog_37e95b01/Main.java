import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrMatcher;
import org.apache.commons.lang3.text.StrBuilder;

public class Main {
    public static void main(String[] args) {
        // Initialize a StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello,World,Java,Programming");

        // Additional StrTokenizer for different string manipulation
        StrTokenizer additionalTokenizer = new StrTokenizer("Apples-Oranges-Bananas");
        additionalTokenizer.setDelimiterMatcher(StrMatcher.charMatcher('-'));

        // Initialize a StrBuilder for string manipulation
        StrBuilder builder = new StrBuilder("Initial String");

        // Use StrBuilder to append strings
        builder.append(" - Appended Text");

        // Set the delimiter matcher to split tokens based on comma
        /* write */ tokenizer.setDelimiterMatcher(StrMatcher.charMatcher(','));

        // Perform operations with StrBuilder
        builder.append(" - More Text");
        builder.insert(0, "Start: ");
        builder.deleteFirst("Initial");

        // Read the first token using the nextToken method
        /* read */ String token = tokenizer.nextToken();

        // Print the token
        System.out.println(token);

        // Additional operations with StrTokenizer
        while (additionalTokenizer.hasNext()) {
            System.out.println(additionalTokenizer.nextToken());
        }

        // Print the final state of StrBuilder
        System.out.println(builder.toString());
    }
}