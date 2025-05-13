import com.google.common.collect.HashBiMap;
import com.google.common.collect.BiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        BiMap<String, Integer> biMap = HashBiMap.create();
        Map<String, String> map = new HashMap<>();
        
        // Add some unrelated operations
        map.put("A", "Apple");
        map.put("B", "Banana");
        map.put("C", "Cherry");
        
        // Some operations on the map
        System.out.println("Map size: " + map.size());
        System.out.println("Contains key 'B'? " + map.containsKey("B"));
        
        // Adding more complexity with loops and conditions
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
            if (value.startsWith("A")) {
                System.out.println("Value starts with A: " + value);
            }
        }
        
        /* write */ biMap.put("key1", 100);
        
        // More operations on BiMap
        biMap.put("key2", 200);
        biMap.put("key3", 300);
        
        // Reverse lookup using BiMap
        String reverseKey = biMap.inverse().get(300);
        System.out.println("Reverse lookup for value 300: " + reverseKey);
        
        // Conditions and loops involving BiMap
        for (String key : biMap.keySet()) {
            Integer value = biMap.get(key);
            System.out.println("BiMap Key: " + key + ", Value: " + value);
            if (value > 150) {
                System.out.println("Value greater than 150: " + value);
            }
        }
        
        /* read */ int value = biMap.get("key1");
        System.out.println(value);
        
        // Additional complexity with calculations
        int total = 0;
        for (Integer val : biMap.values()) {
            total += val;
        }
        System.out.println("Total of BiMap values: " + total);
    }
}