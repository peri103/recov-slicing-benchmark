import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Initialize a modifiable MultiValuedMap
        MultiValuedMap<String, String> modifiableMap = new ArrayListValuedHashMap<>();

        // Wrap the modifiable map in an UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, String> map = new UnmodifiableMultiValuedMap<>(modifiableMap);

        // Directly modify the original map since UnmodifiableMultiValuedMap does not allow modification
        modifiableMap.put("key", "value"); // /* write */

        // Additional unrelated code to increase complexity
        Map<String, Integer> simpleMap = new HashMap<>();
        simpleMap.put("alpha", 1);
        simpleMap.put("beta", 2);
        simpleMap.put("gamma", 3);

        Set<String> keys = simpleMap.keySet();
        for (String key : keys) {
            System.out.println("Key: " + key + ", Value: " + simpleMap.get(key));
        }

        // More complex logic involving the MultiValuedMap
        modifiableMap.put("key", "anotherValue");
        modifiableMap.put("otherKey", "differentValue");

        // Operations that do not affect the original write-read pair
        Collection<String> otherValues = map.get("otherKey");
        for (String value : otherValues) {
            System.out.println("Other Key Value: " + value);
        }

        // Read from the UnmodifiableMultiValuedMap
        Collection<String> values = map.get("key"); // /* read */

        // Print the read values
        for (String value : values) {
            System.out.println("Key Value: " + value);
        }

        // Additional unrelated code to increase complexity
        int sum = 0;
        for (Integer val : simpleMap.values()) {
            sum += val;
        }
        System.out.println("Sum of simpleMap values: " + sum);
    }
}