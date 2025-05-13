import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableMap;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();
        
        // Add a range and associated value using the builder
        /* write */ builder.put(Range.closed(1, 10), "Value1");
        
        // Create another builder for ImmutableMap
        ImmutableMap.Builder<Integer, String> mapBuilder = ImmutableMap.builder();
        mapBuilder.put(1, "One");
        mapBuilder.put(2, "Two");
        mapBuilder.put(3, "Three");
        ImmutableMap<Integer, String> map = mapBuilder.build();
        
        // Perform some operations on the map
        for (Integer key : map.keySet()) {
            System.out.println("Map Key: " + key + ", Value: " + map.get(key));
        }
        
        // Build the ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();
        
        // Perform some unrelated arithmetic operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Read the value associated with a key within the range
        /* read */ String value = rangeMap.get(5);
        
        // Print the value
        System.out.println("RangeMap Value: " + value);
        
        // Additional logic with the rangeMap
        for (int i = 1; i <= 10; i++) {
            String rangeValue = rangeMap.get(i);
            System.out.println("Key: " + i + ", RangeMap Value: " + rangeValue);
        }
    }
}