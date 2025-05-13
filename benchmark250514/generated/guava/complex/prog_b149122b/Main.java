import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Add an entry to the map using the builder
        /* write */ builder.put("key", 42);
        
        // Create an ImmutableList with some values
        ImmutableList<String> immutableList = ImmutableList.of("A", "B", "C", "D");

        // Print each element of the ImmutableList
        for (String element : immutableList) {
            System.out.println("ImmutableList element: " + element);
        }

        // Create a HashMap and populate it with some values
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("one", "1");
        hashMap.put("two", "2");
        hashMap.put("three", "3");

        // Print each entry of the HashMap
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("HashMap entry: " + entry.getKey() + " = " + entry.getValue());
        }

        // Build the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 4: " + sum);

        // Retrieve the value associated with the key
        /* read */ Integer value = map.get("key");
        
        // Print the value
        System.out.println(value);
    }
}