import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();
        
        // Add a range and its associated value using the builder
        /* write */ builder.put(Range.closed(1, 10), "Value in range");

        // Build the ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();

        // Retrieve a value using the get method of ImmutableRangeMap
        /* read */ String value = rangeMap.get(5);

        // Print the retrieved value
        System.out.println(value);
    }
}