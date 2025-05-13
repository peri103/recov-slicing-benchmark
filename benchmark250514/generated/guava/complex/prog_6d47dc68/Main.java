import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();
        
        // Add a range and its corresponding value using the builder
        /* write */ builder.put(Range.closed(1, 10), "A");

        // Create another builder for a different ImmutableMap
        ImmutableMap.Builder<String, Integer> mapBuilder = ImmutableMap.builder();
        mapBuilder.put("X", 100);
        mapBuilder.put("Y", 200);
        ImmutableMap<String, Integer> immutableMap = mapBuilder.build();
        
        // Perform operations on the immutableMap
        for (String key : immutableMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + immutableMap.get(key));
        }
        
        // Build the ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();
        
        // Perform some calculations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares from 1 to 5: " + sum);

        // Read the value mapped to a specific key within the range
        /* read */ String value = rangeMap.get(5);
        
        // Print the value
        System.out.println(value);

        // Additional operations using rangeMap
        for (int i = 1; i <= 10; i++) {
            System.out.println("Value for " + i + ": " + rangeMap.get(i));
        }
    }
}