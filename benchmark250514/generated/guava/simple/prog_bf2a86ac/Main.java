import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();
        
        // Define a range and associated value
        Range<Integer> range = Range.closed(1, 10);
        String value = "ValueInRange";
        
        // Add the range and value to the builder
        /* write */ builder.put(range, value);
        
        // Build the ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();
        
        // Read the value associated with a specific key within the range
        /* read */ String readValue = rangeMap.get(5);
        
        // Print the value
        System.out.println(readValue);
    }
}