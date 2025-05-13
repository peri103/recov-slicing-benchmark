import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Initialize the PassiveExpiringMap with a timeout of 5 seconds
        PassiveExpiringMap<String, String> map = new PassiveExpiringMap<>(5, TimeUnit.SECONDS);
        
        /* write */ map.put("key", "value");
        
        // Sleep for a short duration to ensure the read happens before expiration
        try {
            Thread.sleep(1000); // 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        /* read */ String value = map.get("key");
        System.out.println(value);
    }
}