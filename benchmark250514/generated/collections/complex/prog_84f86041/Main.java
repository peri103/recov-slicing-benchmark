import org.apache.commons.collections4.map.LRUMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        LRUMap<String, Integer> lruMap = new LRUMap<>(10);
        HashMap<String, String> hashMap = new HashMap<>();
        
        // Add some initial elements to the hashMap
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");
        
        // Use a loop to add more elements to hashMap
        for (int i = 0; i < 5; i++) {
            hashMap.put("Key" + i, "Value" + i);
        }
        
        // Print all elements in hashMap
        for (String key : hashMap.keySet()) {
            System.out.println("HashMap: " + key + " -> " + hashMap.get(key));
        }
        
        /* write */ lruMap.put("key", 42);
        
        // Add more elements to lruMap
        for (int i = 1; i <= 3; i++) {
            lruMap.put("key" + i, i * 10);
        }

        // Perform some computations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares: " + sum);
        
        // Print all elements in lruMap
        for (String key : lruMap.keySet()) {
            System.out.println("LRUMap: " + key + " -> " + lruMap.get(key));
        }

        /* read */ int value = lruMap.get("key");
        System.out.println("Read value: " + value);

        // Perform some additional operations
        int product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
        }
        System.out.println("Product of first three numbers: " + product);
    }
}