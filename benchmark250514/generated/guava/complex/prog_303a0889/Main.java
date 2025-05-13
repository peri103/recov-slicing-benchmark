import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Original ImmutableRangeMap usage
        ImmutableRangeMap.Builder<Integer, String> builder = new ImmutableRangeMap.Builder<>();
        /* write */ builder.put(Range.closed(1, 10), "Value1");
        
        // Additional code to make the program more complex
        RangeMap<Integer, String> rangeMap2 = TreeRangeMap.create();
        rangeMap2.put(Range.closed(11, 20), "Value2");
        
        Map<Integer, String> map = new HashMap<>();
        map.put(21, "Value3");
        map.put(22, "Value4");
        
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            rangeMap2.put(Range.singleton(entry.getKey()), entry.getValue());
        }
        
        // Build the original ImmutableRangeMap
        ImmutableRangeMap<Integer, String> rangeMap = builder.build();
        
        // Perform operations on rangeMap2
        String valueFromRangeMap2 = rangeMap2.get(15);
        System.out.println("Value from rangeMap2: " + valueFromRangeMap2);
        
        // More complex operations
        int sum = 0;
        for (int i = 1; i <= 22; i++) {
            if (rangeMap.get(i) != null) {
                sum += i;
            }
        }
        
        System.out.println("Sum of keys with values: " + sum);
        
        // Original read operation
        /* read */ String value = rangeMap.get(5);
        System.out.println("Original value from rangeMap: " + value);
    }
}