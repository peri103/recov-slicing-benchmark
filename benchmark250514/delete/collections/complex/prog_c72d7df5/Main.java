import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating a modifiable map
        Map<String, Integer> modifiableMap = new HashMap<>();
        
        // Wrapping the modifiable map with UnmodifiableMap
        UnmodifiableMap<String, Integer> map = new UnmodifiableMap<>(modifiableMap);
        
        // Adding an entry to the modifiable map before wrapping it
        modifiableMap.put("key", 42);
        
        // Attempting to write using the UnmodifiableMap will throw an UnsupportedOperationException
        // Hence, we add to the original modifiable map
        /* write */ modifiableMap.put("key", 42);
        
        // Complex operations with other collections
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }
        
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Sum of list elements: " + sum);
        
        // Performing some operations with the map
        modifiableMap.put("anotherKey", 100);
        modifiableMap.put("thirdKey", 200);
        
        int mapSum = 0;
        for (String key : modifiableMap.keySet()) {
            mapSum += modifiableMap.get(key);
        }
        System.out.println("Sum of map values: " + mapSum);
        
        // Reading the value using UnmodifiableMap
        /* read */ Integer value = map.get("key");
        
        // Output the read value
        System.out.println("Value from map: " + value);
        
        // Further operations on the ArrayList
        list.add(value);
        list.add(mapSum);
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }
    }
}