import com.google.common.collect.ImmutableRangeMap;

public class RangeMapReader {
    private ImmutableRangeMap<Integer, String> rangeMap;

    public RangeMapReader(ImmutableRangeMap<Integer, String> rangeMap) {
        this.rangeMap = rangeMap;
    }

    public String getValue(int key) {
        /* read */ return rangeMap.get(key);
    }
}
