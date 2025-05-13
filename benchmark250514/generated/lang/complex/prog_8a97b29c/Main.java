import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize StrTokenizer
        StrTokenizer tokenizer = new StrTokenizer("Hello|World|Apache|Commons");
        
        // Initialize StrBuilder
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.append("Initial String");
        
        // Initialize ArrayList
        ArrayList<String> tokensList = new ArrayList<>();
        
        // Modify the delimiter character
        /* write */ tokenizer.setDelimiterChar('|');
        
        // Add more tokens to StrBuilder
        strBuilder.appendSeparator('|');
        strBuilder.append("More|Tokens");
        
        // Add tokens from StrTokenizer to ArrayList
        while (tokenizer.hasNext()) {
            tokensList.add(tokenizer.nextToken());
        }
        
        // Process tokens in the ArrayList
        for (String token : tokensList) {
            strBuilder.appendSeparator('-');
            strBuilder.append(token);
        }
        
        // Print the final string built using StrBuilder
        System.out.println("Final String: " + strBuilder.toString());
        
        // Initialize another StrTokenizer with a different string
        StrTokenizer anotherTokenizer = new StrTokenizer("Java|Programming|Language");
        anotherTokenizer.setDelimiterChar('|');
        
        // Read the first token from the original tokenizer
        /* read */ String firstToken = tokenizer.nextToken();
        System.out.println("First Token: " + firstToken);
        
        // Read and print tokens from the second tokenizer
        while (anotherTokenizer.hasNext()) {
            String token = anotherTokenizer.nextToken();
            System.out.println("Another Token: " + token);
        }
    }
}