import com.google.common.collect.ImmutableSortedSet;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableSortedSet
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        
        // Add elements to the set using the builder
        /* write */ builder.add(1);
        
        // Build the ImmutableSortedSet
        ImmutableSortedSet<Integer> sortedSet = builder.build();
        
        // Check if the set contains the element
        /* read */ boolean contains = sortedSet.contains(1);
        
        // Print the result
        System.out.println(contains);
    }
}