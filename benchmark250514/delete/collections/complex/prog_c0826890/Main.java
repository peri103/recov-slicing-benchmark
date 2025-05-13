import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.map.MultiValueMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the original map and unmodifiable map
        MultiValuedMap<String, Integer> map = new ArrayListValuedHashMap<>();
        UnmodifiableMultiValuedMap<String, Integer> unmodifiableMap = new UnmodifiableMultiValuedMap<>(map);
        
        // Initialize a separate MultiValueMap
        MultiValueMap<String, String> multiValueMap = new MultiValueMap<>();
        multiValueMap.put("fruit", "apple");
        multiValueMap.put("fruit", "banana");
        multiValueMap.put("vegetable", "carrot");
        
        // Initialize a HashMap and populate it
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("country", "USA");
        hashMap.put("city", "New York");

        // Perform operations on MultiValueMap
        System.out.println("Fruits: " + multiValueMap.get("fruit"));
        System.out.println("Vegetables: " + multiValueMap.get("vegetable"));

        // Iterate over HashMap
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Perform write operation on original map
        /* write */ map.put("key", 42);

        // Additional operations to increase complexity
        for (int i = 0; i < 5; i++) {
            map.put("number", i);
        }
        System.out.println("Numbers: " + map.get("number"));

        // Perform read operation on original map
        /* read */ Integer value = unmodifiableMap.get("key").iterator().next();
        System.out.println(value);
    }
}