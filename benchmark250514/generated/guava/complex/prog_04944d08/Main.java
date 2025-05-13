import com.google.common.collect.Range;
import com.google.common.collect.TreeRangeSet;
import com.google.common.collect.RangeSet;
import com.google.common.collect.ImmutableRangeSet;

public class Main {
    public static void main(String[] args) {
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        
        // Initialize another RangeSet
        RangeSet<Integer> anotherRangeSet = TreeRangeSet.create();
        
        // Add ranges to anotherRangeSet
        anotherRangeSet.add(Range.closed(20, 30));
        anotherRangeSet.add(Range.open(40, 50));
        
        // Add range to the main rangeSet
        /* write */ rangeSet.add(Range.closed(1, 10));
        
        // Check if certain values are contained in anotherRangeSet
        boolean containsInAnother = anotherRangeSet.contains(25);
        System.out.println("AnotherRangeSet contains 25: " + containsInAnother);
        
        // Merge anotherRangeSet into rangeSet
        rangeSet.addAll(anotherRangeSet);
        
        // Create an ImmutableRangeSet from rangeSet
        ImmutableRangeSet<Integer> immutableRangeSet = ImmutableRangeSet.copyOf(rangeSet);
        
        // Iterate over ranges in immutableRangeSet
        for (Range<Integer> range : immutableRangeSet.asRanges()) {
            System.out.println("Range: " + range);
        }
        
        // Check if the rangeSet contains a specific value
        /* read */ boolean containsValue = rangeSet.contains(5);
        System.out.println("RangeSet contains 5: " + containsValue);
        
        // Check if the rangeSet contains another specific value
        boolean containsAnotherValue = rangeSet.contains(45);
        System.out.println("RangeSet contains 45: " + containsAnotherValue);
        
        // Add more ranges to rangeSet
        rangeSet.add(Range.open(60, 70));
        
        // Iterate over ranges in rangeSet
        for (Range<Integer> range : rangeSet.asRanges()) {
            System.out.println("Updated Range: " + range);
        }
    }
}