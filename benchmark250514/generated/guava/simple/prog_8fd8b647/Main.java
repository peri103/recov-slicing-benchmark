import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        // Create a RangeSet using the specified range
        ImmutableRangeSet<Integer> rangeSet = /* write */ ImmutableRangeSet.of(Range.closed(1, 10));

        // Read and check if a specific value is contained within the range
        boolean containsValue = /* read */ rangeSet.contains(5);
        
        // Output the result
        System.out.println("RangeSet contains 5: " + containsValue);
    }
}