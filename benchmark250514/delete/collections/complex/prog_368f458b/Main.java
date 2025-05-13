import org.apache.commons.collections4.map.AbstractDualBidiMap;
import org.apache.commons.collections4.map.DualHashBidiMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        AbstractDualBidiMap<String, Integer> bidiMap = new DualHashBidiMap<>();
        
        // Additional map for complexity
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");
        
        // Complex logic with hashMap
        for (String key : hashMap.keySet()) {
            String value = hashMap.get(key);
            System.out.println("HashMap Key: " + key + ", Value: " + value);
        }
        
        /* write */ bidiMap.put("key1", 100);
        
        // Additional operations on bidiMap
        bidiMap.put("key2", 200);
        bidiMap.put("key3", 300);
        
        // More operations for complexity
        Integer sum = 0;
        for (String key : bidiMap.keySet()) {
            sum += bidiMap.get(key);
        }
        System.out.println("Sum of values in bidiMap: " + sum);
        
        /* read */ Integer value = bidiMap.get("key1");
        
        System.out.println(value);
        
        // Further operations to increase complexity
        for (String key : bidiMap.keySet()) {
            Integer val = bidiMap.get(key);
            System.out.println("BidiMap Key: " + key + ", Value: " + val);
        }
        
        // Logic to manipulate values
        bidiMap.put("key4", sum);
        Integer newSum = bidiMap.get("key4");
        System.out.println("New sum stored in bidiMap: " + newSum);
    }
}