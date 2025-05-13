import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a modifiable MultiValuedMap
        MultiValuedMap<String, Integer> modifiableMap = new MultiValueMap<>();

        // Wrap it with an UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, Integer> map = new UnmodifiableMultiValuedMap<>(modifiableMap);

        // Since UnmodifiableMultiValuedMap does not allow direct modifications, we modify the underlying map
        modifiableMap.put("key", 42);  // /* write */

        // Create a regular HashMap for additional complexity
        Map<String, List<Integer>> regularMap = new HashMap<>();
        regularMap.put("numbers", new ArrayList<>());

        // Add some values to the regular map
        for (int i = 1; i <= 5; i++) {
            regularMap.get("numbers").add(i * 10);
        }

        // Perform operations on the regular map
        for (String key : regularMap.keySet()) {
            List<Integer> values = regularMap.get(key);
            for (Integer val : values) {
                System.out.println("Regular map value: " + val);
            }
        }

        // Read the value using the UnmodifiableMultiValuedMap
        Integer value = map.get("key").iterator().next();  // /* read */

        System.out.println("Unmodifiable map value: " + value);

        // More operations for complexity
        List<Integer> complexList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            complexList.add(i * 15);
        }

        int sum = 0;
        for (Integer num : complexList) {
            sum += num;
        }

        System.out.println("Sum of complex list values: " + sum);
    }
}