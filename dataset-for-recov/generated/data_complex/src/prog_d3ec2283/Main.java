import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();
        ConcurrentHashMap<String, String> hashMap = new ConcurrentHashMap<>();
        
        ArrayList<String> keys = new ArrayList<>();
        keys.add("key1");
        keys.add("key2");
        keys.add("key3");
        
        // Adding elements to hashMap
        for (String key : keys) {
            hashMap.put(key, "value_" + key);
        }
        
        // Operations on hashMap
        for (String key : keys) {
            System.out.println("HashMap value for " + key + ": " + hashMap.get(key));
        }
        
        // Write operation on ConcurrentSkipListMap
        /* write */ map.put("key", 42);
        
        // Additional operations
        map.put("anotherKey", 100);
        map.put("yetAnotherKey", 200);
        
        // Iterating over ConcurrentSkipListMap
        for (String key : map.keySet()) {
            System.out.println("ConcurrentSkipListMap value for " + key + ": " + map.get(key));
        }
        
        // Read operation on ConcurrentSkipListMap
        /* read */ Integer value = map.get("key");
        
        // Output the value read from ConcurrentSkipListMap
        System.out.println("Value for 'key': " + value);
        
        // Further manipulation
        map.put("newKey", 300);
        map.put("oldKey", 400);
        
        for (String key : map.keySet()) {
            System.out.println("Updated ConcurrentSkipListMap value for " + key + ": " + map.get(key));
        }
    }
}