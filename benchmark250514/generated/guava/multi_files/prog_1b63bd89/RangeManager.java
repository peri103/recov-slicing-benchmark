import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;

public class RangeManager {
    private RangeSet<Integer> rangeSet = TreeRangeSet.create();

    public void addRange(int start, int end) {
        /* write */ rangeSet.add(Range.closed(start, end));
    }

    public boolean containsValue(int value) {
        return rangeSet.contains(value);
    }
}
