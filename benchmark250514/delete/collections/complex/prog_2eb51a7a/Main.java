import org.apache.commons.collections4.map.AbstractDualBidiMap;
import org.apache.commons.collections4.map.DualHashBidiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the map using a concrete implementation of AbstractDualBidiMap
        AbstractDualBidiMap<String, Integer> map = new DualHashBidiMap<>();
        
        // Additional unrelated map using HashMap
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");

        // Perform operations on hashMap
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        /* write */ map.put("key1", 100);
        
        // Unrelated computation
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Additional unrelated map using HashMap
        Map<Integer, String> anotherMap = new HashMap<>();
        anotherMap.put(1, "One");
        anotherMap.put(2, "Two");

        // Perform operations on anotherMap
        for (Map.Entry<Integer, String> entry : anotherMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        /* read */ Integer value = map.get("key1");
        System.out.println(value);

        // Further operations on map
        map.put("key2", 200);
        map.put("key3", 300);

        // Print all key-value pairs in the map
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}