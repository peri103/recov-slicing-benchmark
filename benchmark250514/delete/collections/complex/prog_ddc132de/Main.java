import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> map = new ArrayListValuedHashMap<>();
        UnmodifiableMultiValuedMap<String, Integer> unmodifiableMap = new UnmodifiableMultiValuedMap<>(map);

        Map<String, String> simpleMap = new HashMap<>();
        simpleMap.put("name", "Alice");
        simpleMap.put("city", "Wonderland");

        /* write */ map.put("key", 42);

        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum from 0 to 9: " + sum);

        String name = simpleMap.get("name");
        System.out.println("Name: " + name);

        /* read */ Integer value = unmodifiableMap.get("key").iterator().next();
        System.out.println(value);

        simpleMap.put("occupation", "Explorer");
        String occupation = simpleMap.get("occupation");
        System.out.println("Occupation: " + occupation);

        for (int i = 1; i <= 5; i++) {
            map.put("numbers", i);
        }

        System.out.println("Numbers associated with 'numbers' key:");
        for (Integer number : map.get("numbers")) {
            System.out.println(number);
        }
    }
}