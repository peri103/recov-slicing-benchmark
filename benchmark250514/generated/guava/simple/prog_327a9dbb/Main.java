import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        ImmutableRangeMap<Integer, String> rangeMap = ImmutableRangeMap.<Integer, String>builder()
            /* write */ .put(Range.closed(1, 10), "Low")
            .put(Range.closed(11, 20), "Medium")
            .put(Range.closed(21, 30), "High")
            .build();

        /* read */ String value = rangeMap.get(5);
        System.out.println(value);
    }
}