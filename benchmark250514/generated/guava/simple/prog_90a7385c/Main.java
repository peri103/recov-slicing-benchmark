import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;

public class Main {
    public static void main(String[] args) {
        // Initialize a RangeSet using TreeRangeSet implementation
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        
        // Define a Range to be added to the RangeSet
        Range<Integer> range = Range.closed(1, 10);
        
        /* write */ rangeSet.add(range);
        
        // Check if a specific value is within the range added to the RangeSet
        /* read */ boolean containsValue = rangeSet.contains(5);
        
        // Output the result
        System.out.println(containsValue);
    }
}