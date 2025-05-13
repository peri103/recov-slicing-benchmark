import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the ImmutableSortedMultiset using the 'of' method
        /* write */ ImmutableSortedMultiset<String> multiset = ImmutableSortedMultiset.of("apple", "banana", "apple");

        // Initialize an ImmutableList using the 'of' method
        ImmutableList<String> list = ImmutableList.of("orange", "grape", "apple");

        // Create a HashMap to store fruit counts
        Map<String, Integer> fruitCount = new HashMap<>();

        // Populate the HashMap with counts from the ImmutableList
        for (String fruit : list) {
            fruitCount.put(fruit, fruitCount.getOrDefault(fruit, 0) + 1);
        }

        // Perform some operations with the HashMap
        for (Map.Entry<String, Integer> entry : fruitCount.entrySet()) {
            System.out.println("Fruit: " + entry.getKey() + ", Count: " + entry.getValue());
        }

        // Calculate the total number of fruits in the ImmutableSortedMultiset
        int totalFruits = 0;
        for (String fruit : multiset.elementSet()) {
            totalFruits += multiset.count(fruit);
        }
        System.out.println("Total fruits in multiset: " + totalFruits);

        // Read the count of a specific element using the 'count' method
        /* read */ int count = multiset.count("apple");

        // Output the count of 'apple'
        System.out.println("Count of 'apple': " + count);

        // Further operations with ImmutableList
        for (String fruit : list) {
            System.out.println("ImmutableList fruit: " + fruit);
        }
    }
}