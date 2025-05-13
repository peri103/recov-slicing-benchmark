import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a modifiable MultiValuedMap
        MultiValuedMap<String, Integer> modifiableMap = new ArrayListValuedHashMap<>();

        // Wrap it with UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, Integer> map = new UnmodifiableMultiValuedMap<>(modifiableMap);

        // Perform write operation on the modifiable map
        /* write */ modifiableMap.put("key", 42); // This line is executed only once

        // Unrelated complex code using a HashMap
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");
        hashMap.put("C", "Cherry");

        // Iterate over the HashMap and perform some operations
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Fruit: " + value + " starts with " + key);
        }

        // More complex operations on the MultiValuedMap
        modifiableMap.put("key", 43);
        modifiableMap.put("key", 44);
        modifiableMap.put("anotherKey", 55);

        // Perform some operations to manipulate data
        Collection<Integer> anotherValues = map.get("anotherKey");
        for (Integer val : anotherValues) {
            System.out.println("Another Key Value: " + val);
        }

        // Perform read operation on the unmodifiable map
        /* read */ Collection<Integer> values = map.get("key"); // This line is executed only once

        // Output the result
        for (Integer value : values) {
            System.out.println("Key Value: " + value);
        }

        // Additional unrelated complex operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);
    }
}