import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;
import com.google.common.collect.Range;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        Set<Integer> testValues = new HashSet<>();
        
        // Adding values to the test set
        for (int i = 0; i <= 15; i++) {
            testValues.add(i);
        }
        
        // Adding another range to the rangeSet
        RangeSet<Integer> anotherRangeSet = TreeRangeSet.create();
        anotherRangeSet.add(Range.closed(20, 30));
        
        // Merging anotherRangeSet into rangeSet
        rangeSet.addAll(anotherRangeSet);
        
        // Adding a range to the rangeSet
        /* write */ rangeSet.add(Range.closed(1, 10));
        
        // Checking if specific values are within the rangeSet
        for (Integer value : testValues) {
            if (rangeSet.contains(value)) {
                System.out.println("RangeSet contains: " + value);
            } else {
                System.out.println("RangeSet does not contain: " + value);
            }
        }
        
        // Checking if a specific value is within the rangeSet
        /* read */ boolean containsValue = rangeSet.contains(5);
        System.out.println("Does the rangeSet contain 5? " + containsValue); // This should print 'true'
        
        // Adding more complex logic
        for (int i = 10; i < 20; i++) {
            if (!rangeSet.contains(i)) {
                System.out.println("Adding missing value to another set: " + i);
            }
        }
        
        // Final verification of the rangeSet
        System.out.println("Final verification of rangeSet:");
        for (int i = 1; i <= 30; i++) {
            if (rangeSet.contains(i)) {
                System.out.println(i + " is within the range.");
            }
        }
    }
}