import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Creating an ImmutableSortedMultiset instance with some elements
        /* write */ ImmutableSortedMultiset<String> multiset = ImmutableSortedMultiset.of("apple", "banana", "apple");

        // Creating additional collections and performing operations
        ImmutableList<String> fruits = ImmutableList.of("apple", "banana", "cherry");
        Map<String, Integer> fruitMap = new HashMap<>();
        
        for (String fruit : fruits) {
            fruitMap.put(fruit, multiset.count(fruit));
        }

        System.out.println("Fruit counts in multiset:");
        for (Map.Entry<String, Integer> entry : fruitMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Performing some unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares from 1 to 10: " + sum);

        // Reading the count of a specific element
        /* read */ int count = multiset.count("apple");

        // Output the count
        System.out.println("Count of 'apple' in multiset: " + count);

        // Additional complex operations
        Map<String, Integer> squaredMap = new HashMap<>();
        for (String fruit : fruits) {
            int squaredValue = fruit.length() * fruit.length();
            squaredMap.put(fruit, squaredValue);
        }

        System.out.println("Squared length of fruit names:");
        for (Map.Entry<String, Integer> entry : squaredMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}