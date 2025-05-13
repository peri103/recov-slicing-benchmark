import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a PassiveExpiringMap with a default expiration period of 5 seconds
        PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<String, String> expirationPolicy = 
            new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<>(5, TimeUnit.SECONDS);
        PassiveExpiringMap<String, String> map = new PassiveExpiringMap<>(expirationPolicy);

        // Create another PassiveExpiringMap for unrelated operations
        PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<Integer, String> unrelatedExpirationPolicy = 
            new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<>(10, TimeUnit.SECONDS);
        PassiveExpiringMap<Integer, String> unrelatedMap = new PassiveExpiringMap<>(unrelatedExpirationPolicy);

        // Perform unrelated operations
        unrelatedMap.put(1, "UnrelatedValue1");
        unrelatedMap.put(2, "UnrelatedValue2");
        String unrelatedValue = unrelatedMap.get(1);
        System.out.println("Unrelated value: " + unrelatedValue);

        // Write a value to the original map
        /* write */ map.put("key", "value");

        // Perform some unrelated computations
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 10);
        hashMap.put("B", 20);
        hashMap.put("C", 30);

        int sum = 0;
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of values in HashMap: " + sum);

        // Perform unrelated operations on the unrelated map
        unrelatedMap.put(3, "UnrelatedValue3");
        unrelatedMap.put(4, "UnrelatedValue4");
        String unrelatedValue2 = unrelatedMap.get(3);
        System.out.println("Another unrelated value: " + unrelatedValue2);

        // Read the value from the original map
        /* read */ String value = map.get("key");

        // Print the value
        System.out.println(value);

        // Perform more unrelated computations
        HashMap<Integer, String> reverseMap = new HashMap<>();
        for (int i = 1; i <= 4; i++) {
            reverseMap.put(i, unrelatedMap.get(i));
        }

        for (Map.Entry<Integer, String> entry : reverseMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}