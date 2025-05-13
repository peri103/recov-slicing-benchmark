import org.apache.commons.collections4.map.AbstractDualBidiMap;
import org.apache.commons.collections4.map.DualHashBidiMap;
import org.apache.commons.collections4.BidiMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the map using a concrete implementation
        AbstractDualBidiMap<String, Integer> map = new DualHashBidiMap<>();

        // Additional unrelated code to make the program more complex
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("keyA", "valueA");
        hashMap.put("keyB", "valueB");

        BidiMap<Integer, String> bidiMap = new DualHashBidiMap<>();
        bidiMap.put(1, "One");
        bidiMap.put(2, "Two");
        bidiMap.put(3, "Three");

        for (Integer key : bidiMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + bidiMap.get(key));
        }

        // Write a value into the map
        /* write */ map.put("key1", 123);

        // Perform unrelated operations
        for (String key : hashMap.keySet()) {
            System.out.println("HashMap Key: " + key + ", Value: " + hashMap.get(key));
        }

        int sum = 0;
        for (Integer key : bidiMap.keySet()) {
            sum += key;
        }
        System.out.println("Sum of keys in bidiMap: " + sum);

        // Read the value from the map
        /* read */ Integer value = map.get("key1");

        // Output the value
        System.out.println(value);

        // Add more complexity
        bidiMap.put(4, "Four");
        bidiMap.put(5, "Five");

        for (Integer key : bidiMap.keySet()) {
            System.out.println("Updated BidiMap Key: " + key + ", Value: " + bidiMap.get(key));
        }
    }
}