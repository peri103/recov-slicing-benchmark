import com.google.common.collect.ImmutableSortedSet;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedSet
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        
        // Add elements using the builder
        /* write */ builder.add(1);
        
        // Build the ImmutableSortedSet
        ImmutableSortedSet<Integer> immutableSortedSet = builder.build();
        
        // Check if the ImmutableSortedSet contains the element
        /* read */ boolean containsValue = immutableSortedSet.contains(1);
        
        // Print the result
        System.out.println(containsValue);
    }
}