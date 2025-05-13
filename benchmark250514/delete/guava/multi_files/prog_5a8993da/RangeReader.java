import com.google.common.collect.ImmutableRangeMap;

public class RangeReader {
    private ImmutableRangeMap<Integer, String> rangeMap;

    public RangeReader(ImmutableRangeMap<Integer, String> rangeMap) {
        this.rangeMap = rangeMap;
    }

    public String readValue(int key) {
        /* read */ return rangeMap.get(key);
    }
}
