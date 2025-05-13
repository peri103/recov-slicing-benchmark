import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;
import com.google.common.collect.Range;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        Map<String, RangeSet<Integer>> rangeMap = new HashMap<>();
        
        // Adding ranges to the rangeSet
        /* write */ rangeSet.add(Range.closed(1, 10));
        
        // Adding more ranges to rangeSet
        rangeSet.add(Range.closed(11, 20));
        
        // Adding rangeSet to a map with a key
        rangeMap.put("firstRangeSet", rangeSet);
        
        // Performing operations on the map
        RangeSet<Integer> retrievedRangeSet = rangeMap.get("firstRangeSet");
        boolean isContained = retrievedRangeSet.contains(15);
        System.out.println("Contains 15: " + isContained);
        
        // More complex operations with the map
        RangeSet<Integer> anotherRangeSet = TreeRangeSet.create();
        anotherRangeSet.add(Range.closed(21, 30));
        rangeMap.put("secondRangeSet", anotherRangeSet);
        
        for (String key : rangeMap.keySet()) {
            RangeSet<Integer> currentSet = rangeMap.get(key);
            System.out.println("RangeSet for key " + key + ": " + currentSet);
        }
        
        // Final operation to read from the original rangeSet
        /* read */ boolean containsValue = rangeSet.contains(5);
        
        System.out.println("Original RangeSet contains 5: " + containsValue);
    }
}