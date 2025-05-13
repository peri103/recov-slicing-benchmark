import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        // Initialize the ImmutableRangeSet using the builder
        ImmutableRangeSet.Builder<Integer> builder = ImmutableRangeSet.builder();
        /* write */ builder.add(Range.closed(1, 10));
        ImmutableRangeSet<Integer> rangeSet = builder.build();

        // Use the contains method to check if a value is within the range
        /* read */ boolean containsValue = rangeSet.contains(5);
        System.out.println(containsValue);
    }
}