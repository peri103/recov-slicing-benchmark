import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        /* write */ builder.put("key1", 100);

        // Create a HashMap and populate it
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("A", "Apple");
        hashMap.put("B", "Banana");
        hashMap.put("C", "Cherry");

        // Create an ImmutableList from the HashMap keys
        ImmutableList<String> keysList = ImmutableList.copyOf(hashMap.keySet());
        
        // Print the keys from the ImmutableList
        for (String key : keysList) {
            System.out.println("Key: " + key);
        }

        // Build the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        /* read */ Integer value = map.get("key1");

        // Print the value to verify
        System.out.println(value);

        // Further operations with ImmutableSortedMap
        builder.put("key2", 200);
        builder.put("key3", 300);
        ImmutableSortedMap<String, Integer> extendedMap = builder.build();

        // Print all values in the extended map
        for (Map.Entry<String, Integer> entry : extendedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}