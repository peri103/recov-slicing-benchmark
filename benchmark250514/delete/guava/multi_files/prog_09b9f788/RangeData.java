import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;
import com.google.common.collect.Range;

public class RangeData {
    private RangeMap<Integer, String> rangeMap = TreeRangeMap.create();

    public void addRangeData(Range<Integer> range, String value) {
        /* write */ rangeMap.put(range, value);
    }

    public String getRangeData(int key) {
        return rangeMap.get(key);
    }
}