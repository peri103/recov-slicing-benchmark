import org.apache.commons.collections4.map.MultiValueMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiValueMap<String, Integer> multiValueMap = new MultiValueMap<>();
        Map<String, String> simpleMap = new HashMap<>();
        
        // Adding values to simpleMap
        simpleMap.put("name", "Alice");
        simpleMap.put("city", "Wonderland");
        
        // Performing some operations on simpleMap
        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Adding more complex logic with simpleMap
        simpleMap.put("country", "Fantasy Land");
        if (simpleMap.containsKey("city")) {
            System.out.println("City is present in the map.");
        }
        
        // Writing to multiValueMap
        /* write */ multiValueMap.put("key", 42);
        
        // Adding more entries to multiValueMap
        multiValueMap.put("key", 43);
        multiValueMap.put("anotherKey", 100);
        
        // Performing operations on multiValueMap
        for (String key : multiValueMap.keySet()) {
            System.out.println(key + " values: " + multiValueMap.get(key));
        }
        
        // Reading from multiValueMap
        /* read */ Integer value = (Integer) multiValueMap.get("key").iterator().next();
        System.out.println("Read value: " + value);
        
        // Additional operations after read
        multiValueMap.put("key", 44);
        multiValueMap.put("anotherKey", 101);
        
        for (String key : multiValueMap.keySet()) {
            System.out.println(key + " updated values: " + multiValueMap.get(key));
        }
    }
}