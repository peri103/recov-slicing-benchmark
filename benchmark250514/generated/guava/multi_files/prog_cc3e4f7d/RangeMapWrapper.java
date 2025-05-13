import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;
import com.google.common.collect.Range;

public class RangeMapWrapper {
    private RangeMap<Integer, String> rangeMap = TreeRangeMap.create();

    public void addRange(int lower, int upper, String value) {
        /* write */ rangeMap.put(Range.closed(lower, upper), value);
    }

    public String getValue(int key) {
        return rangeMap.get(key);
    }
}