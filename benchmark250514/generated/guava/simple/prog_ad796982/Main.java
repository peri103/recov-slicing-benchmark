import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        ImmutableRangeMap.Builder<Integer, String> builder = ImmutableRangeMap.builder();
        /* write */ builder.put(Range.closed(1, 10), "Value1");
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();
        /* read */ String value = rangeMap.get(5);
        System.out.println(value);
    }
}