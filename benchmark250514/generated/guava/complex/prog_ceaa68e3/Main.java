import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedMultiset
        ImmutableSortedMultiset.Builder<String> builder = ImmutableSortedMultiset.naturalOrder();

        // Add elements to the builder
        builder.add("apple");
        builder.add("banana");
        builder.add("apple");

        // Create an ImmutableList
        ImmutableList<String> fruits = ImmutableList.of("orange", "grape", "apple");

        // Create a Map to count occurrences of each fruit
        Map<String, Integer> fruitCountMap = new HashMap<>();

        // Iterate over the list and count occurrences
        for (String fruit : fruits) {
            fruitCountMap.put(fruit, fruitCountMap.getOrDefault(fruit, 0) + 1);
        }

        // Print the fruit counts
        for (Map.Entry<String, Integer> entry : fruitCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Build the ImmutableSortedMultiset
        /* write */ ImmutableSortedMultiset<String> multiset = builder.build();

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Check if a certain fruit is in the list
        boolean hasApple = fruits.contains("apple");
        System.out.println("Does the list contain apple? " + hasApple);

        // Read the count of a specific element
        /* read */ int count = multiset.count("apple");

        // Print the count
        System.out.println("Count of 'apple' in multiset: " + count);

        // Perform additional operations with the map
        fruitCountMap.put("banana", fruitCountMap.getOrDefault("banana", 0) + 2);
        fruitCountMap.remove("orange");

        // Print the updated fruit counts
        for (Map.Entry<String, Integer> entry : fruitCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}