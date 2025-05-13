import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();
        
        // Add a range and corresponding value using the builder
        /* write */ builder.put(Range.closed(1, 10), "Value1");
        
        // Build the ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();
        
        // Retrieve the value for a specific key using the get method
        /* read */ String value = rangeMap.get(5);
        
        // Print the retrieved value
        System.out.println(value);
    }
}