import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Multimap<String, Integer> multimap = LinkedHashMultimap.create();
        Map<String, Integer> map = new HashMap<>();
        
        map.put("anotherKey", 100);
        
        /* write */ multimap.put("key", 42);

        for (int i = 0; i < 5; i++) {
            map.put("key" + i, i * 10);
        }

        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }

        System.out.println("Sum of values in map: " + sum);

        // More operations on the map
        map.put("extraKey", 200);
        int extraValue = map.get("extraKey");
        System.out.println("Extra value: " + extraValue);

        // Accessing the value from the multimap
        /* read */ Integer value = multimap.get("key").iterator().next();
        
        System.out.println("Value from multimap: " + value);
        
        // Additional operations
        map.put("finalKey", 300);
        int finalValue = map.get("finalKey");
        System.out.println("Final value: " + finalValue);

        // Print all keys and values in the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}