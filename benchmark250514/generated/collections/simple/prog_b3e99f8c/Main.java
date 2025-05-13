import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Initialize the PassiveExpiringMap with an expiration time of 5 seconds
        PassiveExpiringMap<String, Integer> map = new PassiveExpiringMap<>(5, TimeUnit.SECONDS);

        // Use the write method to put a value into the map
        /* write */ map.put("key", 42);

        // Use the read method to get the value from the map
        /* read */ Integer value = map.get("key");

        // Print the value retrieved
        System.out.println(value);
    }
}