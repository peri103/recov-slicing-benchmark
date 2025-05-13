import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableMultiset
        ImmutableMultiset.Builder<String> builder = ImmutableMultiset.builder();
        
        // Add elements using the builder
        /* write */ builder.add("apple").add("banana").add("apple");

        // Create and use an ImmutableSet
        ImmutableSet<String> fruitSet = ImmutableSet.of("apple", "banana", "orange");
        System.out.println("ImmutableSet contains 'banana': " + fruitSet.contains("banana"));

        // Create and use an ImmutableMap
        ImmutableMap<String, Integer> fruitMap = ImmutableMap.of("apple", 2, "banana", 3, "orange", 1);
        System.out.println("FruitMap size: " + fruitMap.size());

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 4: " + sum);

        // Build the ImmutableMultiset
        ImmutableMultiset<String> multiset = builder.build();

        // More unrelated operations
        int product = 1;
        for (String fruit : fruitSet) {
            product *= fruit.length();
        }
        System.out.println("Product of string lengths in fruitSet: " + product);

        // Use the count method to read the number of occurrences of "apple"
        /* read */ int appleCount = multiset.count("apple");

        // Print the count of "apple"
        System.out.println("Count of 'apple' in multiset: " + appleCount);

        // Additional unrelated code
        String[] fruits = {"apple", "banana", "orange"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}