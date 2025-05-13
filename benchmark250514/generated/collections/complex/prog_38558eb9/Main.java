import org.apache.commons.collections4.map.MultiKeyMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiKeyMap<String, Integer> map = new MultiKeyMap<>();
        Map<String, String> simpleMap = new HashMap<>();

        // Using simpleMap to store some values
        simpleMap.put("A", "Apple");
        simpleMap.put("B", "Banana");

        // Performing some operations on simpleMap
        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Adding more complexity with a loop
        for (int i = 0; i < 3; i++) {
            map.put("key" + i, "subkey" + i, i * 10);
        }

        // Performing some operations on map
        Integer sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += map.get("key" + i, "subkey" + i);
        }
        System.out.println("Sum of values in map: " + sum);

        /* write */ map.put("key1", "key2", 42);

        // More operations with simpleMap
        simpleMap.put("C", "Cherry");
        System.out.println("Updated simpleMap: " + simpleMap);

        // More operations on map
        if (map.containsKey("key1", "key2")) {
            System.out.println("Map contains key1, key2");
        }

        /* read */ Integer value = map.get("key1", "key2");

        System.out.println("Value from original write-read pair: " + value);

        // Final operations to make the program more complex
        for (int i = 0; i < 3; i++) {
            map.put("finalKey" + i, "finalSubkey" + i, i * 100);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Final Map Value: " + map.get("finalKey" + i, "finalSubkey" + i));
        }
    }
}