import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();
        
        // Define a range and associate a value with it
        Range<Integer> range = Range.closed(1, 10);
        /* write */ builder.put(range, "Value in range");

        // Build the ImmutableRangeMap from the builder
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();
        
        // Read the value associated with a key within the range
        /* read */ String value = rangeMap.get(5); // 5 is within the range 1 to 10
        
        // Print the value
        System.out.println(value);
    }
}