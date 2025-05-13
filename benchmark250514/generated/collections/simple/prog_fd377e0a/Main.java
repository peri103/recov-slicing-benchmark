import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Initialize the map with a default expiration time of 10 seconds for each entry
        PassiveExpiringMap<String, String> map = new PassiveExpiringMap<>(TimeUnit.SECONDS.toMillis(10));
        
        /* write */ map.put("key", "value");
        
        /* read */ String value = map.get("key");
        
        System.out.println(value);
    }
}