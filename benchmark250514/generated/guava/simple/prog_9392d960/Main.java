import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.ImmutableSortedSet.Builder;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedSet
        Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        
        // Add an element to the builder
        /* write */ builder.add(42);
        
        // Build the ImmutableSortedSet
        ImmutableSortedSet<Integer> set = builder.build();
        
        // Check if the set contains the element
        /* read */ boolean contains = set.contains(42);
        
        // Print the result
        System.out.println(contains);
    }
}