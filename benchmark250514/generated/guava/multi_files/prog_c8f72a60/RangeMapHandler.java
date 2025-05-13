import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;

public class RangeMapHandler {
    private ImmutableRangeMap.Builder<Integer, String> builder;

    public RangeMapHandler() {
        builder = new ImmutableRangeMap.Builder<>();
    }

    public void addRange(int start, int end, String value) {
        /* write */ builder.put(Range.closed(start, end), value);
    }

    public ImmutableRangeMap<Integer, String> build() {
        return builder.build();
    }
}