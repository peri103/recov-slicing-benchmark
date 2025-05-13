import com.google.common.collect.ImmutableSortedSet;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableSortedSet
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        
        // Add elements to the set using the builder
        /* write */ builder.add(1);
        
        // Add more elements to the builder for complexity
        builder.add(2);
        builder.add(3);
        
        // Perform some unrelated operations with a HashSet
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        
        // Check if the HashSet contains a value
        boolean hashSetContains = hashSet.contains(10);
        System.out.println("HashSet contains 10: " + hashSetContains);
        
        // Build the ImmutableSortedSet
        ImmutableSortedSet<Integer> sortedSet = builder.build();
        
        // Perform additional operations on the sorted set
        for (Integer num : sortedSet) {
            System.out.println("SortedSet element: " + num);
        }
        
        // Check if the set contains the element
        /* read */ boolean contains = sortedSet.contains(1);
        
        // Print the result
        System.out.println("ImmutableSortedSet contains 1: " + contains);
        
        // Additional complexity with another data structure
        Set<String> stringSet = new HashSet<>();
        stringSet.add("hello");
        stringSet.add("world");
        
        // Check if the string set contains a specific string
        boolean stringSetContains = stringSet.contains("hello");
        System.out.println("StringSet contains 'hello': " + stringSetContains);
    }
}