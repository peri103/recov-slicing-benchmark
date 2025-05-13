import org.apache.commons.collections4.map.ReferenceMap;
import org.apache.commons.collections4.map.LRUMap;
import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a ReferenceMap with weak keys and strong values
        ReferenceMap<String, Integer> map = new ReferenceMap<>(ReferenceStrength.WEAK, ReferenceStrength.HARD);

        // Use the put method to write a value to the map
        /* write */ map.put("key", 42);

        // Create an LRUMap with a maximum size of 3
        LRUMap<String, String> lruMap = new LRUMap<>(3);
        lruMap.put("A", "Apple");
        lruMap.put("B", "Banana");
        lruMap.put("C", "Cherry");

        // Perform some unrelated operations using a HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            hashMap.put(i, "Value" + i);
        }

        // Print all values in the HashMap
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("HashMap Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Perform some operations on the LRUMap
        lruMap.put("D", "Date");
        System.out.println("LRUMap Keys after adding 'D': " + lruMap.keySet());

        // Use the get method to read the value from the ReferenceMap
        /* read */ Integer value = map.get("key");

        // Print the value to verify it was read correctly
        System.out.println("Read value from ReferenceMap: " + value);

        // Further operations on LRUMap
        lruMap.put("E", "Elderberry");
        System.out.println("LRUMap Keys after adding 'E': " + lruMap.keySet());

        // Final operations on HashMap
        hashMap.remove(2);
        System.out.println("HashMap Keys after removal: " + hashMap.keySet());
    }
}