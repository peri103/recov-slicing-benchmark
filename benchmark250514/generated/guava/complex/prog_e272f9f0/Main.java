import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;
import com.google.common.collect.ImmutableRangeMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        
        /* write */ rangeMap.put(Range.closed(1, 10), "A");
        
        // Additional complex logic
        RangeMap<Integer, String> immutableRangeMap = ImmutableRangeMap.<Integer, String>builder()
                .put(Range.closed(11, 20), "B")
                .put(Range.closed(21, 30), "C")
                .build();
        
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        RangeMap<Integer, String> combinedRangeMap = TreeRangeMap.create();
        combinedRangeMap.putAll(rangeMap);
        combinedRangeMap.putAll(immutableRangeMap);
        
        String valueFromImmutableMap = immutableRangeMap.get(15);
        System.out.println("Value from ImmutableRangeMap: " + valueFromImmutableMap);
        
        /* read */ String value = rangeMap.get(5);
        
        System.out.println("Value from original RangeMap: " + value);
        
        // More unrelated code
        for (int i = 0; i < 5; i++) {
            hashMap.put(i + 3, "Number " + (i + 3));
        }
        
        for (int i = 3; i < 8; i++) {
            System.out.println("HashMap Key: " + i + ", Value: " + hashMap.get(i));
        }
    }
}