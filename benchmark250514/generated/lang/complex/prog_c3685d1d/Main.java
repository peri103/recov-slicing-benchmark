import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample text
        StrTokenizer tokenizer = new StrTokenizer("Hello 'World' and 'Java'");

        // Set the quote character to handle quoted text
        /* write */ tokenizer.setQuoteChar('\'');

        // Additional logic to manipulate and analyze text using StringUtils
        String text = "   Apache Commons Lang   ";
        String trimmedText = StringUtils.trim(text);
        System.out.println("Trimmed text: " + trimmedText);

        // Use ArrayList to store tokens
        ArrayList<String> tokens = new ArrayList<>();
        while (tokenizer.hasNext()) {
            String currentToken = tokenizer.nextToken();
            tokens.add(currentToken);
        }

        // Perform some operations on the tokens list
        for (String token : tokens) {
            System.out.println("Token length: " + token.length());
        }

        // Read the first token, which should respect the quote character setting
        /* read */ String firstToken = tokenizer.nextToken();

        // Output the first token
        System.out.println("First token: " + firstToken);

        // Additional operations with the tokens list
        if (!tokens.isEmpty()) {
            System.out.println("Total tokens: " + tokens.size());
            String joinedTokens = StringUtils.join(tokens, ", ");
            System.out.println("Joined tokens: " + joinedTokens);
        }
    }
}