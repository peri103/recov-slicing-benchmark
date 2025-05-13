import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;
import com.google.common.collect.TreeRangeSet;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the builder for ImmutableRangeSet
        ImmutableRangeSet.Builder<Integer> builder = ImmutableRangeSet.builder();
        
        // Add a range to the builder
        /* write */ builder.add(Range.closed(1, 10));
        
        // Initialize a TreeRangeSet for additional complexity
        TreeRangeSet<Integer> treeRangeSet = TreeRangeSet.create();
        treeRangeSet.add(Range.closed(20, 30));
        
        // Create a HashMap to store some values
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 100);
        map.put("B", 200);
        
        // Perform some operations on the map
        Integer valueA = map.get("A");
        System.out.println("Value of A: " + valueA);
        
        // Build the ImmutableRangeSet
        ImmutableRangeSet<Integer> rangeSet = builder.build();
        
        // Perform operations with TreeRangeSet
        boolean treeContainsValue = treeRangeSet.contains(25);
        System.out.println("TreeRangeSet contains 25: " + treeContainsValue);
        
        // Check if a specific value is within the range set
        /* read */ boolean containsValue = rangeSet.contains(5);
        
        // Print the result
        System.out.println("ImmutableRangeSet contains 5: " + containsValue);
        
        // Additional operations to increase complexity
        for (int i = 0; i < 5; i++) {
            map.put("Key" + i, i * 10);
        }
        
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}