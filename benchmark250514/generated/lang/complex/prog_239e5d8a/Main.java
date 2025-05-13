import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("one,two,three,four,five");
        
        // Set the delimiter character to ','
        /* write */ tokenizer.setDelimiterChar(',');

        // Create an ArrayList to store tokens
        ArrayList<String> tokensList = new ArrayList<>();
        
        // Add tokens from tokenizer to tokensList
        while (tokenizer.hasNext()) {
            tokensList.add(tokenizer.nextToken());
        }
        
        // Perform some operations on tokensList
        tokensList.add("six");
        tokensList.remove("two");
        tokensList.addAll(Arrays.asList("seven", "eight"));
        
        // Print all tokens in tokensList
        for (String token : tokensList) {
            System.out.println(token);
        }

        // Read the first token
        /* read */ String firstToken = tokenizer.nextToken();
        
        // Output the first token
        System.out.println("First token: " + firstToken);

        // Initialize another StrTokenizer with a different string
        StrTokenizer anotherTokenizer = new StrTokenizer("alpha;beta;gamma");
        anotherTokenizer.setDelimiterChar(';');
        
        // Read and print tokens from anotherTokenizer
        while (anotherTokenizer.hasNext()) {
            System.out.println(anotherTokenizer.nextToken());
        }
        
        // Perform some unrelated mathematical calculations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);
    }
}