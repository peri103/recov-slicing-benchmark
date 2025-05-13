import org.apache.commons.collections4.map.LRUMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LRUMap<String, Integer> lruMap = new LRUMap<>();
        Map<String, String> hashMap = new HashMap<>();
        
        // Initialize the hashMap with some values
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");
        hashMap.put("C", "Cherry");

        // Perform some operations on hashMap
        if (hashMap.containsKey("A")) {
            System.out.println("HashMap contains key 'A' with value: " + hashMap.get("A"));
        }

        // Insert more values into hashMap
        hashMap.put("D", "Date");
        hashMap.put("E", "Elderberry");

        // Iterate and print all values in hashMap
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        /* write */ lruMap.put("key", 100);

        // Perform unrelated computation
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // More operations on hashMap
        hashMap.remove("B");

        // Check the size of hashMap
        System.out.println("Size of hashMap: " + hashMap.size());

        /* read */ Integer value = lruMap.get("key");

        System.out.println("Value from LRUMap: " + value);

        // Additional logic
        if (value != null && value > 50) {
            System.out.println("The value is greater than 50.");
        } else {
            System.out.println("The value is 50 or less.");
        }
    }
}