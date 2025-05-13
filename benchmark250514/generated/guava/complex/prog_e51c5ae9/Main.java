import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();
        
        // Use the builder to add a range mapping
        /* write */ builder.put(Range.closed(1, 10), "Range1");
        
        // Create another ImmutableRangeMap for demonstration
        ImmutableRangeMap.Builder<Integer, String> builder2 = ImmutableRangeMap.builder();
        builder2.put(Range.closed(11, 20), "Range2");
        ImmutableRangeMap<Integer, String> rangeMap2 = builder2.build();
        
        // Build the original ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();
        
        // Create a HashMap for additional complexity
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);
        
        // Iterate over the HashMap and perform operations
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Additional operations with the second ImmutableRangeMap
        String value2 = rangeMap2.get(15);
        System.out.println("Value from second range map: " + value2);
        
        // Use the get method to read the value for a specific key from the original range map
        /* read */ String value = rangeMap.get(5);
        
        // Output the retrieved value
        System.out.println("Value from original range map: " + value);
        
        // Perform some calculations for complexity
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
    }
}