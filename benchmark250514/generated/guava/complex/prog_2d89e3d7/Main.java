import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;
import com.google.common.collect.RangeSet;
import com.google.common.collect.TreeRangeSet;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Original RangeMap setup
        RangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        /* write */ rangeMap.put(Range.closed(1, 10), "Value in range 1 to 10");

        // Additional RangeMap setup
        RangeMap<Integer, String> anotherRangeMap = TreeRangeMap.create();
        anotherRangeMap.put(Range.closed(11, 20), "Value in range 11 to 20");

        // RangeSet example
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        rangeSet.add(Range.closedOpen(5, 15));
        rangeSet.add(Range.closedOpen(20, 25));

        // HashMap example
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");

        // Operations on HashMap
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // RangeSet operations
        System.out.println("Ranges in RangeSet:");
        for (Range<Integer> range : rangeSet.asRanges()) {
            System.out.println(range);
        }

        // Operations on anotherRangeMap
        String anotherValue = anotherRangeMap.get(15);
        System.out.println("Value from anotherRangeMap: " + anotherValue);

        // Final read operation from the original RangeMap
        /* read */ String value = rangeMap.get(5);
        System.out.println(value);

        // Additional operations
        rangeMap.put(Range.closed(21, 30), "Value in range 21 to 30");
        String newValue = rangeMap.get(25);
        System.out.println("New value from rangeMap: " + newValue);
    }
}