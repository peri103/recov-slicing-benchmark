import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String input = "'Hello World'";
        StrTokenizer tokenizer = new StrTokenizer(input);
        
        /* write */ tokenizer.setQuoteChar('\'');
        
        // Additional code to make the program more complex
        ArrayList<String> tokensList = new ArrayList<>();
        while (tokenizer.hasNext()) {
            tokensList.add(tokenizer.nextToken());
        }
        
        String concatenatedTokens = StringUtils.join(tokensList, ", ");
        System.out.println("Concatenated Tokens: " + concatenatedTokens);
        
        // More complex operations
        int sum = 0;
        for (int i = 0; i < tokensList.size(); i++) {
            sum += tokensList.get(i).length();
        }
        System.out.println("Sum of token lengths: " + sum);
        
        // Operations on a different StrTokenizer instance
        StrTokenizer anotherTokenizer = new StrTokenizer("One, Two, Three");
        anotherTokenizer.setDelimiterChar(',');
        while (anotherTokenizer.hasNext()) {
            String token = anotherTokenizer.nextToken();
            System.out.println("Another Token: " + token);
        }
        
        /* read */ String token = tokenizer.nextToken();
        System.out.println(token);
    }
}