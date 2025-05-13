import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();
        
        // Add a range to the builder
        /* write */ builder.put(Range.closed(1, 10), "Value for range 1-10");
        
        // Add another range to the builder
        builder.put(Range.closed(11, 20), "Value for range 11-20");
        
        // Build the ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();
        
        // Create a list of keys to test the range map
        ImmutableList<Integer> keys = ImmutableList.of(5, 15, 25);
        
        // Create a map to store results
        Map<Integer, String> results = new HashMap<>();
        
        // Process each key and store the results
        for (Integer key : keys) {
            String result = rangeMap.get(key);
            results.put(key, result != null ? result : "No value found");
        }
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 natural numbers is: " + sum);
        
        // Read a value from the ImmutableRangeMap
        /* read */ String value = rangeMap.get(5);
        
        // Print the value
        System.out.println("Value for key 5: " + value);
        
        // Print all results
        for (Map.Entry<Integer, String> entry : results.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}