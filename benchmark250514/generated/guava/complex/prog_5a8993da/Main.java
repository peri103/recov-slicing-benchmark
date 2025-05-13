import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Original write-read pair
        ImmutableRangeMap.Builder<Integer, String> builder = new ImmutableRangeMap.Builder<>();
        /* write */ builder.put(Range.closed(0, 10), "Value1");

        // Additional unrelated complex code
        Map<String, Integer> stringToIntMap = new HashMap<>();
        stringToIntMap.put("A", 1);
        stringToIntMap.put("B", 2);
        stringToIntMap.put("C", 3);

        for (String key : stringToIntMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + stringToIntMap.get(key));
        }

        RangeMap<Integer, String> treeRangeMap = TreeRangeMap.create();
        treeRangeMap.put(Range.closed(20, 30), "TreeMapValue1");
        treeRangeMap.put(Range.closed(31, 40), "TreeMapValue2");

        System.out.println("TreeRangeMap Get: " + treeRangeMap.get(25));

        // More complex logic
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 4: " + sum);

        ImmutableRangeMap<Integer, String> rangeMap = builder.build();
        /* read */ String value = rangeMap.get(5);

        System.out.println("ImmutableRangeMap Get: " + value);

        // Additional logic to further increase complexity
        for (int i = 0; i < 3; i++) {
            System.out.println("Iteration: " + i);
        }

        Map<Integer, String> intToStringMap = new HashMap<>();
        for (int i = 1; i <= 3; i++) {
            intToStringMap.put(i, "Number" + i);
        }

        for (Map.Entry<Integer, String> entry : intToStringMap.entrySet()) {
            System.out.println("Integer: " + entry.getKey() + ", String: " + entry.getValue());
        }
    }
}