import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;
import com.google.common.collect.Range;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Initialize a RangeSet object
        RangeSet<Integer> rangeSet = TreeRangeSet.create();

        // Use the write method to add a range to the RangeSet
        /* write */ rangeSet.add(Range.closed(1, 10));

        // Initialize a HashSet to store some values
        Set<Integer> valueSet = new HashSet<>();
        valueSet.add(5);
        valueSet.add(15);
        valueSet.add(25);

        // Iterate over the HashSet and check if each value is within the RangeSet
        for (Integer value : valueSet) {
            boolean isInRange = rangeSet.contains(value);
            System.out.println("Value " + value + " is in range: " + isInRange);
        }

        // Add more ranges to the RangeSet
        rangeSet.add(Range.closed(20, 30));
        rangeSet.add(Range.closed(40, 50));

        // Perform some operations on the RangeSet
        boolean containsTwentyFive = rangeSet.contains(25);
        System.out.println("RangeSet contains 25: " + containsTwentyFive);

        // Use the read method to check if a specific value is within the RangeSet
        /* read */ boolean containsValue = rangeSet.contains(5);

        // Print the result
        System.out.println("RangeSet contains 5: " + containsValue);

        // Perform additional operations
        Set<Integer> moreValues = new HashSet<>();
        moreValues.add(35);
        moreValues.add(45);
        moreValues.add(55);

        for (Integer value : moreValues) {
            boolean isInRange = rangeSet.contains(value);
            System.out.println("Value " + value + " is in range: " + isInRange);
        }
    }
}