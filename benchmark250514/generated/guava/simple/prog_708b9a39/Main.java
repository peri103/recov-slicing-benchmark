import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the RangeMap
        RangeMap<Integer, String> rangeMap = TreeRangeMap.create();

        // Define a range and a value to associate with that range
        Range<Integer> range = Range.closed(1, 10);
        String valueToWrite = "Value in Range";

        // Use the put method to associate the value with the range
        /* write */ rangeMap.put(range, valueToWrite);

        // Use the get method to retrieve the value associated with a specific key
        /* read */ String valueRead = rangeMap.get(5);

        // Output the read value
        System.out.println(valueRead);
    }
}