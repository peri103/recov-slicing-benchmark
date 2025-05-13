import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeSet
        ImmutableRangeSet.Builder<Integer> builder = ImmutableRangeSet.builder();
        
        // Add a range to the builder
        /* write */ builder.add(Range.closed(1, 10));
        
        // Build the ImmutableRangeSet
        ImmutableRangeSet<Integer> rangeSet = builder.build();
        
        // Create a map to store some data
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        
        // Use ImmutableSet to create a set of keys from the map
        ImmutableSet<String> keySet = ImmutableSet.copyOf(map.keySet());
        
        // Print each key and its associated value from the map
        for (String key : keySet) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        
        // Perform some arithmetic operations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 5: " + sum);
        
        // Check if a value is within the range set
        /* read */ boolean contains = rangeSet.contains(5);
        
        // Print the result
        System.out.println("Does the range set contain 5? " + contains);
    }
}