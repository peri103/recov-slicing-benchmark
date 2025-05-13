import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a builder for ImmutableRangeSet
        ImmutableRangeSet.Builder<Integer> builder = ImmutableRangeSet.builder();
        
        // Add a range to the builder
        /* write */ builder.add(Range.closed(1, 10));
        
        // Build the ImmutableRangeSet
        ImmutableRangeSet<Integer> rangeSet = builder.build();
        
        // Initialize a map and populate it with some values
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("five", 5);
        map.put("ten", 10);
        
        // Perform operations on the map
        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }
        System.out.println("Sum of values in map: " + sum);
        
        // Create an ImmutableSet and perform operations
        ImmutableSet<String> immutableSet = ImmutableSet.of("A", "B", "C");
        System.out.println("ImmutableSet contains B: " + immutableSet.contains("B"));
        
        // Check if a value is within the range
        /* read */ boolean containsValue = rangeSet.contains(5);
        
        // Print the result
        System.out.println(containsValue); // Should print true
        
        // Additional operations to increase complexity
        for (int i = 1; i <= 3; i++) {
            Range<Integer> range = Range.closed(i * 10, i * 10 + 5);
            builder.add(range);
        }
        
        // Build another range set
        ImmutableRangeSet<Integer> complexRangeSet = builder.build();
        System.out.println("ComplexRangeSet contains 15: " + complexRangeSet.contains(15));
    }
}