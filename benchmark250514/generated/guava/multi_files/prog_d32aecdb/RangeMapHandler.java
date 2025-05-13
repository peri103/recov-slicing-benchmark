import com.google.common.collect.Range;
import com.google.common.collect.TreeRangeMap;

public class RangeMapHandler {
    private TreeRangeMap<Integer, String> rangeMap = TreeRangeMap.create();

    public void addRange(Range<Integer> range, String value) {
        /* write */ rangeMap.put(range, value);
    }

    public String getValue(int key) {
        return rangeMap.get(key);
    }
}
