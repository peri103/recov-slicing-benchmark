import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableMultiset
        ImmutableMultiset.Builder<String> builder = ImmutableMultiset.builder();
        
        // Use the builder to add elements
        /* write */ builder.add("apple");
        
        // Add more elements to the builder
        builder.add("banana").add("orange").add("apple");
        
        // Build the ImmutableMultiset
        ImmutableMultiset<String> multiset = builder.build();
        
        // Create another collection to demonstrate complexity
        ImmutableList<String> fruits = ImmutableList.of("apple", "banana", "cherry", "date");
        
        // Use a HashMap to count occurrences in the ImmutableList
        HashMap<String, Integer> fruitCountMap = new HashMap<>();
        for (String fruit : fruits) {
            fruitCountMap.put(fruit, fruitCountMap.getOrDefault(fruit, 0) + 1);
        }
        
        // Print the occurrences from the map
        for (String fruit : fruitCountMap.keySet()) {
            System.out.println(fruit + ": " + fruitCountMap.get(fruit));
        }
        
        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
        
        // Read the count of a specific element from the multiset
        /* read */ int count = multiset.count("apple");
        
        // Print the count
        System.out.println("Count of 'apple' in multiset: " + count);
        
        // More unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}