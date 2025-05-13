import org.apache.commons.collections4.map.AbstractOrderedBidiMapDecorator;
import org.apache.commons.collections4.bidimap.TreeBidiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the BidiMap with a concrete implementation
        AbstractOrderedBidiMapDecorator<String, String> map = new AbstractOrderedBidiMapDecorator<>(new TreeBidiMap<>());

        // Initialize a regular HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Populate the HashMap
        for (int i = 0; i < 5; i++) {
            hashMap.put("key" + i, i * 10);
        }

        /* write */ map.put("key", "value");

        // Perform operations on the HashMap
        int sum = 0;
        for (String key : hashMap.keySet()) {
            sum += hashMap.get(key);
        }
        System.out.println("Sum of values in HashMap: " + sum);

        // Additional operations on the BidiMap
        map.put("anotherKey", "anotherValue");
        map.put("thirdKey", "thirdValue");

        // Retrieve values from the BidiMap
        String anotherValue = map.get("anotherKey");
        System.out.println("Retrieved from BidiMap: " + anotherValue);

        // Further processing
        if (map.containsKey("thirdKey")) {
            System.out.println("BidiMap contains 'thirdKey'");
        }

        /* read */ String value = map.get("key");
        System.out.println(value);

        // Iterate over the keys in the BidiMap
        for (String key : map.keySet()) {
            System.out.println("Key in BidiMap: " + key);
        }
    }
}