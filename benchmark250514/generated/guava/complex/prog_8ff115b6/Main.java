import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeSet
        ImmutableRangeSet.Builder<Integer> builder = ImmutableRangeSet.builder();
        
        // Add a range to the builder
        /* write */ builder.add(Range.closed(1, 10));
        
        // Additional complex code
        HashMap<String, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        
        // Populate the map
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        
        // Populate the set
        for (int i = 0; i < 5; i++) {
            set.add(i * 2);
        }
        
        // Perform operations on the map
        for (String key : map.keySet()) {
            int value = map.get(key);
            if (value % 2 == 0) {
                set.add(value * 3);
            }
        }
        
        // Build the ImmutableRangeSet
        ImmutableRangeSet<Integer> rangeSet = builder.build();
        
        // Perform operations on the set
        for (Integer num : set) {
            if (num > 5) {
                System.out.println("Number greater than 5: " + num);
            }
        }
        
        // Check if a specific value is contained within the range set
        /* read */ boolean containsValue = rangeSet.contains(5);
        
        // Print the result
        System.out.println("RangeSet contains 5: " + containsValue);
        
        // Additional operations with the set
        int sum = 0;
        for (Integer num : set) {
            sum += num;
        }
        System.out.println("Sum of numbers in set: " + sum);
    }
}