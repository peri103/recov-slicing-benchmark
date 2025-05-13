import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedMultiset.Builder;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedMultiset
        Builder<String> builder = ImmutableSortedMultiset.builder();

        // Use the write method to add elements to the builder
        /* write */ builder.add("apple").add("banana").add("apple");

        // Create an ImmutableSet and ImmutableMap for demonstration
        ImmutableSet<String> fruitSet = ImmutableSet.of("apple", "banana", "cherry");
        ImmutableMap<String, Integer> fruitMap = ImmutableMap.of("apple", 2, "banana", 3, "cherry", 1);

        // Perform some operations on the ImmutableSet
        if (fruitSet.contains("banana")) {
            System.out.println("Banana is in the set.");
        }

        // Use the ImmutableMap to get values
        int bananaCount = fruitMap.get("banana");
        System.out.println("Banana count from map: " + bananaCount);

        // Build the ImmutableSortedMultiset
        ImmutableSortedMultiset<String> multiset = builder.build();

        // Perform some operations on the multiset
        System.out.println("Multiset elements: " + multiset.elementSet());
        System.out.println("Total distinct elements: " + multiset.elementSet().size());

        // Use the read method to count occurrences of "apple"
        /* read */ int count = multiset.count("apple");

        // Print the count
        System.out.println("Apple count from multiset: " + count);

        // Additional operations to increase complexity
        for (String fruit : fruitSet) {
            int mapCount = fruitMap.get(fruit);
            int multisetCount = multiset.count(fruit);
            System.out.println(fruit + ": Map count = " + mapCount + ", Multiset count = " + multisetCount);
        }
    }
}