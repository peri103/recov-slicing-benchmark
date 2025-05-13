import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a PassiveExpiringMap with a default expiration time of 5 seconds
        PassiveExpiringMap<String, String> map = new PassiveExpiringMap<>(TimeUnit.SECONDS.toMillis(5));

        // Write a value into the map
        /* write */ map.put("key", "value");

        // Create a HashMap to demonstrate additional complexity
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 1);
        hashMap.put("banana", 2);
        hashMap.put("cherry", 3);

        // Iterate over the HashMap and print its contents
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Read the value from the PassiveExpiringMap
        /* read */ String value = map.get("key");

        // Print the value to ensure it was read correctly
        System.out.println("Value from PassiveExpiringMap: " + value);

        // More operations with the HashMap
        hashMap.put("date", 4);
        int totalFruits = 0;
        for (Integer count : hashMap.values()) {
            totalFruits += count;
        }
        System.out.println("Total number of fruits: " + totalFruits);
    }
}