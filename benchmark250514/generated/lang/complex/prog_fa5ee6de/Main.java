import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        StrTokenizer tokenizer = new StrTokenizer("apple,banana,orange");
        ArrayList<String> fruitsList = new ArrayList<>();
        HashMap<String, Integer> fruitCount = new HashMap<>();

        // Populate the fruitsList with some fruits
        fruitsList.add("apple");
        fruitsList.add("banana");
        fruitsList.add("orange");
        fruitsList.add("grape");
        fruitsList.add("kiwi");

        // Count occurrences of each fruit in the list
        for (String fruit : fruitsList) {
            fruitCount.put(fruit, fruitCount.getOrDefault(fruit, 0) + 1);
        }

        // Print the fruit count
        System.out.println("Fruit count:");
        for (String key : fruitCount.keySet()) {
            System.out.println(key + ": " + fruitCount.get(key));
        }

        /* write */ tokenizer.setDelimiterString(",");

        // Simulate some complex operation
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares from 0 to 9: " + sum);

        // Another complex operation with strings
        StringBuilder sb = new StringBuilder();
        for (String fruit : fruitsList) {
            sb.append(fruit.toUpperCase()).append(" ");
        }
        System.out.println("Uppercase fruits: " + sb.toString().trim());

        /* read */ String token = tokenizer.nextToken();
        System.out.println("First token: " + token);

        // Additional logic to manipulate the list
        fruitsList.remove("kiwi");
        fruitsList.add("mango");

        // Print the updated list
        System.out.println("Updated fruits list:");
        for (String fruit : fruitsList) {
            System.out.println(fruit);
        }
    }
}