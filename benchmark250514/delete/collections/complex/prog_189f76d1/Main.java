import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> modifiableMap = new ArrayListValuedHashMap<>();
        UnmodifiableMultiValuedMap<String, Integer> map = new UnmodifiableMultiValuedMap<>(modifiableMap);

        // Unrelated complex operations
        Map<String, Integer> simpleMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            simpleMap.put("key" + i, i * 10);
        }

        int sum = 0;
        for (Map.Entry<String, Integer> entry : simpleMap.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of values in simpleMap: " + sum);

        // Perform some operations on the MultiValuedMap
        for (int i = 0; i < 5; i++) {
            modifiableMap.put("key" + i, i * 100);
        }

        int product = 1;
        for (String key : modifiableMap.keySet()) {
            for (Integer value : modifiableMap.get(key)) {
                product *= value;
            }
        }
        System.out.println("Product of values in modifiableMap: " + product);

        /* write */ modifiableMap.put("key", 42);

        // More complex operations
        Map<String, Integer> anotherMap = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            anotherMap.put("anotherKey" + i, i + 1);
        }

        int maxValue = Integer.MIN_VALUE;
        for (Integer value : anotherMap.values()) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        System.out.println("Max value in anotherMap: " + maxValue);

        /* read */ Integer value = map.get("key").iterator().next();

        System.out.println("Read value from UnmodifiableMultiValuedMap: " + value);
    }
}