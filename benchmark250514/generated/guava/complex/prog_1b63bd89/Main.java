import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        Map<String, Integer> sampleMap = new HashMap<>();
        
        // Adding some entries to the map
        sampleMap.put("one", 1);
        sampleMap.put("two", 2);
        sampleMap.put("three", 3);
        
        // Performing operations on the map
        int sum = 0;
        for (String key : sampleMap.keySet()) {
            sum += sampleMap.get(key);
        }
        
        System.out.println("Sum of map values: " + sum);
        
        // Working with rangeSet
        /* write */ rangeSet.add(Range.closed(1, 10));
        
        // Doing some unrelated calculations
        int[] numbers = {5, 10, 15, 20};
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        
        System.out.println("Product of numbers array: " + product);
        
        // More range operations
        rangeSet.add(Range.closed(15, 20));
        rangeSet.add(Range.closedOpen(25, 30));
        
        // Check for a value in the rangeSet
        boolean containsValue = rangeSet.contains(5);
        
        // Continuing with unrelated operations
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        
        System.out.println("Max value in numbers array: " + max);
        
        // Finally, reading from rangeSet
        /* read */ System.out.println("RangeSet contains 5: " + containsValue);
    }
}