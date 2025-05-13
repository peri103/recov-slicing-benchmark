import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();
        
        // Define a range and associated value
        Range<Integer> range = Range.closed(1, 10);
        String valueToWrite = "Hello World";

        // Put the range and value into the builder
        /* write */ builder.put(range, valueToWrite);

        // Build the ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();

        // Read the value using a key within the range
        Integer keyToRead = 5;
        /* read */ String valueRead = rangeMap.get(keyToRead);

        // Print the read value
        System.out.println(valueRead);
    }
}