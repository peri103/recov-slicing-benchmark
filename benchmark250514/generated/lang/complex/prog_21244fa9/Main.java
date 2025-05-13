import org.apache.commons.lang3.text.StrTokenizer;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a list of fruits and a tokenizer
        String str = "apple,banana,cherry";
        StrTokenizer tokenizer = new StrTokenizer(str);

        // Initialize a list and a map for additional complexity
        ArrayList<String> fruitsList = new ArrayList<>();
        HashMap<String, Integer> fruitCountMap = new HashMap<>();

        /* write */ tokenizer.setDelimiterChar(',');

        // Populate the fruits list
        fruitsList.add("apple");
        fruitsList.add("banana");
        fruitsList.add("cherry");

        // Populate the fruit count map
        fruitCountMap.put("apple", 3);
        fruitCountMap.put("banana", 5);
        fruitCountMap.put("cherry", 2);

        // Perform operations on the list and map
        for (String fruit : fruitsList) {
            System.out.println("Fruit: " + fruit + ", Count: " + fruitCountMap.get(fruit));
        }

        // Initialize a variable to hold the first token
        String firstToken = null;

        // Perform some unrelated operations
        int totalFruits = 0;
        for (int count : fruitCountMap.values()) {
            totalFruits += count;
        }
        System.out.println("Total fruits: " + totalFruits);

        // Extract the first token
        /* read */ firstToken = tokenizer.nextToken();
        System.out.println("First token: " + firstToken);

        // Further unrelated operations
        int averageCount = totalFruits / fruitsList.size();
        System.out.println("Average count per fruit: " + averageCount);

        // Print all tokens from the tokenizer
        while (tokenizer.hasNext()) {
            System.out.println("Token: " + tokenizer.nextToken());
        }
    }
}