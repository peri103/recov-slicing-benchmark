import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Create an ImmutableSortedMultiset instance using the 'of' method
        /* write */ ImmutableSortedMultiset<String> multiset = ImmutableSortedMultiset.of("apple", "banana", "apple");

        // Create an ImmutableList using another Guava method
        ImmutableList<String> fruits = ImmutableList.of("apple", "banana", "cherry");

        // Create an ImmutableMap using another Guava method
        ImmutableMap<String, Integer> fruitQuantities = ImmutableMap.of("apple", 2, "banana", 3, "cherry", 1);

        // Perform some operations on the ImmutableList
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // Perform some operations on the ImmutableMap
        for (String fruit : fruitQuantities.keySet()) {
            System.out.println("Quantity of " + fruit + ": " + fruitQuantities.get(fruit));
        }

        // Create a HashSet and perform operations on it
        Set<String> fruitSet = new HashSet<>();
        fruitSet.add("apple");
        fruitSet.add("banana");
        fruitSet.add("cherry");

        // Check if a specific fruit is in the set
        if (fruitSet.contains("apple")) {
            System.out.println("Set contains apple");
        }

        // Read the count of a specific element using the 'count' method
        /* read */ int appleCount = multiset.count("apple");

        // Output the count
        System.out.println("Count of 'apple': " + appleCount);

        // Perform additional operations on the HashSet
        fruitSet.remove("banana");
        System.out.println("Set size after removal: " + fruitSet.size());
    }
}