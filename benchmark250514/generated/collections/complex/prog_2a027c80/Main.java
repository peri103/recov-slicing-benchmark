import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        // Initialize a PassiveExpiringMap with a default expiration time of 1 minute
        PassiveExpiringMap<String, String> map = new PassiveExpiringMap<>(TimeUnit.MINUTES.toMillis(1));

        // Initialize another PassiveExpiringMap with a different expiration time
        PassiveExpiringMap<Integer, String> anotherMap = new PassiveExpiringMap<>(TimeUnit.SECONDS.toMillis(30));

        /* write */
        map.put("key", "value");

        // Populate anotherMap with some data
        for (int i = 0; i < 5; i++) {
            anotherMap.put(i, "Value" + i);
        }

        // Perform some operations on anotherMap
        for (int i = 0; i < 5; i++) {
            String tempValue = anotherMap.get(i);
            System.out.println("AnotherMap key " + i + " has value: " + tempValue);
        }

        // Create a regular HashMap and populate it
        Map<String, Integer> regularMap = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            regularMap.put("Key" + i, i * 100);
        }

        // Perform operations on regularMap
        for (Map.Entry<String, Integer> entry : regularMap.entrySet()) {
            System.out.println("RegularMap " + entry.getKey() + " has value: " + entry.getValue());
        }

        // Perform a dummy operation to simulate complexity
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of 0 to 9 is: " + sum);

        /* read */
        String value = map.get("key");

        System.out.println("Original map's key has value: " + value);
    }
}