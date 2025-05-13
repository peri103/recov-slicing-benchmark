import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Create a PassiveExpiringMap with a default expiration time of 5 seconds
        PassiveExpiringMap<String, Integer> map = new PassiveExpiringMap<>(5, TimeUnit.SECONDS);

        /* write */ map.put("key", 42);

        /* read */ Integer value = map.get("key");
        System.out.println(value);
    }
}