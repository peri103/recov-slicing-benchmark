import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.ImmutableRangeMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        Map<Integer, String> simpleMap = new HashMap<>();
        RangeMap<Integer, String> immutableRangeMap = ImmutableRangeMap.of(Range.closed(20, 30), "ImmutableValue");

        /* write */ rangeMap.put(Range.closed(1, 10), "Value");

        // Adding entries to simpleMap
        for (int i = 11; i <= 15; i++) {
            simpleMap.put(i, "SimpleValue" + i);
        }

        // Iterating over simpleMap and printing values
        for (Map.Entry<Integer, String> entry : simpleMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Using immutableRangeMap to get a value
        String immutableValue = immutableRangeMap.get(25);
        System.out.println("Immutable RangeMap Value: " + immutableValue);

        // Some unrelated computations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        /* read */ String value = rangeMap.get(5);

        // Print the value from the original RangeMap
        System.out.println("Original RangeMap Value: " + value);
    }
}