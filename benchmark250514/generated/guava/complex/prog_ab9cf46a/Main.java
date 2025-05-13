import com.google.common.collect.HashBiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashBiMap<String, Integer> biMap = HashBiMap.create();
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        // Initialize some data in the HashMap
        hashMap.put("A", 10);
        hashMap.put("B", 20);
        hashMap.put("C", 30);

        // Transfer data from hashMap to biMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            biMap.put(entry.getKey(), entry.getValue());
        }

        // Add additional data to biMap
        /* write */ biMap.put("key", 42);

        // Perform some operations on hashMap
        int sum = 0;
        for (Integer value : hashMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in hashMap: " + sum);

        // Use another HashBiMap to demonstrate more complexity
        HashBiMap<Integer, String> reverseMap = HashBiMap.create();
        reverseMap.put(1, "One");
        reverseMap.put(2, "Two");
        reverseMap.put(3, "Three");

        // Access and print values from reverseMap
        for (int i = 1; i <= 3; i++) {
            System.out.println("ReverseMap value for " + i + ": " + reverseMap.get(i));
        }

        // Retrieve and print the value from biMap
        /* read */ int value = biMap.get("key");
        System.out.println("Retrieved value from biMap: " + value);

        // Additional operations on reverseMap
        reverseMap.inverse().put("Four", 4);
        System.out.println("ReverseMap size after adding 'Four': " + reverseMap.size());
    }
}