import com.google.common.collect.ImmutableSortedMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a simple HashMap and populate it with data
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");
        hashMap.put("C", "Cherry");

        // Print all elements in the HashMap
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Create an ImmutableSortedMap using the 'of' method
        /* write */ ImmutableSortedMap<String, Integer> map = ImmutableSortedMap.of("key1", 100, "key2", 200);

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Create another ImmutableSortedMap for demonstration
        ImmutableSortedMap<String, Integer> anotherMap = ImmutableSortedMap.of("keyA", 300, "keyB", 400);

        // Print values from the new map
        System.out.println("Value for keyA: " + anotherMap.get("keyA"));
        System.out.println("Value for keyB: " + anotherMap.get("keyB"));

        // Read a value from the original map using the 'get' method
        /* read */ Integer value = map.get("key1");
        
        // Print the value to verify the read operation
        System.out.println(value);
    }
}