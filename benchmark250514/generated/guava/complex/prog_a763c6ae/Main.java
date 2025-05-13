import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableRangeMap
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();
        
        // Define a range and associate a value with it
        Range<Integer> range = Range.closed(1, 10);
        /* write */ builder.put(range, "Value in range");

        // Create a TreeRangeMap for additional complexity
        RangeMap<Integer, String> treeRangeMap = TreeRangeMap.create();
        treeRangeMap.put(Range.closed(11, 20), "Another range value");
        
        // Add more ranges to the TreeRangeMap
        treeRangeMap.put(Range.closed(21, 30), "Yet another range value");
        
        // Use a HashMap for unrelated operations
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Key1", 100);
        hashMap.put("Key2", 200);
        
        // Perform some operations on the HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("HashMap Entry: " + entry.getKey() + " = " + entry.getValue());
        }
        
        // Build the ImmutableRangeMap from the builder
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();
        
        // Perform operations on the TreeRangeMap
        System.out.println("TreeRangeMap Value: " + treeRangeMap.get(15)); // Should print "Another range value"
        System.out.println("TreeRangeMap Value: " + treeRangeMap.get(25)); // Should print "Yet another range value"
        
        // Read the value associated with a key within the original range
        /* read */ String value = rangeMap.get(5); // 5 is within the range 1 to 10
        
        // Print the value
        System.out.println("ImmutableRangeMap Value: " + value);
    }
}