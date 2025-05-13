import com.google.common.collect.ImmutableRangeSet;

public class RangeChecker {
    private ImmutableRangeSet<Integer> rangeSet;

    public RangeChecker(ImmutableRangeSet<Integer> rangeSet) {
        this.rangeSet = rangeSet;
    }

    public boolean contains(int value) {
        /* read */ return rangeSet.contains(value);
    }
}
