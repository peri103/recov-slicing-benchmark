import com.google.common.collect.Range;
import com.google.common.collect.TreeRangeMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize TreeRangeMap
        TreeRangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        
        // Initialize a HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        
        // Populate HashMap with some values
        for (int i = 1; i <= 5; i++) {
            hashMap.put(i, "Value " + i);
        }
        
        // Iterate over HashMap and print values
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("HashMap Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Perform some operations on TreeRangeMap
        rangeMap.put(Range.closed(11, 20), "World");
        rangeMap.put(Range.closed(21, 30), "Guava");
        
        // Print values from TreeRangeMap for different keys
        System.out.println("RangeMap Value for 15: " + rangeMap.get(15));
        System.out.println("RangeMap Value for 25: " + rangeMap.get(25));
        
        // Perform operations on HashMap
        hashMap.put(6, "New Value");
        String removedValue = hashMap.remove(2);
        System.out.println("Removed from HashMap: " + removedValue);
        
        // More operations on TreeRangeMap
        rangeMap.put(Range.open(30, 40), "Open Range");
        
        // Print values from TreeRangeMap for different keys
        System.out.println("RangeMap Value for 35: " + rangeMap.get(35));
        
        /* write */ rangeMap.put(Range.closed(1, 10), "Hello");
        
        // Perform additional operations on HashMap
        hashMap.put(7, "Another Value");
        
        // Print all values from HashMap
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("HashMap Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Final read operation from TreeRangeMap
        /* read */ String value = rangeMap.get(5);
        
        System.out.println("Final RangeMap Value for 5: " + value);
    }
}