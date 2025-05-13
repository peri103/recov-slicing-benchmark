import com.google.common.collect.HashBiMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a HashBiMap for the main task
        HashBiMap<String, Integer> biMap = HashBiMap.create();

        // Initialize a HashMap for additional complexity
        HashMap<String, String> hashMap = new HashMap<>();

        // Populate the HashMap with some data
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");
        hashMap.put("C", "Cherry");

        // Perform some operations on the HashMap
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }

        // More operations on the HashMap
        String removedValue = hashMap.remove("B");
        System.out.println("Removed value: " + removedValue);

        // Add more entries to HashBiMap
        biMap.put("key2", 200);
        biMap.put("key3", 300);

        // Perform some unrelated operations
        int sum = 0;
        for (int num : biMap.values()) {
            sum += num;
        }
        System.out.println("Sum of values in biMap: " + sum);

        // Write operation on the HashBiMap
        /* write */ biMap.put("key1", 100);

        // Perform some unrelated logic
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);

        // Read operation on the HashBiMap
        /* read */ Integer value = biMap.get("key1");
        System.out.println("Value for 'key1': " + value);

        // Additional operations for complexity
        for (String key : biMap.keySet()) {
            System.out.println("BiMap Key: " + key + ", Value: " + biMap.get(key));
        }
    }
}