import com.google.common.collect.Range;
import com.google.common.collect.TreeRangeMap;

public class Main {
    public static void main(String[] args) {
        TreeRangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        /* write */ rangeMap.put(Range.closed(1, 10), "Value1");
        /* read */ String value = rangeMap.get(5);
        System.out.println(value);
    }
}