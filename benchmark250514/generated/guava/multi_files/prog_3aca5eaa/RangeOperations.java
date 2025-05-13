import com.google.common.collect.TreeRangeSet;
import com.google.common.collect.Range;

public class RangeOperations {
    private TreeRangeSet<Integer> rangeSet = TreeRangeSet.create();

    public void addRange(int start, int end) {
        /* write */ rangeSet.add(Range.closed(start, end));
    }

    public boolean containsValue(int value) {
        return rangeSet.contains(value);
    }
}
