import org.apache.commons.collections4.map.ReferenceMap;
import org.apache.commons.collections4.map.LRUMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a ReferenceMap instance
        ReferenceMap<String, String> map = new ReferenceMap<>();
        LRUMap<String, Integer> lruMap = new LRUMap<>(5);
        HashMap<String, Double> hashMap = new HashMap<>();

        // Use the write method to add a key-value pair to the map
        /* write */ map.put("key", "value");

        // Populate LRUMap with some values
        for (int i = 0; i < 5; i++) {
            lruMap.put("key" + i, i * 10);
        }

        // Add elements to HashMap
        hashMap.put("pi", 3.14159);
        hashMap.put("e", 2.71828);

        // Perform some operations on LRUMap
        lruMap.put("extraKey", 100);
        int lruValue = lruMap.get("key2"); // Access a value to affect LRU order

        // Additional operations on HashMap
        double piValue = hashMap.get("pi");
        double eValue = hashMap.get("e");
        double sum = piValue + eValue;

        // Output the sum of pi and e
        System.out.println("Sum of pi and e: " + sum);

        // Perform some unrelated calculations
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result += i;
        }
        System.out.println("Sum of first ten integers: " + result);

        // Use the read method to retrieve the value associated with the key
        /* read */ String value = map.get("key");

        // Output the retrieved value
        System.out.println("Retrieved value from ReferenceMap: " + value);

        // Further operations on LRUMap
        lruMap.put("anotherKey", 200);
        lruValue = lruMap.get("extraKey");

        // Output the retrieved value from LRUMap
        System.out.println("Retrieved value from LRUMap: " + lruValue);
    }
}