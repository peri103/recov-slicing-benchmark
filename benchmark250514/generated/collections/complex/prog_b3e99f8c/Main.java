import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the PassiveExpiringMap with an expiration time of 5 seconds
        PassiveExpiringMap<String, Integer> map = new PassiveExpiringMap<>(5, TimeUnit.SECONDS);

        // Use the write method to put a value into the map
        /* write */ map.put("key", 42);

        // Create a HashMap for additional operations
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");
        hashMap.put("C", "Cherry");

        // Iterate over the HashMap and print its contents
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Use the read method to get the value from the map
        /* read */ Integer value = map.get("key");

        // Print the value retrieved
        System.out.println("Value from PassiveExpiringMap: " + value);

        // Perform additional operations on the map
        map.put("anotherKey", 100);
        map.put("yetAnotherKey", 200);

        // Retrieve and print values from the map
        Integer anotherValue = map.get("anotherKey");
        Integer yetAnotherValue = map.get("yetAnotherKey");
        System.out.println("Another value: " + anotherValue);
        System.out.println("Yet another value: " + yetAnotherValue);
    }
}