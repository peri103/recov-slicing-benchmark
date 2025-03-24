import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.ImmutableRangeSet.Builder;
import com.google.common.collect.Range;

public class RangeSetBuilder {
    private ImmutableRangeSet<Integer> rangeSet;

    public void buildRangeSet() {
        Builder<Integer> builder = ImmutableRangeSet.builder();
        /* write */ builder.add(Range.closed(1, 5));
        rangeSet = builder.build();
    }

    public ImmutableRangeSet<Integer> getRangeSet() {
        return rangeSet;
    }
}
