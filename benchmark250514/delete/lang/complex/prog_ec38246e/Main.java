import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StrTokenizer tokenizer = new StrTokenizer("example");
        List<String> tokenList = new ArrayList<>();
        
        // Additional code to make the program more complex
        StrTokenizer tokenizer2 = new StrTokenizer("additional example");
        tokenizer2.setDelimiterChar(' ');

        while (tokenizer2.hasNext()) {
            tokenList.add(tokenizer2.nextToken());
        }

        // Additional unrelated operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 4: " + sum);

        /* write */ tokenizer.setTokenChar('x');

        // More complex operations
        for (String token : tokenList) {
            System.out.println("Token from tokenizer2: " + token);
        }

        // Some calculations
        double result = Math.pow(2, 3) * Math.sqrt(16);
        System.out.println("Result of calculation: " + result);

        /* read */ String token = tokenizer.nextToken();
        System.out.println("Token from tokenizer: " + token);

        // Additional loop to process the list
        for (int i = 0; i < tokenList.size(); i++) {
            System.out.println("Processing token: " + tokenList.get(i));
        }

        // Final output
        System.out.println("Program completed successfully.");
    }
}