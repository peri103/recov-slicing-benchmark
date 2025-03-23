import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.RangeMapBuilder;

public class Main {
    public static void main(String[] args) {
        RangeMap<Integer, String> rangeMap = RangeMapBuilder.<Integer, String>create();
        /* write */ rangeMap.put(Range.closed(1, 5), "Value1");
        /* read */ String value = rangeMap.get(3);
        System.out.println(value);
    }
}