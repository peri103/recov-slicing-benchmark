import com.google.common.collect.TreeRangeSet;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableRangeSet;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        TreeRangeSet<Integer> rangeSet = TreeRangeSet.create();
        HashMap<String, Integer> map = new HashMap<>();
        
        // Adding some values to the map
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        
        // Using ImmutableRangeSet for additional complexity
        ImmutableRangeSet<Integer> immutableRangeSet = ImmutableRangeSet.of(Range.closed(20, 30));
        
        // Iterating over the map and printing values
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
        
        // Adding more ranges to the TreeRangeSet
        rangeSet.add(Range.closed(11, 15));
        rangeSet.add(Range.closed(16, 20));
        
        // Performing some operations on the ImmutableRangeSet
        boolean containsInImmutable = immutableRangeSet.contains(25);
        System.out.println("ImmutableRangeSet contains 25: " + containsInImmutable);
        
        /* write */ rangeSet.add(Range.closed(1, 10));
        
        // More operations to add complexity
        int sum = 0;
        for (int i = 21; i <= 30; i++) {
            if (immutableRangeSet.contains(i)) {
                sum += i;
            }
        }
        System.out.println("Sum of numbers in ImmutableRangeSet: " + sum);
        
        /* read */ boolean containsValue = rangeSet.contains(5);
        System.out.println(containsValue); // This should print 'true' since 5 is within the range [1, 10]
        
        // Further operations on the TreeRangeSet
        boolean containsAnotherValue = rangeSet.contains(12);
        System.out.println("RangeSet contains 12: " + containsAnotherValue); // This should print 'true'
    }
}