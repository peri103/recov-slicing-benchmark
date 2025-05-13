import com.google.common.collect.TreeRangeSet;
import com.google.common.collect.Range;

public class RangeManager {
    private TreeRangeSet<Integer> rangeSet = TreeRangeSet.create();

    public void addRange(int start, int end) {
        /* write */ rangeSet.add(Range.closed(start, end));
    }

    public boolean checkContains(int value) {
        return rangeSet.contains(value);
    }

    public void removeRange(int start, int end) {
        rangeSet.remove(Range.closed(start, end));
    }
}
