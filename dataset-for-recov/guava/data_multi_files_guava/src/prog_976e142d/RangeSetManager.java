import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;

public class RangeSetManager {
    private RangeSet<Integer> rangeSet = TreeRangeSet.create();

    public void addRange(int start, int end) {
        /* write */ rangeSet.add(com.google.common.collect.Range.closed(start, end));
    }

    public boolean containsValue(int value) {
        return rangeSet.contains(value);
    }
}
