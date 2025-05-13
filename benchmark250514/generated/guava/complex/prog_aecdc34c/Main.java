import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create and populate a HashMap
        Map<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("apple", 3);
        fruitMap.put("banana", 2);
        fruitMap.put("cherry", 5);

        // Use ImmutableSet for another collection
        ImmutableSet<String> fruitSet = ImmutableSet.of("apple", "banana", "cherry");

        // Use the original ImmutableMultiset
        ImmutableMultiset.Builder<String> builder = ImmutableMultiset.builder();
        /* write */ builder.add("apple");
        
        // Add more elements to the multiset builder
        for (String fruit : fruitSet) {
            builder.addCopies(fruit, fruitMap.get(fruit));
        }

        // Build the multiset
        ImmutableMultiset<String> multiset = builder.build();

        // Perform some operations with fruitMap
        int totalFruits = 0;
        for (Map.Entry<String, Integer> entry : fruitMap.entrySet()) {
            totalFruits += entry.getValue();
        }
        System.out.println("Total fruits in map: " + totalFruits);

        // Perform some operations with fruitSet
        for (String fruit : fruitSet) {
            System.out.println("Fruit in set: " + fruit);
        }

        // Read from the multiset
        /* read */ int count = multiset.count("apple");
        System.out.println("Count of 'apple' in multiset: " + count);
    }
}