import org.apache.commons.collections4.map.MultiKeyMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiKeyMap<String, Integer> multiKeyMap = new MultiKeyMap<>();
        Map<String, Integer> hashMap = new HashMap<>();
        
        // Adding some entries to the HashMap
        hashMap.put("A", 10);
        hashMap.put("B", 20);
        
        // Performing some operations on the HashMap
        int sum = 0;
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of HashMap values: " + sum);
        
        /* write */ multiKeyMap.put("key1", "key2", 42);
        
        // Additional operations on MultiKeyMap
        multiKeyMap.put("key3", "key4", 100);
        multiKeyMap.put("key5", "key6", 200);
        
        // Performing operations on MultiKeyMap
        int multiSum = 0;
        for (String key1 : new String[] {"key1", "key3", "key5"}) {
            for (String key2 : new String[] {"key2", "key4", "key6"}) {
                Integer value = multiKeyMap.get(key1, key2);
                if (value != null) {
                    multiSum += value;
                }
            }
        }
        System.out.println("Sum of MultiKeyMap values: " + multiSum);
        
        /* read */ Integer value = multiKeyMap.get("key1", "key2");
        System.out.println("Value from MultiKeyMap: " + value);
        
        // Additional unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}