import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.MultiSet;
import org.apache.commons.collections4.multiset.HashMultiSet;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Initialize a modifiable MultiValuedMap
        MultiValuedMap<String, String> modifiableMap = new ArrayListValuedHashMap<>();

        // Wrap it with UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, String> map = new UnmodifiableMultiValuedMap<>(modifiableMap);

        // Use the modifiable map to perform write operations
        /* write */ modifiableMap.put("key", "value");

        // Create a MultiSet and add elements
        MultiSet<String> multiSet = new HashMultiSet<>();
        multiSet.add("apple");
        multiSet.add("banana");
        multiSet.add("apple"); // 'apple' appears twice

        // Print the count of each element in the MultiSet
        for (String element : multiSet.uniqueSet()) {
            System.out.println(element + ": " + multiSet.getCount(element));
        }

        // Perform some operations on the MultiValuedMap
        modifiableMap.put("key", "anotherValue");
        modifiableMap.put("anotherKey", "value");

        // Read from the unmodifiable map
        /* read */ Collection<String> values = map.get("key");

        // Print the read values
        for (String value : values) {
            System.out.println(value);
        }

        // Further operations to make the program complex
        MultiValuedMap<Integer, String> anotherMap = new ArrayListValuedHashMap<>();
        for (int i = 0; i < 5; i++) {
            anotherMap.put(i, "value" + i);
        }

        for (int i = 0; i < 5; i++) {
            Collection<String> valSet = anotherMap.get(i);
            for (String val : valSet) {
                System.out.println("Key: " + i + ", Value: " + val);
            }
        }
    }
}