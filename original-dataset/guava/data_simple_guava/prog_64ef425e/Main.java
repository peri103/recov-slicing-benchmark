import com.google.common.collect.ImmutableRangeSet;
import com.google.common.collect.ImmutableRangeSet.Builder;
import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        Builder<Integer> builder = ImmutableRangeSet.builder();
        /* write */ builder.add(Range.closed(1, 5));
        ImmutableRangeSet<Integer> rangeSet = builder.build();
        /* read */ boolean containsValue = rangeSet.contains(3);
        System.out.println("Does the range set contain 3? " + containsValue);
    }
}