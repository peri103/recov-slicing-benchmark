import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Create a PassiveExpiringMap with a default expiration time of 5 seconds
        PassiveExpiringMap<String, String> map = new PassiveExpiringMap<>(TimeUnit.SECONDS.toMillis(5));

        // Write a value into the map
        /* write */ map.put("key", "value");

        // Read the value from the map
        /* read */ String value = map.get("key");

        // Print the value to ensure it was read correctly
        System.out.println(value);
    }
}