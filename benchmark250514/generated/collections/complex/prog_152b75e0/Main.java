import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Initialize the PassiveExpiringMap with a 10-second expiry time
        PassiveExpiringMap<String, Integer> map = new PassiveExpiringMap<>(TimeUnit.SECONDS.toMillis(10));

        // Create a regular HashMap for additional operations
        Map<String, String> regularMap = new HashMap<>();
        regularMap.put("Name", "Alice");
        regularMap.put("City", "Wonderland");

        // Perform some operations on the regular map
        for (Map.Entry<String, String> entry : regularMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Write a value to the PassiveExpiringMap
        /* write */ map.put("key", 42);

        // Perform additional operations on the PassiveExpiringMap
        map.put("anotherKey", 100);
        Integer anotherValue = map.get("anotherKey");
        System.out.println("Another value: " + anotherValue);

        // Some unrelated logic to make the program more complex
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 integers: " + sum);

        // Read the value from the PassiveExpiringMap
        /* read */ Integer value = map.get("key");

        // Print the value to ensure it's correctly read
        System.out.println("Value from map: " + value);

        // More operations on the regular map
        regularMap.put("Country", "Fantasy");
        System.out.println("Updated map:");
        for (Map.Entry<String, String> entry : regularMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}