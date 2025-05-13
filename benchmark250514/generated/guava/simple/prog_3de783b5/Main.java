import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeSet
        ImmutableRangeSet.Builder<Integer> builder = ImmutableRangeSet.builder();
        /* write */ builder.add(Range.closed(1, 10));

        // Build the ImmutableRangeSet
        ImmutableRangeSet<Integer> rangeSet = builder.build();

        // Use the contains method to check if a value is within the range
        /* read */ boolean containsValue = rangeSet.contains(5);
        System.out.println(containsValue);  // This should output true since 5 is within the range [1, 10]
    }
}