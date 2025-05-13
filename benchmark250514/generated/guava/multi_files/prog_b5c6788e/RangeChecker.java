import com.google.common.collect.TreeRangeSet;

public class RangeChecker {
    private TreeRangeSet<Integer> rangeSet;

    public RangeChecker(TreeRangeSet<Integer> rangeSet) {
        this.rangeSet = rangeSet;
    }

    public boolean checkValue(int value) {
        /* read */ return rangeSet.contains(value);
    }
}
