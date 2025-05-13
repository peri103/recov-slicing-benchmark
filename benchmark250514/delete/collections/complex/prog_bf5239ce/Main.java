import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.map.MultiValueMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, String> multiValuedMap = new ArrayListValuedHashMap<>();
        UnmodifiableMultiValuedMap<String, String> unmodifiableMap = new UnmodifiableMultiValuedMap<>(multiValuedMap);
        
        // Additional MultiValueMap usage
        MultiValueMap<String, Integer> additionalMap = MultiValueMap.multiValueMap(new HashMap<>());
        additionalMap.put("numbers", 10);
        additionalMap.put("numbers", 20);
        additionalMap.put("letters", 30);
        
        for (String key : additionalMap.keySet()) {
            System.out.println("Key: " + key + ", Values: " + additionalMap.get(key));
        }
        
        /* write */ multiValuedMap.put("key", "value");

        // Additional operations
        Map<String, Integer> simpleMap = new HashMap<>();
        simpleMap.put("one", 1);
        simpleMap.put("two", 2);
        simpleMap.put("three", 3);
        
        int sum = 0;
        for (Integer value : simpleMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in simpleMap: " + sum);
        
        // Unrelated complex logic
        int[] numbers = {1, 2, 3, 4, 5};
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        System.out.println("Product of array numbers: " + product);
        
        /* read */ String value = unmodifiableMap.get("key").iterator().next();
        System.out.println("Read value from unmodifiableMap: " + value);
    }
}