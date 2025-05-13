import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableSortedMultiset
        ImmutableSortedMultiset.Builder<String> builder = ImmutableSortedMultiset.<String>naturalOrder();
        
        // Add elements to the builder
        builder.add("apple");
        builder.add("banana");
        
        // Build the ImmutableSortedMultiset
        /* write */ ImmutableSortedMultiset<String> multiset = builder.build();
        
        // Introduce a HashMultiset and add elements to it
        Multiset<String> hashMultiset = HashMultiset.create();
        hashMultiset.add("orange");
        hashMultiset.add("apple");
        hashMultiset.add("apple");
        
        // Count the occurrences of "orange" in the hashMultiset
        int orangeCount = hashMultiset.count("orange");
        System.out.println("Orange count: " + orangeCount);
        
        // Perform some operations on hashMultiset
        hashMultiset.remove("apple");
        System.out.println("Apple count after removal: " + hashMultiset.count("apple"));
        
        // Use the original multiset to count occurrences of "apple"
        /* read */ int appleCount = multiset.count("apple");
        
        // Print the count from the original multiset
        System.out.println("Apple count in ImmutableSortedMultiset: " + appleCount);
        
        // Additional unrelated operations
        int totalElements = hashMultiset.size();
        System.out.println("Total elements in HashMultiset: " + totalElements);
        
        for (String element : hashMultiset.elementSet()) {
            System.out.println("Element: " + element + ", Count: " + hashMultiset.count(element));
        }
    }
}