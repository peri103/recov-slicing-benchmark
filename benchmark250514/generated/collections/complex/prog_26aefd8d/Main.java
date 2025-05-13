import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a PassiveExpiringMap with expiration time of 5 seconds for each entry
        PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<String, String> expirationPolicy = 
            new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<>(5, TimeUnit.SECONDS);
        PassiveExpiringMap<String, String> map = new PassiveExpiringMap<>(expirationPolicy);

        // Create a HashMap for additional complexity
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        
        // Perform operations on HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Perform some calculations
        int sum = 0;
        for (Integer value : hashMap.values()) {
            sum += value;
        }
        System.out.println("Sum: " + sum);

        // Write a key-value pair to the PassiveExpiringMap
        /* write */ map.put("key", "value");

        // Perform more operations on HashMap
        hashMap.put("three", 3);
        hashMap.put("four", 4);

        // Calculate product of HashMap values
        int product = 1;
        for (Integer value : hashMap.values()) {
            product *= value;
        }
        System.out.println("Product: " + product);

        // Read the value back from the PassiveExpiringMap using the key
        /* read */ String value = map.get("key");

        // Print the value
        System.out.println(value);

        // Perform final operations on HashMap
        hashMap.put("five", 5);
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key);
        }
    }
}