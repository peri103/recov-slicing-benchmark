import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;

public class MyRangeMap {
    private RangeMap<Integer, String> rangeMap = TreeRangeMap.create();

    public MyRangeMap() {
        // Initialize with some values
        /* write */ rangeMap.put(Range.closed(1, 10), "Value in range 1 to 10");
    }

    public void addRange(int lower, int upper, String value) {
        rangeMap.put(Range.closed(lower, upper), value);
    }

    public String getValue(int key) {
        return rangeMap.get(key);
    }
}
