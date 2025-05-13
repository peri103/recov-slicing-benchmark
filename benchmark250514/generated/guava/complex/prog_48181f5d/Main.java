import com.google.common.collect.HashBiMap;
import com.google.common.collect.BiMap;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashBiMap<String, Integer> map = HashBiMap.create();
        BiMap<Integer, String> inverseMap = map.inverse();
        List<String> keys = new ArrayList<>();
        List<Integer> values = new ArrayList<>();

        // Add some initial values to the map
        map.put("initKey1", 100);
        map.put("initKey2", 200);
        
        // Add keys and values to the lists
        keys.add("key1");
        keys.add("key2");
        values.add(10);
        values.add(20);

        // Add elements to the map using lists
        for (int i = 0; i < keys.size(); i++) {
            map.put(keys.get(i), values.get(i));
        }

        // Perform some operations on the inverse map
        if (inverseMap.containsKey(10)) {
            System.out.println("Inverse map contains key 10: " + inverseMap.get(10));
        }

        // Add a new key-value pair to the map
        /* write */ map.put("key", 42);

        // Simulate some complex logic before reading the value
        int sum = 0;
        for (int value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of all values in the map: " + sum);

        // Read the value associated with the key
        /* read */ Integer value = map.get("key");
        System.out.println(value);

        // Further operations on the map
        map.put("finalKey", 300);
        System.out.println("Final map size: " + map.size());
    }
}