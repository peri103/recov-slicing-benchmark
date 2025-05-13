import com.google.common.collect.TreeRangeSet;
import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        TreeRangeSet<Integer> rangeSet = TreeRangeSet.create();
        
        /* write */ rangeSet.add(Range.closed(1, 10));
        
        /* read */ boolean containsValue = rangeSet.contains(5);
        
        System.out.println(containsValue); // This should print 'true' as 5 is within the range [1, 10]
    }
}