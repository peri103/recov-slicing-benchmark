import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;

public class RangeSetOperations {
    private ImmutableRangeSet<Integer> rangeSet;

    public RangeSetOperations() {
        rangeSet = /* write */ ImmutableRangeSet.of(Range.closed(1, 10));
    }

    public boolean contains(int value) {
        return rangeSet.contains(value);
    }
}
