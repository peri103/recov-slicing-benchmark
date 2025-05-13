import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        RangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        Map<Integer, String> hashMap = new HashMap<>();
        
        hashMap.put(20, "B");
        hashMap.put(30, "C");
        
        /* write */ rangeMap.put(Range.closed(1, 10), "A");
        
        // Perform operations with hashMap
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Additional operations
        String hashMapValue = hashMap.get(20);
        System.out.println("Retrieved from HashMap: " + hashMapValue);
        
        // More complex logic
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum from 0 to 10 is: " + sum);

        // Retrieve value from rangeMap
        /* read */ String value = rangeMap.get(5);
        System.out.println("Retrieved from RangeMap: " + value);
        
        // More operations with rangeMap
        rangeMap.put(Range.closed(11, 20), "D");
        String anotherValue = rangeMap.get(15);
        System.out.println("Retrieved another value from RangeMap: " + anotherValue);
    }
}