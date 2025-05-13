import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a PassiveExpiringMap with a default expiration time of 5 seconds
        PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<String, String> expirationPolicy =
                new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<>(5000);
        PassiveExpiringMap<String, String> map = new PassiveExpiringMap<>(expirationPolicy);
        
        // Write a key-value pair to the map
        /* write */ map.put("key", "value");

        // Create another map to store additional data
        Map<String, Integer> additionalData = new HashMap<>();
        additionalData.put("count", 10);
        additionalData.put("limit", 100);

        // Perform some operations on the additional data
        int count = additionalData.get("count");
        int limit = additionalData.get("limit");
        for (int i = 0; i < count; i++) {
            if (i == limit) {
                break;
            }
            System.out.println("Processing item: " + i);
        }

        // Check if the original map contains the key
        if (map.containsKey("key")) {
            // Read the value associated with the key from the map
            /* read */ String value = map.get("key");
            // Print the value
            System.out.println("Retrieved value: " + value);
        }

        // Add more key-value pairs to the map
        map.put("anotherKey", "anotherValue");
        map.put("yetAnotherKey", "yetAnotherValue");

        // Iterate over the map and print all key-value pairs
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Perform a final operation on the additional data
        additionalData.put("newCount", count * 2);
        System.out.println("New count: " + additionalData.get("newCount"));
    }
}