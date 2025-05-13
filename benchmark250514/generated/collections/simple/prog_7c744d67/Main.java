import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Create a PassiveExpiringMap with a default expiration time of 5 seconds
        PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<String, String> expirationPolicy =
                new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<>(5000);
        PassiveExpiringMap<String, String> map = new PassiveExpiringMap<>(expirationPolicy);

        // Write a key-value pair to the map
        /* write */ map.put("key", "value");

        // Read the value associated with the key from the map
        /* read */ String value = map.get("key");

        // Print the value
        System.out.println(value);
    }
}