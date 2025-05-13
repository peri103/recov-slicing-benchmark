import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();
        
        // Use the builder to add a range and associate it with a value
        /* write */ builder.put(Range.closed(1, 10), "Value1");
        
        // Build the ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();
        
        // Use the get method to retrieve the value associated with a specific key
        /* read */ String value = rangeMap.get(5);
        
        // Print the retrieved value
        System.out.println(value);
    }
}