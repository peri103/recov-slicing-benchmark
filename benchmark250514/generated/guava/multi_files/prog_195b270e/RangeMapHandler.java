import com.google.common.collect.Range;
import com.google.common.collect.TreeRangeMap;

public class RangeMapHandler {
    private TreeRangeMap<Integer, String> rangeMap = TreeRangeMap.create();

    public void addRange(int start, int end, String value) {
        /* write */ rangeMap.put(Range.closed(start, end), value);
    }

    public String getValue(int key) {
        return rangeMap.get(key);
    }
}
