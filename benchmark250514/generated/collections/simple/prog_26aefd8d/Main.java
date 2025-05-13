import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Create a PassiveExpiringMap with expiration time of 5 seconds for each entry
        PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<String, String> expirationPolicy = 
            new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<>(5, TimeUnit.SECONDS);
        PassiveExpiringMap<String, String> map = new PassiveExpiringMap<>(expirationPolicy);

        // Write a key-value pair to the map
        /* write */ map.put("key", "value");

        // Read the value back from the map using the key
        /* read */ String value = map.get("key");

        // Print the value
        System.out.println(value);
    }
}