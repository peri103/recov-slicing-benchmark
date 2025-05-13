import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableRangeSet
        ImmutableRangeSet.Builder<Integer> builder = ImmutableRangeSet.builder();
        
        // Add a range to the builder
        /* write */ builder.add(Range.closed(1, 10));
        
        // Build the ImmutableRangeSet
        ImmutableRangeSet<Integer> rangeSet = builder.build();
        
        // Check if a specific value is within the range set
        /* read */ boolean containsValue = rangeSet.contains(5);
        
        // Print the result
        System.out.println(containsValue);
    }
}