import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSetValuedHashMap<String, Integer> multimap = new HashSetValuedHashMap<>();
        Map<String, Integer> simpleMap = new HashMap<>();

        // Populate the simpleMap with some values
        for (int i = 0; i < 5; i++) {
            simpleMap.put("key" + i, i * 10);
        }

        // Iterate over the simpleMap and print its contents
        for (Map.Entry<String, Integer> entry : simpleMap.entrySet()) {
            System.out.println("SimpleMap Entry: " + entry.getKey() + " -> " + entry.getValue());
        }

        // Add a value to the multimap
        /* write */ multimap.put("key", 42);

        // Perform some operations on the multimap
        multimap.put("anotherKey", 100);
        multimap.put("anotherKey", 200);

        // Retrieve a set of values for "anotherKey"
        Set<Integer> anotherKeyValues = multimap.get("anotherKey");
        System.out.println("Values for 'anotherKey': " + anotherKeyValues);

        // More complex logic involving the multimap
        for (Integer value : anotherKeyValues) {
            if (value > 150) {
                System.out.println("Value greater than 150: " + value);
            }
        }

        // Retrieve the value for the original key
        /* read */ Integer value = multimap.get("key").iterator().next();
        System.out.println("Value for 'key': " + value);

        // Additional logic to manipulate the multimap
        multimap.put("key", 84);
        multimap.put("key", 126);

        // Print all values for "key"
        Set<Integer> keyValues = multimap.get("key");
        System.out.println("All values for 'key': " + keyValues);
    }
}