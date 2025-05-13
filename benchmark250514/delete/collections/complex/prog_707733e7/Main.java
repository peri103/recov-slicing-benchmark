import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.map.MultiValueMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Original write-read pair
        MultiValuedMap<String, String> map = new ArrayListValuedHashMap<>();
        UnmodifiableMultiValuedMap<String, String> unmodifiableMap = UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(map);

        /* write */ map.put("key", "value");

        // Additional operations using similar API pair
        MultiValueMap<String, Integer> multiValueMap = new MultiValueMap<>();
        multiValueMap.put("numbers", 10);
        multiValueMap.put("numbers", 20);
        multiValueMap.put("numbers", 30);

        Map<String, String> regularMap = new HashMap<>();
        regularMap.put("name", "Alice");
        regularMap.put("city", "Wonderland");

        // Some unrelated operations to increase complexity
        int sum = 0;
        for (Integer num : multiValueMap.get("numbers")) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        for (Map.Entry<String, String> entry : regularMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Manipulating the original map to increase complexity
        map.put("key", "anotherValue");

        // Read operation far apart from write
        /* read */ String value = unmodifiableMap.get("key").iterator().next();
        System.out.println(value);

        // More unrelated operations
        int product = 1;
        for (Integer num : multiValueMap.get("numbers")) {
            product *= num;
        }
        System.out.println("Product of numbers: " + product);

        regularMap.put("occupation", "Explorer");
        for (Map.Entry<String, String> entry : regularMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}