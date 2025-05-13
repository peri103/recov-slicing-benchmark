import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;

public class RangeMapWrapper {
    private RangeMap<Integer, String> rangeMap = TreeRangeMap.create();

    public void addRange(Range<Integer> range, String value) {
        /* write */ rangeMap.put(range, value);
    }

    public String getValue(int key) {
        return rangeMap.get(key);
    }
}
