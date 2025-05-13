import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, String> map = new ArrayListValuedHashMap<>();
        UnmodifiableMultiValuedMap<String, String> unmodifiableMap = new UnmodifiableMultiValuedMap<>(map);

        /* write */ map.put("key", "value");

        // Additional code to make the program more complex
        Map<String, Integer> simpleMap = new HashMap<>();
        simpleMap.put("A", 1);
        simpleMap.put("B", 2);
        simpleMap.put("C", 3);

        int sum = 0;
        for (String key : simpleMap.keySet()) {
            sum += simpleMap.get(key);
        }
        System.out.println("Sum of values in simpleMap: " + sum);

        Set<String> keys = unmodifiableMap.keySet();
        for (String key : keys) {
            System.out.println("UnmodifiableMap key: " + key);
        }

        // Some more operations unrelated to the original write-read pair
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers 1 to 5: " + product);

        /* read */ String value = unmodifiableMap.get("key").iterator().next();
        System.out.println(value);

        // Additional complex operation
        Map<String, String> anotherMap = new HashMap<>();
        anotherMap.put("X", "10");
        anotherMap.put("Y", "20");

        for (Map.Entry<String, String> entry : anotherMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}