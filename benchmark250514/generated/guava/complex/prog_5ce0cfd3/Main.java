import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        Map<Integer, String> additionalMap = new HashMap<>();
        
        /* write */ rangeMap.put(Range.closed(1, 10), "Value1");
        
        additionalMap.put(20, "ExtraValue1");
        additionalMap.put(30, "ExtraValue2");
        
        for (int key : additionalMap.keySet()) {
            System.out.println("Additional Map Key: " + key + ", Value: " + additionalMap.get(key));
        }
        
        RangeMap<Integer, String> anotherRangeMap = TreeRangeMap.create();
        anotherRangeMap.put(Range.closed(11, 20), "Value2");
        
        for (int i = 1; i <= 30; i += 10) {
            String valueFromAnotherRangeMap = anotherRangeMap.get(i);
            if (valueFromAnotherRangeMap != null) {
                System.out.println("Another RangeMap Value at " + i + ": " + valueFromAnotherRangeMap);
            }
        }
        
        /* read */ String value = rangeMap.get(5);
        
        System.out.println("Value from RangeMap at 5: " + value);
        
        for (int i = 1; i <= 10; i++) {
            String valueFromRangeMap = rangeMap.get(i);
            if (valueFromRangeMap != null) {
                System.out.println("RangeMap Value at " + i + ": " + valueFromRangeMap);
            }
        }
    }
}