import org.apache.commons.lang3.text.StrTokenizer;
import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String input = "apple,,banana,,cherry";
        StrTokenizer tokenizer = new StrTokenizer(input, ',');
        
        // Additional operations with StrTokenizer
        StrTokenizer anotherTokenizer = new StrTokenizer("dog;cat;bird", ';');
        anotherTokenizer.setIgnoreEmptyTokens(false);
        String[] tokensArray = anotherTokenizer.getTokenArray();
        ArrayList<String> tokensList = new ArrayList<>(Arrays.asList(tokensArray));
        
        /* write */ tokenizer.setIgnoreEmptyTokens(true);
        
        // Unrelated complex operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        
        System.out.println("Sum of numbers: " + sum);
        
        // More operations with StrTokenizer
        String joinedTokens = StringUtils.join(tokensList, "-");
        System.out.println("Joined tokens: " + joinedTokens);
        
        /* read */ String token = tokenizer.nextToken();
        System.out.println(token); // Output should be "apple"
        
        // Further unrelated operations
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("grape", "orange", "pineapple"));
        fruits.add(token); // Adding the read token to the fruits list
        
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}