import org.apache.commons.collections4.map.MultiKeyMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiKeyMap<String, Integer> multiKeyMap = new MultiKeyMap<>();
        Map<String, Integer> simpleMap = new HashMap<>();
        
        /* write */ multiKeyMap.put("key1", "key2", 42);
        
        // Perform some unrelated operations
        simpleMap.put("A", 10);
        simpleMap.put("B", 20);
        simpleMap.put("C", 30);

        int sum = 0;
        for (String key : simpleMap.keySet()) {
            sum += simpleMap.get(key);
        }
        System.out.println("Sum of values in simpleMap: " + sum);

        // Manipulate the MultiKeyMap further
        multiKeyMap.put("key3", "key4", 84);
        multiKeyMap.put("key5", "key6", 126);

        int sumMultiKeyMap = 0;
        for (String key1 : new String[]{"key1", "key3", "key5"}) {
            for (String key2 : new String[]{"key2", "key4", "key6"}) {
                Integer val = multiKeyMap.get(key1, key2);
                if (val != null) {
                    sumMultiKeyMap += val;
                }
            }
        }
        System.out.println("Sum of values in multiKeyMap: " + sumMultiKeyMap);

        // Further operations
        simpleMap.put("D", 40);
        simpleMap.put("E", 50);
        int product = 1;
        for (String key : simpleMap.keySet()) {
            product *= simpleMap.get(key);
        }
        System.out.println("Product of values in simpleMap: " + product);

        /* read */ int value = multiKeyMap.get("key1", "key2");
        System.out.println("Read value from multiKeyMap: " + value);
    }
}