import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;

public class RangeMapBuilder {
    private ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();

    public void addRange(int start, int end, String value) {
        builder.put(Range.closed(start, end), value);
    }

    public ImmutableRangeMap<Integer, String> buildRangeMap() {
        /* write */ return builder.build();
    }
}
