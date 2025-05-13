import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Initialize the PassiveExpiringMap with a 1-minute expiration time for entries
        PassiveExpiringMap<String, Integer> map = new PassiveExpiringMap<>(TimeUnit.MINUTES.toMillis(1));

        /* write */ map.put("key", 42);
        
        /* read */ Integer value = map.get("key");
        
        System.out.println(value);
    }
}