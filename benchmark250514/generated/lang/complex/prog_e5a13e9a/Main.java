import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrTokenizer tokenizer = new StrTokenizer("Hello 'World' Example");
        ArrayList<String> tokensList = new ArrayList<>();

        /* write */ tokenizer.setQuoteChar('\'');
        
        // Adding some complexity with String manipulation
        String initialString = "Hello, how are you doing today?";
        String reversedString = StringUtils.reverse(initialString);
        System.out.println("Reversed String: " + reversedString);
        
        // Tokenizing the initial string using a different tokenizer
        StrTokenizer anotherTokenizer = new StrTokenizer(initialString);
        anotherTokenizer.setDelimiterString(" ");
        while (anotherTokenizer.hasNext()) {
            String token = anotherTokenizer.nextToken();
            tokensList.add(token);
        }
        
        // Processing the tokens to create a new sentence
        StringBuilder processedString = new StringBuilder();
        for (String token : tokensList) {
            processedString.append(StringUtils.capitalize(token)).append(" ");
        }
        System.out.println("Processed String: " + processedString.toString().trim());
        
        // Using the original tokenizer to read the next token
        /* read */ String token = tokenizer.nextToken();
        System.out.println("First Token: " + token);
        
        // Further processing on the token list
        for (String tokenInList : tokensList) {
            System.out.println("Token from List: " + tokenInList);
        }
    }
}