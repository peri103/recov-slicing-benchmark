import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = new ImmutableRangeMap.Builder<>();
        
        // Add a range-value pair to the builder
        /* write */ builder.put(Range.closed(1, 10), "Range1");
        
        // Create another ImmutableRangeMap with different ranges
        ImmutableRangeMap.Builder<Integer, String> anotherBuilder = new ImmutableRangeMap.Builder<>();
        anotherBuilder.put(Range.closed(11, 20), "Range2");
        anotherBuilder.put(Range.closed(21, 30), "Range3");
        
        // Build the range maps
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();
        ImmutableRangeMap<Integer, String> anotherRangeMap = anotherBuilder.build();
        
        // Create an ImmutableMap for additional complexity
        ImmutableMap<Integer, String> immutableMap = ImmutableMap.of(1, "One", 2, "Two", 3, "Three");
        
        // Iterate over the ImmutableMap and print values
        for (Integer key : immutableMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + immutableMap.get(key));
        }
        
        // Perform some operations on anotherRangeMap
        String anotherValue = anotherRangeMap.get(15);
        System.out.println("Value from anotherRangeMap: " + anotherValue);
        
        // Perform some unrelated calculations
        int result = 0;
        for (int i = 0; i < 5; i++) {
            result += i * i;
        }
        System.out.println("Sum of squares: " + result);
        
        // Finally, read the value from the original rangeMap
        /* read */ String value = rangeMap.get(5);
        
        // Print the value retrieved from rangeMap
        System.out.println("Value from rangeMap: " + value);
    }
}