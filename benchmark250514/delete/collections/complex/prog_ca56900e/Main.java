import org.apache.commons.collections4.multimap.TreeValuedHashMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        TreeValuedHashMap<String, String> map = new TreeValuedHashMap<>();
        HashMap<Integer, String> simpleMap = new HashMap<>();
        
        // Populate the simpleMap with some data
        for (int i = 0; i < 5; i++) {
            simpleMap.put(i, "Value" + i);
        }

        // Print the contents of simpleMap
        for (Map.Entry<Integer, String> entry : simpleMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Perform some operations on simpleMap
        if (simpleMap.containsKey(2)) {
            System.out.println("Key 2 exists with value: " + simpleMap.get(2));
        }

        // Add more elements to simpleMap
        simpleMap.put(5, "Value5");
        simpleMap.put(6, "Value6");

        // Print the updated simpleMap
        System.out.println("Updated simpleMap:");
        for (Map.Entry<Integer, String> entry : simpleMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Write to the TreeValuedHashMap
        /* write */ map.put("key", "value");

        // Perform some operations on TreeValuedHashMap
        map.put("anotherKey", "anotherValue");
        map.put("key", "newValue");

        // Check if a key exists
        if (map.containsKey("anotherKey")) {
            System.out.println("anotherKey exists in the map");
        }

        // Read from the TreeValuedHashMap
        /* read */ String value = map.get("key").iterator().next();
        System.out.println("Read value: " + value);

        // Perform operations after reading
        map.put("thirdKey", "thirdValue");
        System.out.println("Final map contents:");
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Values: " + map.get(key));
        }
    }
}