import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a modifiable MultiValuedMap
        MultiValuedMap<String, String> modifiableMap = new ArrayListValuedHashMap<>();

        // Wrap it with UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, String> map = new UnmodifiableMultiValuedMap<>(modifiableMap);

        // Initialize a Bag to demonstrate additional complexity
        Bag<String> bag = new HashBag<>();
        bag.add("apple", 2);
        bag.add("banana");

        // Initialize a simple Map for additional operations
        Map<String, Integer> simpleMap = new HashMap<>();
        simpleMap.put("A", 1);
        simpleMap.put("B", 2);

        // Perform operations on the Bag
        System.out.println("Bag operations:");
        System.out.println("Count of apple: " + bag.getCount("apple"));
        System.out.println("Unique Set: " + bag.uniqueSet());

        // Perform operations on the simple Map
        System.out.println("Map operations:");
        for (Map.Entry<String, Integer> entry : simpleMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Modify the underlying modifiable map
        modifiableMap.put("key", "value"); // This is effectively the write operation

        // Additional unrelated logic to increase complexity
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);

        // Now read from the UnmodifiableMultiValuedMap
        System.out.println("UnmodifiableMultiValuedMap operations:");
        /* read */ System.out.println(map.get("key"));

        // More operations with the Bag
        bag.remove("apple");
        System.out.println("Count of apple after removal: " + bag.getCount("apple"));

        // More operations with the simple Map
        simpleMap.put("C", 3);
        System.out.println("Updated Map operations:");
        for (Map.Entry<String, Integer> entry : simpleMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}