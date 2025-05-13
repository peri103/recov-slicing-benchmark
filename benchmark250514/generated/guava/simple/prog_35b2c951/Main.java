import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();

        // Define a range and associate a value with it
        Range<Integer> range = Range.closed(1, 10);
        /* write */ builder.put(range, "Hello, Range!");

        // Build the ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();

        // Retrieve the value associated with a specific key within the range
        /* read */ String value = rangeMap.get(5);

        // Print the value
        System.out.println(value);
    }
}