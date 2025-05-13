import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Create a PassiveExpiringMap with expiration time set to 1 minute
        PassiveExpiringMap<String, String> map = new PassiveExpiringMap<>(TimeUnit.MINUTES.toMillis(1));
        
        /* write */ map.put("key", "value");
        
        /* read */ String value = map.get("key");
        
        System.out.println(value);
    }
}