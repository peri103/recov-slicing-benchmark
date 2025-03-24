import com.google.common.collect.TreeRangeMap;
import com.google.common.collect.Range;

public class RangeMapManager {
    private TreeRangeMap<Integer, String> rangeMap = TreeRangeMap.create();

    public void addRange(int start, int end, String value) {
        /* write */ rangeMap.put(Range.closed(start, end), value);
    }

    public String getValue(int key) {
        return rangeMap.get(key);
    }
}
