import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();

        // Add a range and its associated value
        /* write */ builder.put(Range.closed(1, 10), "Value");

        // Build the ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();

        // Read the value for a specific key within the range
        /* read */ String value = rangeMap.get(5);

        // Output the read value
        System.out.println(value);
    }
}