import com.google.common.collect.Range;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;

public class RangeAnalyzer {
    private RangeSet<Integer> anotherRangeSet = TreeRangeSet.create();

    public RangeAnalyzer() {
        anotherRangeSet.add(Range.open(20, 30));
        anotherRangeSet.add(Range.closedOpen(40, 50));
    }

    public boolean isValueContained(int value) {
        return anotherRangeSet.contains(value);
    }

    public boolean doesEncloseRange(Range<Integer> range) {
        return anotherRangeSet.encloses(range);
    }
}
