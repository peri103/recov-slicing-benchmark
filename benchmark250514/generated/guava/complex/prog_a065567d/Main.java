import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        Map<Integer, String> additionalMap = new HashMap<>();
        
        additionalMap.put(11, "Value2");
        additionalMap.put(12, "Value3");
        
        /* write */ rangeMap.put(Range.closed(1, 10), "Value1");
        
        for (Map.Entry<Integer, String> entry : additionalMap.entrySet()) {
            if (entry.getKey() > 10) {
                rangeMap.put(Range.singleton(entry.getKey()), entry.getValue());
            }
        }
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
        
        // More unrelated code
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append("Iteration ").append(i).append("\n");
        }
        System.out.println(sb.toString());
        
        /* read */ String value = rangeMap.get(5);
        System.out.println(value);
        
        // Further operations on the rangeMap
        for (int i = 11; i <= 12; i++) {
            String val = rangeMap.get(i);
            if (val != null) {
                System.out.println("Value at " + i + ": " + val);
            }
        }
    }
}