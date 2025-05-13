import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import org.apache.commons.collections4.multimap.AbstractMultiValuedMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a MultiValuedMap using a HashSetValuedHashMap
        MultiValuedMap<String, String> map = new HashSetValuedHashMap<>();

        // Initialize another map to demonstrate additional complexity
        MultiValuedMap<String, Integer> numberMap = new HashSetValuedHashMap<>();
        Map<String, Integer> simpleMap = new HashMap<>();

        // Use the write method
        /* write */ map.put("key", "value");

        // Add more data to the numberMap
        numberMap.put("one", 1);
        numberMap.put("two", 2);
        numberMap.put("three", 3);

        // Add data to the simpleMap
        simpleMap.put("A", 65);
        simpleMap.put("B", 66);
        simpleMap.put("C", 67);

        // Perform operations on the numberMap
        Collection<Integer> numbers = numberMap.get("two");
        for (Integer num : numbers) {
            System.out.println("Number from numberMap: " + num);
        }

        // Perform operations on the simpleMap
        for (Map.Entry<String, Integer> entry : simpleMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Use the read method
        /* read */ String value = map.get("key").iterator().next();

        // Print the value to ensure it was read correctly
        System.out.println("Read value from map: " + value);

        // Further operations to increase complexity
        for (String key : map.keySet()) {
            System.out.println("Key from original map: " + key);
        }

        // Add more values to the original map
        map.put("key", "anotherValue");
        map.put("key", "yetAnotherValue");

        // Iterate over all values associated with "key"
        Collection<String> values = map.get("key");
        for (String val : values) {
            System.out.println("Value from original map: " + val);
        }
    }
}