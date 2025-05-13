import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.Range;

public class RangeManager {
    private ImmutableRangeSet.Builder<Integer> builder = new ImmutableRangeSet.Builder<>();

    public void addRange(int lower, int upper) {
        /* write */ builder.add(Range.closed(lower, upper));
    }

    public ImmutableRangeSet<Integer> buildRangeSet() {
        return builder.build();
    }
}
