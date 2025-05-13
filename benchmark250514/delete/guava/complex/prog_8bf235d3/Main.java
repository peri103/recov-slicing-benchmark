import com.google.common.collect.HashBiMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Initialize HashBiMap
        HashBiMap<String, Integer> map = HashBiMap.create();
        
        // Initialize a HashSet to store keys
        Set<String> keys = new HashSet<>();
        
        // Add some key-value pairs to the map
        map.put("key2", 200);
        map.put("key3", 300);
        
        // Add keys to the set
        keys.add("key2");
        keys.add("key3");
        
        // Perform some operations using the keys
        for (String key : keys) {
            System.out.println("Value for " + key + ": " + map.get(key));
        }
        
        // Perform a complex operation: swap keys and values
        HashBiMap<Integer, String> inverseMap = map.inverse();
        for (Map.Entry<Integer, String> entry : inverseMap.entrySet()) {
            System.out.println("Inverse entry: " + entry.getKey() + " -> " + entry.getValue());
        }
        
        // Add a new key-value pair that will be read later
        /* write */ map.put("key1", 100);
        
        // Perform more operations on the map
        map.put("key4", 400);
        map.put("key5", 500);
        
        // Iterate over the map entries
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Entry: " + entry.getKey() + " -> " + entry.getValue());
        }
        
        // Read the value of "key1"
        /* read */ Integer value = map.get("key1");
        
        // Print the read value
        System.out.println("Read value for key1: " + value);
        
        // Perform additional operations on the map
        map.remove("key2");
        map.put("key6", 600);
        
        // Print the final state of the map
        System.out.println("Final map: " + map);
    }
}