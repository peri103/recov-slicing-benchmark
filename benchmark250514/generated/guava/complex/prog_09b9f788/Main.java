import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;
import com.google.common.collect.Range;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the RangeMap using TreeRangeMap
        RangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        
        // Define a range and put a value in the RangeMap
        Range<Integer> range = Range.closed(1, 10);
        /* write */ rangeMap.put(range, "Hello, World!");
        
        // Additional code to increase complexity
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 10);
        hashMap.put("B", 20);
        hashMap.put("C", 30);
        
        int sum = 0;
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            sum += entry.getValue();
        }
        
        System.out.println("Sum of values in hashMap: " + sum);
        
        // More operations on hashMap
        if (hashMap.containsKey("B")) {
            hashMap.put("B", hashMap.get("B") + 10);
        }
        
        System.out.println("Updated value for key 'B': " + hashMap.get("B"));
        
        // Read the value from the RangeMap using a key within the range
        /* read */ String value = rangeMap.get(5);
        
        // Output the value
        System.out.println(value);
        
        // Further operations on hashMap
        hashMap.remove("C");
        
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }
        
        // Additional logic to manipulate data
        int product = 1;
        for (Integer val : hashMap.values()) {
            product *= val;
        }
        
        System.out.println("Product of values in hashMap: " + product);
    }
}