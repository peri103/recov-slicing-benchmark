import com.google.common.collect.TreeRangeSet;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TreeRangeSet<Integer> rangeSet = TreeRangeSet.create();
        ImmutableList<Integer> list = ImmutableList.of(1, 2, 3, 4, 5);
        
        // Create a map to store some key-value pairs
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        // Perform some calculations
        int sum = 0;
        for (Integer number : list) {
            sum += number;
        }
        
        // Output the sum of the list
        System.out.println("Sum of list: " + sum);
        
        // Add a range to the rangeSet
        /* write */ rangeSet.add(Range.closed(1, 10));
        
        // Perform some operations on the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Check if a value is contained within the rangeSet
        /* read */ boolean containsValue = rangeSet.contains(5);
        System.out.println("RangeSet contains 5: " + containsValue);
        
        // Additional operations
        rangeSet.add(Range.closed(11, 20));
        boolean containsAnotherValue = rangeSet.contains(15);
        System.out.println("RangeSet contains 15: " + containsAnotherValue);
    }
}