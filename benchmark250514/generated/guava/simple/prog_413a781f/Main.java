import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        // Create a builder for the ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();
        
        // Define a range and associate it with a value
        builder.put(Range.closed(1, 10), "Value1");
        
        // Build the ImmutableRangeMap
        /* write */ ImmutableRangeMap<Integer, String> rangeMap = builder.build();
        
        // Read the value associated with a specific key
        /* read */ String value = rangeMap.get(5);
        
        // Output the value
        System.out.println(value);
    }
}