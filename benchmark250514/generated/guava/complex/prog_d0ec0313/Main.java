import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();
        
        // Add a range to the builder
        /* write */ builder.put(Range.closed(1, 10), "A");
        
        // Perform some unrelated operations
        ImmutableMap.Builder<String, Integer> mapBuilder = ImmutableMap.builder();
        mapBuilder.put("One", 1);
        mapBuilder.put("Two", 2);
        mapBuilder.put("Three", 3);
        ImmutableMap<String, Integer> map = mapBuilder.build();
        
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        
        // Build the ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();
        
        // More unrelated operations
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of map values: " + sum);
        
        // Read a value from the ImmutableRangeMap
        /* read */ String value = rangeMap.get(5);
        
        // Print the value
        System.out.println("Value from rangeMap: " + value);
        
        // Additional unrelated logic
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers 1 to 5: " + product);
    }
}