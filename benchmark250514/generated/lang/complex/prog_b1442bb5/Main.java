import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String input = "apple,,banana,,orange";
        StrTokenizer tokenizer = new StrTokenizer(input, ',');

        /* write */ tokenizer.setIgnoreEmptyTokens(true);

        // Additional complexity: using ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("grape");
        fruits.add("melon");
        fruits.add("kiwi");

        // Additional complexity: using HashMap
        HashMap<String, Integer> fruitQuantities = new HashMap<>();
        fruitQuantities.put("apple", 10);
        fruitQuantities.put("banana", 20);
        fruitQuantities.put("orange", 30);

        // Process the ArrayList
        for (String fruit : fruits) {
            System.out.println("Processing fruit: " + fruit);
            fruitQuantities.put(fruit, fruit.length() * 2);
        }

        // Process the HashMap
        for (String key : fruitQuantities.keySet()) {
            System.out.println("Fruit: " + key + ", Quantity: " + fruitQuantities.get(key));
        }

        // Further complexity: Perform some calculations
        int totalQuantity = 0;
        for (Integer quantity : fruitQuantities.values()) {
            totalQuantity += quantity;
        }
        System.out.println("Total quantity of all fruits: " + totalQuantity);

        // Additional unrelated logic
        int number = 42;
        int result = number * 2 + 10 / 5 - 3;
        System.out.println("Result of calculation: " + result);

        // Back to the original task
        /* read */ String token = tokenizer.nextToken();
        System.out.println("Next token: " + token); // Output: apple
    }
}