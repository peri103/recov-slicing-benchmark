import org.apache.commons.collections4.multimap.AbstractMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.map.MultiValueMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the MultiValuedMap
        MultiValuedMap<String, Integer> map = new ArrayListValuedHashMap<>();

        // Use the write method to put a value into the map
        /* write */ map.put("key", 100);

        // Initialize a MultiMap from Apache Commons Collections
        MultiMap<String, String> multiMap = new MultiValueMap<>();
        multiMap.put("fruit", "apple");
        multiMap.put("fruit", "banana");
        multiMap.put("vegetable", "carrot");

        // Initialize a standard HashMap
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "Alice");
        hashMap.put("city", "Wonderland");

        // Process the MultiMap
        for (String key : multiMap.keySet()) {
            System.out.println("Key: " + key + ", Values: " + multiMap.get(key));
        }

        // Process the HashMap
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("HashMap Entry: " + entry.getKey() + " = " + entry.getValue());
        }

        // Additional logic using the MultiValuedMap
        map.put("key", 200);
        map.put("anotherKey", 300);

        // Process the MultiValuedMap before reading
        for (String key : map.keySet()) {
            System.out.println("MultiValuedMap Key: " + key + ", Values: " + map.get(key));
        }

        // Use the read method to get the value from the map
        /* read */ Integer value = map.get("key").iterator().next();

        // Print the value to ensure it was correctly read
        System.out.println("Read value: " + value);

        // Additional operations to make the program more complex
        int sum = 0;
        for (Integer val : map.get("key")) {
            sum += val;
        }
        System.out.println("Sum of values for 'key': " + sum);
    }
}