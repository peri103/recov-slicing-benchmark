import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the ArrayListValuedHashMap
        ArrayListValuedHashMap<String, Integer> map = new ArrayListValuedHashMap<>();
        
        // Initialize a HashSetValuedHashMap
        HashSetValuedHashMap<String, String> setMap = new HashSetValuedHashMap<>();
        
        // Initialize a regular HashMap
        Map<String, String> simpleMap = new HashMap<>();
        
        // Write a value into the map
        /* write */ map.put("key", 42);
        
        // Add some values to the setMap
        setMap.put("fruit", "apple");
        setMap.put("fruit", "banana");
        setMap.put("color", "red");
        
        // Add some values to the simpleMap
        simpleMap.put("name", "Alice");
        simpleMap.put("city", "Wonderland");
        
        // Perform some operations on setMap
        for (String fruit : setMap.get("fruit")) {
            System.out.println("Fruit: " + fruit);
        }
        
        // Perform some operations on simpleMap
        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Read the value from the map
        /* read */ Integer value = map.get("key").iterator().next();
        
        // Print the value
        System.out.println(value);
        
        // Further operations with setMap
        setMap.put("animal", "cat");
        setMap.put("animal", "dog");
        
        for (String animal : setMap.get("animal")) {
            System.out.println("Animal: " + animal);
        }
        
        // Further operations with simpleMap
        simpleMap.put("country", "Wonderland");
        
        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}