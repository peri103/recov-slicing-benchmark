import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;
import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        // Initialize a RangeSet object
        RangeSet<Integer> rangeSet = TreeRangeSet.create();

        // Use the write method to add a range to the RangeSet
        /* write */ rangeSet.add(Range.closed(1, 10));

        // Use the read method to check if a specific value is within the RangeSet
        /* read */ boolean containsValue = rangeSet.contains(5);

        // Print the result
        System.out.println(containsValue);
    }
}