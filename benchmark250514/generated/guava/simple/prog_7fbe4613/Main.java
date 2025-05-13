import com.google.common.collect.ImmutableSortedSet;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedSet
        ImmutableSortedSet.Builder<Integer> builder = ImmutableSortedSet.naturalOrder();
        
        /* write */ builder.add(10);
        
        // Build the ImmutableSortedSet
        ImmutableSortedSet<Integer> sortedSet = builder.build();
        
        /* read */ boolean containsValue = sortedSet.contains(10);
        
        // Print the result
        System.out.println(containsValue);
    }
}