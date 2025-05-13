import com.google.common.collect.ImmutableSortedSet;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableSortedSet
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        
        /* write */
        builder.add(1);  // Add elements to the builder
        ImmutableSortedSet<Integer> sortedSet = builder.build();  // Build the ImmutableSortedSet

        /* read */
        boolean containsValue = sortedSet.contains(1);  // Check if the set contains the value
        System.out.println(containsValue);  // Output the result
    }
}