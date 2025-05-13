import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.MultiValuedMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> map = new ArrayListValuedHashMap<>();
        Map<String, String> simpleMap = new HashMap<>();
        
        // Unrelated operations
        simpleMap.put("name", "Alice");
        simpleMap.put("city", "Wonderland");
        
        // Additional operations on simpleMap
        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Additional write-read pair on a different map
        MultiValuedMap<String, String> anotherMap = new ArrayListValuedHashMap<>();
        anotherMap.put("fruit", "apple");
        anotherMap.put("fruit", "banana");
        
        // Operations on anotherMap
        for (String fruit : anotherMap.get("fruit")) {
            System.out.println("Fruit: " + fruit);
        }
        
        // Original write operation
        /* write */ map.put("key1", 42);
        
        // More operations on map
        map.put("key2", 84);
        map.put("key3", 126);
        
        // Iterating through map
        for (String key : map.keySet()) {
            System.out.println("Key: " + key);
            for (Integer value : map.get(key)) {
                System.out.println("Value: " + value);
            }
        }
        
        // Original read operation
        /* read */ Integer value = map.get("key1").iterator().next();
        System.out.println("Read value: " + value);
        
        // Further operations
        map.put("key4", 168);
        map.put("key5", 210);
        
        // Display all values for key4
        for (Integer val : map.get("key4")) {
            System.out.println("Key4 value: " + val);
        }
    }
}