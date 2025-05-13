import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize StrTokenizer with a sample string
        StrTokenizer tokenizer = new StrTokenizer("Hello,World,This,Is,A,Test");

        // Use the nextToken method to read the first token
        /* read */ String firstToken = tokenizer.nextToken();

        // Create an ArrayList and populate it with values
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        // Create a HashMap to store token counts
        HashMap<String, Integer> tokenCountMap = new HashMap<>();
        tokenCountMap.put("Hello", 1);
        tokenCountMap.put("World", 2);

        // Print all tokens in the ArrayList
        for (Integer num : numbers) {
            System.out.println("Number: " + num);
        }

        // Reset the tokenizer to start reading from the beginning again
        /* write */ tokenizer.reset();

        // Use the nextToken method again to read the first token after reset
        /* read */ String resetToken = tokenizer.nextToken();

        // Print the first token read after reset
        System.out.println("Reset Token: " + resetToken);

        // Print the token counts from the HashMap
        for (String key : tokenCountMap.keySet()) {
            System.out.println("Token: " + key + ", Count: " + tokenCountMap.get(key));
        }
    }
}