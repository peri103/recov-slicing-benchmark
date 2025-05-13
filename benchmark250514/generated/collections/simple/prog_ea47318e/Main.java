import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Initialize the PassiveExpiringMap with a timeout of 1 hour
        PassiveExpiringMap<String, String> map = new PassiveExpiringMap<>(TimeUnit.HOURS.toMillis(1));
        
        // Write a value into the map
        /* write */ map.put("key", "value");
        
        // Read the value from the map
        /* read */ String value = map.get("key");
        
        // Print the read value
        System.out.println(value);
    }
}