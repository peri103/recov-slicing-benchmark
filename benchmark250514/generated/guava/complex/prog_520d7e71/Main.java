import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;
import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;

public class Main {
    public static void main(String[] args) {
        RangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        rangeSet.add(Range.closed(11, 20));
        rangeSet.add(Range.closed(21, 30));
        
        RangeMap<Integer, String> immutableRangeMap = ImmutableRangeMap.<Integer, String>builder()
            .put(Range.closed(31, 40), "Immutable Range 31-40")
            .put(Range.closed(41, 50), "Immutable Range 41-50")
            .build();
        
        /* write */ rangeMap.put(Range.closed(1, 10), "Value for range 1-10");
        
        // Additional operations with rangeMap
        rangeMap.put(Range.closed(11, 20), "Value for range 11-20");
        rangeMap.put(Range.closed(21, 30), "Value for range 21-30");
        
        // Check if a number is within the rangeSet
        boolean contains = rangeSet.contains(15);
        System.out.println("RangeSet contains 15: " + contains);
        
        // Get value from immutableRangeMap
        String immutableValue = immutableRangeMap.get(35);
        System.out.println("Immutable RangeMap value for 35: " + immutableValue);
        
        // More complex logic
        for (int i = 1; i <= 50; i++) {
            String valueFromRangeMap = rangeMap.get(i);
            if (valueFromRangeMap != null) {
                System.out.println("RangeMap value for " + i + ": " + valueFromRangeMap);
            }
        }
        
        /* read */ String value = rangeMap.get(5);
        
        System.out.println("Read value: " + value);
    }
}