import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;

public class RangeMapOperations {
    private RangeMap<Integer, String> rangeMap = TreeRangeMap.create();

    public void addRangeWithLabel(int start, int end, String label) {
        rangeMap.put(Range.closed(start, end), label);
    }

    public String getLabel(int value) {
        return rangeMap.get(value);
    }

    public RangeMap<Integer, String> getRangeMap() {
        return rangeMap;
    }
}
