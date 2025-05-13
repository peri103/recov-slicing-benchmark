import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;
import com.google.common.collect.Range;

public class Main {
    public static void main(String[] args) {
        // Initialize the RangeMap using TreeRangeMap
        RangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        
        // Define a range and put a value in the RangeMap
        Range<Integer> range = Range.closed(1, 10);
        /* write */ rangeMap.put(range, "Hello, World!");
        
        // Read the value from the RangeMap using a key within the range
        /* read */ String value = rangeMap.get(5);
        
        // Output the value
        System.out.println(value);
    }
}