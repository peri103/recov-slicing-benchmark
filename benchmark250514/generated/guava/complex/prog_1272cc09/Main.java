import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeSet
        ImmutableRangeSet.Builder<Integer> builder = ImmutableRangeSet.builder();
        
        // Add a range to the builder
        /* write */ builder.add(Range.closed(1, 10));
        
        // Create a separate ImmutableList for demonstration
        ImmutableList<String> names = ImmutableList.of("Alice", "Bob", "Charlie");
        
        // Create a map to store name lengths
        Map<String, Integer> nameLengths = new HashMap<>();
        
        // Populate the map with name lengths
        for (String name : names) {
            nameLengths.put(name, name.length());
        }
        
        // Print the map entries
        for (Map.Entry<String, Integer> entry : nameLengths.entrySet()) {
            System.out.println(entry.getKey() + " has length " + entry.getValue());
        }
        
        // Build the ImmutableRangeSet
        ImmutableRangeSet<Integer> rangeSet = builder.build();
        
        // Perform some unrelated computations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10 is: " + sum);
        
        // Check if a specific value is within the range
        /* read */ boolean containsValue = rangeSet.contains(5);
        
        // Print the result
        System.out.println("RangeSet contains 5: " + containsValue);
        
        // More unrelated computations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5 is: " + product);
    }
}