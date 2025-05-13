import com.google.common.collect.ImmutableSortedSet;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedSet
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        
        // Add elements to the builder
        /* write */ builder.add(5);
        
        // Build the ImmutableSortedSet
        ImmutableSortedSet<Integer> sortedSet = builder.build();
        
        // Check if the set contains the element
        /* read */ boolean contains = sortedSet.contains(5);
        
        // Print the result
        System.out.println(contains);
    }
}