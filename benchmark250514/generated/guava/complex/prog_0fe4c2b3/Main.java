import com.google.common.collect.ConcurrentHashMultiset;
import com.google.common.collect.Multiset;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a ConcurrentHashMultiset and add elements
        Multiset<String> multiset = ConcurrentHashMultiset.create();
        /* write */ multiset.add("apple");
        
        // Create a HashMap to store fruit counts
        Map<String, Integer> fruitCountMap = new HashMap<>();
        fruitCountMap.put("banana", 3);
        fruitCountMap.put("orange", 2);
        
        // Add more elements to the multiset
        multiset.add("banana");
        multiset.add("orange");
        multiset.add("banana");
        
        // Perform operations on the HashMap
        for (Map.Entry<String, Integer> entry : fruitCountMap.entrySet()) {
            System.out.println("Fruit: " + entry.getKey() + ", Count: " + entry.getValue());
        }
        
        // Calculate total fruits in the multiset
        int totalFruits = multiset.size();
        System.out.println("Total fruits in multiset: " + totalFruits);
        
        // Calculate count of a specific fruit
        int bananaCount = multiset.count("banana");
        System.out.println("Banana count: " + bananaCount);
        
        // Add an unrelated operation to demonstrate complexity
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
        
        // Read the count of "apple" from the multiset
        /* read */ int appleCount = multiset.count("apple");
        System.out.println("Apple count: " + appleCount);
        
        // Perform additional operations on the multiset
        multiset.add("grape");
        multiset.add("apple");
        multiset.add("grape");
        
        // Print final counts
        System.out.println("Final apple count: " + multiset.count("apple"));
        System.out.println("Final grape count: " + multiset.count("grape"));
    }
}