import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableMultiset
        ImmutableMultiset.Builder<String> builder = ImmutableMultiset.builder();
        
        // Add elements to the builder
        /* write */ builder.add("apple").add("banana").add("apple");
        
        // Create a separate ImmutableSet
        ImmutableSet<String> fruitSet = ImmutableSet.of("apple", "banana", "cherry");
        
        // Create a HashMap to store fruit counts
        Map<String, Integer> fruitCountMap = new HashMap<>();
        for (String fruit : fruitSet) {
            fruitCountMap.put(fruit, 0);
        }
        
        // Build the ImmutableMultiset
        ImmutableMultiset<String> multiset = builder.build();
        
        // Update the fruit count map based on the multiset
        for (String fruit : fruitSet) {
            int countInMultiset = multiset.count(fruit);
            fruitCountMap.put(fruit, countInMultiset);
        }
        
        // Perform some operations on the fruit count map
        int totalFruits = 0;
        for (Map.Entry<String, Integer> entry : fruitCountMap.entrySet()) {
            totalFruits += entry.getValue();
        }
        System.out.println("Total fruits: " + totalFruits);
        
        // Read the count of a specific element
        /* read */ int count = multiset.count("apple");
        
        // Print the count
        System.out.println("Count of apples: " + count);
        
        // Perform more operations with the fruit set
        if (fruitSet.contains("banana")) {
            System.out.println("Banana is in the set.");
        }
        
        // Traverse the fruit count map and print each entry
        for (Map.Entry<String, Integer> entry : fruitCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}