import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;

public class Main {
    public static void main(String[] args) {
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        /* write */ rangeSet.add(Range.closed(1, 10));
        /* read */ boolean contains = rangeSet.contains(5);
        System.out.println(contains); // Should print true since 5 is within the range [1, 10]
    }
}