import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Multiset<String> multiset = HashMultiset.create();
        Map<String, Integer> fruitMap = new HashMap<>();
        
        // Add some initial fruits to the map
        fruitMap.put("banana", 2);
        fruitMap.put("orange", 3);

        // Add more fruits to the multiset
        multiset.add("banana");
        multiset.add("orange");
        multiset.add("grape");

        // Add an apple to the multiset
        /* write */ multiset.add("apple");

        // Process the fruit map
        for (Map.Entry<String, Integer> entry : fruitMap.entrySet()) {
            System.out.println("Fruit: " + entry.getKey() + ", Count: " + entry.getValue());
        }

        // Calculate total fruit count in multiset
        int totalFruits = multiset.size();
        System.out.println("Total fruits in multiset: " + totalFruits);

        // Check the count of apple in the multiset
        /* read */ int appleCount = multiset.count("apple");
        System.out.println("Count of apples: " + appleCount);

        // Add more fruits to the map
        fruitMap.put("apple", appleCount);
        fruitMap.put("grape", multiset.count("grape"));

        // Print the updated fruit map
        for (Map.Entry<String, Integer> entry : fruitMap.entrySet()) {
            System.out.println("Updated Fruit: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}