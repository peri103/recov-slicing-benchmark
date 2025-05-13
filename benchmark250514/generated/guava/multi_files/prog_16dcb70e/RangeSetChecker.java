import com.google.common.collect.ImmutableRangeSet;

public class RangeSetChecker {
    private ImmutableRangeSet<Integer> rangeSet;

    public RangeSetChecker(ImmutableRangeSet<Integer> rangeSet) {
        this.rangeSet = rangeSet;
    }

    public boolean contains(int value) {
        return rangeSet.contains(value);
    }
}
