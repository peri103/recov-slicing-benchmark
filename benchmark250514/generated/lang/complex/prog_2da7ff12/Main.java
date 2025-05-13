import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a StrTokenizer with a string
        String input = "apple,banana,cherry";
        StrTokenizer tokenizer = new StrTokenizer(input);

        // Initialize a HashMap to store some key-value pairs
        HashMap<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("apple", 1);
        fruitMap.put("banana", 2);
        fruitMap.put("cherry", 3);

        // Initialize an ArrayList to hold some values
        ArrayList<String> fruitList = new ArrayList<>();
        fruitList.add("orange");
        fruitList.add("grape");

        // Set the delimiter for the tokenizer
        /* write */ tokenizer.setDelimiterChar(',');

        // Add more fruits to the list
        fruitList.add("kiwi");
        fruitList.add("melon");

        // Process the fruitMap
        for (String key : fruitMap.keySet()) {
            System.out.println("Fruit: " + key + ", Count: " + fruitMap.get(key));
        }

        // Read the first token from the tokenizer
        /* read */ String token = tokenizer.nextToken();
        System.out.println("First token: " + token);

        // Iterate over the fruitList and print each fruit
        for (String fruit : fruitList) {
            System.out.println("Fruit in list: " + fruit);
        }

        // Perform some calculations
        int sum = 0;
        for (int value : fruitMap.values()) {
            sum += value;
        }
        System.out.println("Total fruit count: " + sum);

        // Add more elements to the fruitMap
        fruitMap.put("pear", 4);
        fruitMap.put("peach", 5);

        // Print updated fruitMap
        for (String key : fruitMap.keySet()) {
            System.out.println("Updated Fruit: " + key + ", Count: " + fruitMap.get(key));
        }
    }
}