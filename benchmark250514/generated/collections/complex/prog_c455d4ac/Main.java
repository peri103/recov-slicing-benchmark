import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the PassiveExpiringMap with a timeout of 5 seconds
        PassiveExpiringMap<String, String> map = new PassiveExpiringMap<>(5, TimeUnit.SECONDS);
        
        /* write */ map.put("key", "value");
        
        // Introduce additional complexity with another map
        Map<String, Integer> additionalMap = new HashMap<>();
        additionalMap.put("one", 1);
        additionalMap.put("two", 2);
        additionalMap.put("three", 3);
        
        // Iterate over the additional map
        for (Map.Entry<String, Integer> entry : additionalMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Perform some calculations
        int sum = 0;
        for (int value : additionalMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in additionalMap: " + sum);
        
        // Sleep for a short duration to ensure the read happens before expiration
        try {
            Thread.sleep(1000); // 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        /* read */ String value = map.get("key");
        System.out.println(value);
        
        // More operations on the additional map
        additionalMap.put("four", 4);
        System.out.println("Updated additionalMap size: " + additionalMap.size());
        
        // Another calculation
        int product = 1;
        for (int val : additionalMap.values()) {
            product *= val;
        }
        System.out.println("Product of values in additionalMap: " + product);
    }
}