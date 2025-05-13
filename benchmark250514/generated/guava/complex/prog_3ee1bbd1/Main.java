import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a builder for ImmutableMap
        ImmutableMap.Builder<String, String> builder = ImmutableMap.builder();
        
        // Create a HashMap and add some values
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        
        // Initialize a builder for another ImmutableMap
        ImmutableMap.Builder<String, Integer> intMapBuilder = ImmutableMap.builder();
        for (String key : hashMap.keySet()) {
            intMapBuilder.put(key, hashMap.get(key));
        }
        
        // Build the ImmutableMap from the builder
        ImmutableMap<String, Integer> intMap = intMapBuilder.build();
        
        // Create an ImmutableList from the keys of the map
        ImmutableList<String> keysList = ImmutableList.copyOf(intMap.keySet());
        
        // Perform some operations using the ImmutableList
        for (String key : keysList) {
            System.out.println("Key: " + key + ", Value: " + intMap.get(key));
        }
        
        // Add a key-value pair to the original builder
        /* write */ builder.put("key", "value");
        
        // Build the ImmutableMap from the builder
        ImmutableMap<String, String> map = builder.build();
        
        // Perform some operations with the map
        for (String key : map.keySet()) {
            System.out.println("Map Key: " + key);
        }
        
        // Read the value using the original read method
        /* read */ String value = map.get("key");
        System.out.println("Read value: " + value);
        
        // Perform some operations with the original map
        if (map.containsKey("key")) {
            System.out.println("The map contains the key 'key'.");
        }
    }
}