import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;

public class RangeManager {
    private ImmutableRangeSet.Builder<Integer> builder = ImmutableRangeSet.builder();

    public void addRange(int start, int end) {
        /* write */ builder.add(Range.closed(start, end));
    }

    public ImmutableRangeSet<Integer> buildRangeSet() {
        return builder.build();
    }
}
