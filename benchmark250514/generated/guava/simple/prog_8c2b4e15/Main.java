import com.google.common.collect.ImmutableSortedSet;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableSortedSet
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        
        // Add an element to the set using the builder
        /* write */ builder.add(42);
        
        // Build the ImmutableSortedSet
        ImmutableSortedSet<Integer> sortedSet = builder.build();
        
        // Check if the set contains the element
        /* read */ boolean containsValue = sortedSet.contains(42);
        
        // Print the result
        System.out.println(containsValue);
    }
}