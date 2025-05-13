import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;

public class RangeManager {
    private RangeSet<Integer> rangeSet;

    public RangeManager() {
        rangeSet = TreeRangeSet.create();
    }

    public void addRange(int lower, int upper) {
        /* write */ rangeSet.add(Range.closed(lower, upper));
    }

    public boolean contains(int value) {
        return rangeSet.contains(value);
    }
}