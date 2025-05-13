import com.google.common.collect.Range;
import com.google.common.collect.TreeRangeSet;
import com.google.common.collect.RangeSet;

public class Main {
    public static void main(String[] args) {
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        /* write */ rangeSet.add(Range.closed(1, 10));
        /* read */ boolean containsValue = rangeSet.contains(5);
        System.out.println(containsValue);
    }
}