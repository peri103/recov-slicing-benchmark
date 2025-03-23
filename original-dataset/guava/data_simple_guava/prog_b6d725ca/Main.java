import com.google.common.collect.TreeRangeMap;
import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        TreeRangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        /* write */ rangeMap.put(Range.closed(1, 5), "Value1");
        /* read */ String value = rangeMap.get(3);
        System.out.println(value);
    }
}