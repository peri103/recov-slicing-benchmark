import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Creating a builder for ImmutableMultiset
        ImmutableMultiset.Builder<String> builder = ImmutableMultiset.builder();

        // Adding elements to the builder
        builder.add("banana");
        builder.add("orange");
        
        // Using a HashMap to store some data
        Map<String, Integer> fruitCounts = new HashMap<>();
        fruitCounts.put("banana", 2);
        fruitCounts.put("orange", 3);

        // Adding more elements to the builder
        /* write */ builder.add("apple");
        
        // Building the ImmutableMultiset
        ImmutableMultiset<String> multiset = builder.build();

        // Creating an ImmutableSet
        ImmutableSet<String> fruitSet = ImmutableSet.of("apple", "banana", "orange");

        // Iterating over the fruit set and printing each fruit
        for (String fruit : fruitSet) {
            System.out.println("Fruit: " + fruit);
        }

        // Retrieving and printing the count of "apple" from the multiset
        /* read */ int count = multiset.count("apple");
        System.out.println("Count of apple: " + count);

        // Using the fruitCounts map to print the count of each fruit
        for (Map.Entry<String, Integer> entry : fruitCounts.entrySet()) {
            System.out.println("Fruit: " + entry.getKey() + ", Count: " + entry.getValue());
        }

        // Additional logic to check if a fruit is in the set
        if (fruitSet.contains("apple")) {
            System.out.println("Apple is in the set.");
        } else {
            System.out.println("Apple is not in the set.");
        }
    }
}