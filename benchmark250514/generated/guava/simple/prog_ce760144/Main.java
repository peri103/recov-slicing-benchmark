import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        // Create an ImmutableRangeSet containing a range from 1 to 10
        ImmutableRangeSet<Integer> rangeSet = /* write */ ImmutableRangeSet.of(Range.closed(1, 10));
        
        // Check if the range set contains the number 5
        boolean containsValue = /* read */ rangeSet.contains(5);
        
        // Print the result
        System.out.println(containsValue);
    }
}