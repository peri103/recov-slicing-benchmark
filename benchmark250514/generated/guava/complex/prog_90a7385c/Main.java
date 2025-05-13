import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;
import com.google.common.collect.ImmutableRangeSet;

public class Main {
    public static void main(String[] args) {
        // Initialize a RangeSet using TreeRangeSet implementation
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        
        // Define a Range to be added to the RangeSet
        Range<Integer> range = Range.closed(1, 10);
        
        // Initialize another RangeSet using ImmutableRangeSet
        RangeSet<Integer> immutableRangeSet = ImmutableRangeSet.of(Range.closed(5, 15));
        
        // Perform some operations on the immutableRangeSet
        boolean containsInImmutable = immutableRangeSet.contains(8);
        System.out.println("Immutable RangeSet contains 8: " + containsInImmutable);
        
        // Add the range to the mutable rangeSet
        /* write */ rangeSet.add(range);
        
        // Perform some other operations on rangeSet
        Range<Integer> anotherRange = Range.open(10, 20);
        rangeSet.add(anotherRange);
        
        // Check if a specific value is within the range added to the RangeSet
        boolean containsValueInAnotherRange = rangeSet.contains(15);
        System.out.println("RangeSet contains 15: " + containsValueInAnotherRange);
        
        // Perform unrelated operations to make the program more complex
        for (int i = 0; i < 5; i++) {
            int square = i * i;
            System.out.println("Square of " + i + " is: " + square);
        }
        
        // Output the result of the original read operation
        /* read */ boolean containsValue = rangeSet.contains(5);
        System.out.println("RangeSet contains 5: " + containsValue);
        
        // Further operations on rangeSet
        RangeSet<Integer> intersectionRangeSet = rangeSet.subRangeSet(Range.closed(0, 25));
        System.out.println("Intersection RangeSet contains 10: " + intersectionRangeSet.contains(10));
    }
}