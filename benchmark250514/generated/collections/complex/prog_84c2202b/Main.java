import org.apache.commons.collections4.map.MultiKeyMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiKeyMap<String, String> multiKeyMap = new MultiKeyMap<>();
        
        // Initialize keys and value
        String key1 = "key1";
        String key2 = "key2";
        String valueToWrite = "value";
        
        // Additional data structure and operations
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("first", 100);
        hashMap.put("second", 200);
        
        // Iterate over the hashMap and perform some operations
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        /* write */ multiKeyMap.put(key1, key2, valueToWrite);

        // Perform additional operations
        int sum = 0;
        for (int value : hashMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in hashMap: " + sum);

        // Another MultiKeyMap operation
        multiKeyMap.put("anotherKey1", "anotherKey2", "anotherValue");
        String anotherValueRead = multiKeyMap.get("anotherKey1", "anotherKey2");
        System.out.println("Another value read: " + anotherValueRead);

        /* read */ String valueRead = multiKeyMap.get(key1, key2);

        System.out.println("Value read from MultiKeyMap: " + valueRead);
    }
}