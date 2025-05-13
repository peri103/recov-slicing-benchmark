import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample text
        StrTokenizer tokenizer = new StrTokenizer("Hello 'World'");

        // Create an ArrayList to store tokens
        List<String> tokensList = new ArrayList<>();

        // Set the quote character using the write method
        /* write */ tokenizer.setQuoteChar('\'');

        // Add some unrelated operations to make the program more complex
        String[] sampleTexts = {"Example", "Text", "Array"};
        for (String text : sampleTexts) {
            StrTokenizer tempTokenizer = new StrTokenizer(text);
            while (tempTokenizer.hasNext()) {
                tokensList.add(tempTokenizer.nextToken());
            }
        }

        // Perform some operations on the tokensList
        List<String> processedTokens = new ArrayList<>();
        for (String token : tokensList) {
            processedTokens.add(token.toUpperCase());
        }

        // Output the processed tokens
        for (String processedToken : processedTokens) {
            System.out.println(processedToken);
        }

        // Read the next token using the read method
        /* read */ String token = tokenizer.nextToken();

        // Output the token read
        System.out.println(token);

        // More complex operations
        int sum = 0;
        for (String token : processedTokens) {
            sum += token.length();
        }
        System.out.println("Total length of processed tokens: " + sum);
    }
}