import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String input = "apple;banana;cherry";
        StrTokenizer tokenizer = new StrTokenizer(input);
        
        // Additional functionality with ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("orange");
        fruits.add("grape");
        
        for (String fruit : fruits) {
            System.out.println("Fruit from ArrayList: " + fruit);
        }
        
        /* write */ tokenizer.setDelimiterString(";");
        
        // Further processing before reading the token
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
            System.out.println("Current sum: " + sum);
        }
        
        // Additional StrTokenizer usage
        StrTokenizer anotherTokenizer = new StrTokenizer("dog,cat,bird");
        anotherTokenizer.setDelimiterString(",");
        while (anotherTokenizer.hasNext()) {
            System.out.println("Animal: " + anotherTokenizer.nextToken());
        }
        
        /* read */ String token = tokenizer.nextToken();
        
        System.out.println("First token: " + token);
        
        // Additional calculations
        int product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
            System.out.println("Current product: " + product);
        }
        
        // Further ArrayList operations
        fruits.add("pineapple");
        for (String fruit : fruits) {
            System.out.println("Updated Fruit List: " + fruit);
        }
    }
}