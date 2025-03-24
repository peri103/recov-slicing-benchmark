import com.google.common.collect.HashRangeMap;
import com.google.common.collect.Range;

public class RangeMapUtil {
    private HashRangeMap<Integer, String> rangeMap = HashRangeMap.create();

    public void addRange(int start, int end, String value) {
        /* write */ rangeMap.put(Range.closed(start, end), value);
    }

    public String getValue(int key) {
        return rangeMap.get(key);
    }
}
