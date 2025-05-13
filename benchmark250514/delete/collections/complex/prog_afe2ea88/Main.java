import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a MultiValuedMap instance
        MultiValuedMap<String, Integer> multiValuedMap = new MultiValueMap<>();
        
        // Wrap it with UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, Integer> unmodifiableMap = new UnmodifiableMultiValuedMap<>(multiValuedMap);

        // Since UnmodifiableMultiValuedMap does not allow modification, we need to directly use the original map to put values
        multiValuedMap.put("key1", 100);  // /* write */

        // Create an additional map for more complexity
        Map<String, List<Integer>> complexMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }
        complexMap.put("numbers", list);

        // Perform some operations on the complex map
        for (Map.Entry<String, List<Integer>> entry : complexMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Values: " + entry.getValue());
        }

        // Read the value from the unmodifiable map
        Integer value = unmodifiableMap.get("key1").iterator().next();  // /* read */

        System.out.println(value);

        // Perform some additional operations on the list
        for (Integer num : list) {
            System.out.println("Number: " + num);
        }
    }
}