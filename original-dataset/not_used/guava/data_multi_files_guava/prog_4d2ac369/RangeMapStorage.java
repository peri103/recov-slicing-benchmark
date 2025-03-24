import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.RangeMapBuilder;

public class RangeMapStorage {
    private RangeMap<Integer, String> rangeMap = RangeMapBuilder.<Integer, String>create();

    public void addRange(int start, int end, String value) {
        /* write */ rangeMap.put(Range.closed(start, end), value);
    }

    public String getValue(int key) {
        return rangeMap.get(key);
    }
}
