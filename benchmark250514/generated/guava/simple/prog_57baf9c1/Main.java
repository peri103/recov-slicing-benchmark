import com.google.common.collect.ImmutableSortedSet;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableSortedSet
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        
        /* write */ builder.add(42); // Add an element to the builder
        
        // Build the ImmutableSortedSet
        ImmutableSortedSet<Integer> set = builder.build();
        
        /* read */ boolean contains = set.contains(42); // Check if the set contains the element
        
        System.out.println(contains); // Output the result
    }
}