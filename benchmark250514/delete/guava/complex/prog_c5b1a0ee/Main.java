import com.google.common.collect.LinkedHashBiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedHashBiMap<String, Integer> map = LinkedHashBiMap.create();
        Map<String, String> additionalMap = new HashMap<>();
        
        additionalMap.put("a", "apple");
        additionalMap.put("b", "banana");
        
        /* write */ map.put("key1", 42);
        map.put("key2", 100);
        
        int sum = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sum += entry.getValue();
        }
        
        // More operations on additionalMap
        for (String key : additionalMap.keySet()) {
            System.out.println("Fruit: " + additionalMap.get(key));
        }
        
        // Some arithmetic operations
        int result = (sum * 2) - 50;
        System.out.println("Result of arithmetic operations: " + result);
        
        /* read */ int value = map.get("key1");
        System.out.println("Retrieved value: " + value);
        
        // Further operations using map
        map.put("key3", 300);
        int total = 0;
        for (Integer val : map.values()) {
            total += val;
        }
        System.out.println("Total sum of values in map: " + total);
    }
}