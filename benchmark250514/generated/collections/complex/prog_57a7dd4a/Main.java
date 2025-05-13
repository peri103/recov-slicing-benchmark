import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a PassiveExpiringMap with a default expiration time of 5 seconds
        PassiveExpiringMap<String, Integer> map = new PassiveExpiringMap<>(5, TimeUnit.SECONDS);

        // Create a regular HashMap for additional operations
        Map<String, String> regularMap = new HashMap<>();
        regularMap.put("A", "Apple");
        regularMap.put("B", "Banana");

        /* write */ map.put("key", 42);

        // Perform operations on regularMap
        for (String key : regularMap.keySet()) {
            System.out.println("RegularMap key: " + key + ", value: " + regularMap.get(key));
        }

        // Add more entries to the PassiveExpiringMap
        map.put("anotherKey", 100);
        map.put("thirdKey", 200);

        // Use a loop to simulate some processing
        for (int i = 0; i < 3; i++) {
            System.out.println("Processing index: " + i);
        }

        /* read */ Integer value = map.get("key");
        System.out.println("Value from PassiveExpiringMap: " + value);

        // Check the values of the other keys in PassiveExpiringMap
        Integer anotherValue = map.get("anotherKey");
        Integer thirdValue = map.get("thirdKey");
        System.out.println("Another value: " + anotherValue);
        System.out.println("Third value: " + thirdValue);
    }
}