import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> map = new ArrayListValuedHashMap<>();
        UnmodifiableMultiValuedMap<String, Integer> unmodifiableMap = new UnmodifiableMultiValuedMap<>(map);

        /* write */ map.put("key", 42);

        Map<String, String> simpleMap = new HashMap<>();
        simpleMap.put("A", "Apple");
        simpleMap.put("B", "Banana");

        Set<String> keys = simpleMap.keySet();
        for (String key : keys) {
            System.out.println("Simple Map Key: " + key + ", Value: " + simpleMap.get(key));
        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9 is: " + sum);

        /* read */ Integer value = unmodifiableMap.get("key").iterator().next();
        System.out.println(value);

        MultiValuedMap<String, String> anotherMap = new ArrayListValuedHashMap<>();
        anotherMap.put("fruit", "Apple");
        anotherMap.put("fruit", "Banana");
        anotherMap.put("fruit", "Cherry");

        for (String fruit : anotherMap.get("fruit")) {
            System.out.println("Fruit: " + fruit);
        }
    }
}