import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;

public class RangeContainer {
    private RangeMap<Integer, String> rangeMap = TreeRangeMap.create();

    public void addRange(int lower, int upper, String value) {
        /* write */ rangeMap.put(Range.closed(lower, upper), value);
    }

    public String getValue(int key) {
        return rangeMap.get(key);
    }
}
