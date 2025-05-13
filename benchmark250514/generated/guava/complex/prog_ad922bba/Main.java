import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Additional data structures
        HashMap<String, Integer> fruitCountMap = new HashMap<>();
        fruitCountMap.put("apple", 10);
        fruitCountMap.put("banana", 20);
        fruitCountMap.put("cherry", 15);

        // Additional ImmutableCollection
        ImmutableCollection<String> fruitSet = ImmutableSet.of("apple", "banana", "orange");

        // Print fruit counts
        for (Map.Entry<String, Integer> entry : fruitCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Use a different ImmutableCollection
        boolean hasOrange = fruitSet.contains("orange");
        System.out.println("Fruit set contains orange: " + hasOrange);

        // Original write operation
        /* write */ ImmutableCollection<String> collection = ImmutableList.of("apple", "banana", "cherry");

        // Perform operations on fruitCountMap
        int totalFruits = 0;
        for (int count : fruitCountMap.values()) {
            totalFruits += count;
        }
        System.out.println("Total number of fruits: " + totalFruits);

        // Check if a specific fruit is available in the original collection
        /* read */ boolean containsBanana = collection.contains("banana");
        System.out.println("Original collection contains banana: " + containsBanana);
    }
}