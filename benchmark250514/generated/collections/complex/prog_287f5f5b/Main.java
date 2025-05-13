import org.apache.commons.collections4.multimap.AbstractMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the MultiValuedMap using ArrayListValuedHashMap which extends AbstractMultiValuedMap
        MultiValuedMap<String, Integer> map = new ArrayListValuedHashMap<>();
        
        // Initialize a regular HashMap for additional complexity
        Map<String, String> regularMap = new HashMap<>();
        
        // Write a value into the map
        /* write */ map.put("key", 42);
        
        // Add some values to the regular map
        regularMap.put("name", "Alice");
        regularMap.put("city", "Wonderland");
        
        // Perform some operations on the regular map
        if (regularMap.containsKey("name")) {
            System.out.println("Name found: " + regularMap.get("name"));
        }
        
        // Iterate over the regular map and print its contents
        for (Map.Entry<String, String> entry : regularMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Perform some operations on the MultiValuedMap
        map.put("key", 43);
        map.put("anotherKey", 100);
        
        // Iterate over the MultiValuedMap and print its contents
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
        
        // Read the value from the map
        /* read */ Integer value = map.get("key").iterator().next();
        
        // Print the value to ensure it was read correctly
        System.out.println("Read value: " + value);
        
        // Perform some more operations on the MultiValuedMap
        map.put("key", 44);
        map.put("anotherKey", 200);
        
        // Print the updated contents of the MultiValuedMap
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}