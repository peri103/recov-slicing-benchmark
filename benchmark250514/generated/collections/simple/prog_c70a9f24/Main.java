import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Initialize the PassiveExpiringMap with a default expiration time
        PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<String, String> expirationPolicy =
                new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<>(5, TimeUnit.MINUTES);
        PassiveExpiringMap<String, String> map = new PassiveExpiringMap<>(expirationPolicy);

        // Write a value to the map
        /* write */ map.put("key", "value");

        // Read the value from the map
        /* read */ String value = map.get("key");

        // Print the value
        System.out.println(value);
    }
}