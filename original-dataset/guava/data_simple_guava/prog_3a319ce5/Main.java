import com.google.common.collect.HashRangeMap;
import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        HashRangeMap<Integer, String> rangeMap = HashRangeMap.create();
        /* write */ rangeMap.put(Range.closed(1, 10), "Value in range 1-10");
        /* read */ String value = rangeMap.get(5); // This value is retrieved from the range
        System.out.println(value);
    }
}