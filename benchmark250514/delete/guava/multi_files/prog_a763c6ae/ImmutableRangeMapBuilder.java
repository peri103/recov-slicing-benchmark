import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;

public class ImmutableRangeMapBuilder {
    private ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();

    public void addRange(Range<Integer> range, String value) {
        /* write */ builder.put(range, value);
    }

    public ImmutableRangeMap<Integer, String> build() {
        return builder.build();
    }
}
