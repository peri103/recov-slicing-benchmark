import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedMultiset
        ImmutableSortedMultiset.Builder<String> builder = ImmutableSortedMultiset.naturalOrder();

        // Add elements using the builder
        /* write */ builder.add("apple");

        // Perform some unrelated operations
        Map<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("banana", 2);
        fruitMap.put("orange", 3);

        for (Map.Entry<String, Integer> entry : fruitMap.entrySet()) {
            System.out.println("Fruit: " + entry.getKey() + ", Count: " + entry.getValue());
        }

        // Create an ImmutableList and perform operations
        ImmutableList<String> fruits = ImmutableList.of("apple", "banana", "orange");
        for (String fruit : fruits) {
            System.out.println("ImmutableList contains: " + fruit);
        }

        // More complex operations using ImmutableList
        ImmutableList<String> sortedFruits = fruits.stream().sorted().collect(ImmutableList.toImmutableList());
        System.out.println("Sorted fruits: " + sortedFruits);

        // Build the ImmutableSortedMultiset
        ImmutableSortedMultiset<String> multiset = builder.build();

        // Read the count of the element "apple"
        /* read */ int count = multiset.count("apple");

        // Print the count
        System.out.println("Count of apple in multiset: " + count);

        // Additional operations to make the program more complex
        fruitMap.put("apple", count);
        for (String fruit : sortedFruits) {
            if (fruitMap.containsKey(fruit)) {
                System.out.println("Final count of " + fruit + ": " + fruitMap.get(fruit));
            }
        }
    }
}