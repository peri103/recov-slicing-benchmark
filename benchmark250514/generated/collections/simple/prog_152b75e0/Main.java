import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Initialize the PassiveExpiringMap with a 10-second expiry time
        PassiveExpiringMap<String, Integer> map = new PassiveExpiringMap<>(TimeUnit.SECONDS.toMillis(10));

        // Write a value to the map
        /* write */ map.put("key", 42);

        // Read the value from the map
        /* read */ Integer value = map.get("key");

        // Print the value to ensure it's correctly read
        System.out.println(value);
    }
}