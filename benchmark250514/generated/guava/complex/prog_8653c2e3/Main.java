import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a builder for ImmutableSortedMap
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();
        
        // Use the builder to add entries to the map
        /* write */ builder.put("key1", 42);
        
        // Build the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();
        
        // Create a HashMap and populate it
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "Alice");
        hashMap.put("city", "Wonderland");

        // Perform operations on the HashMap
        String name = hashMap.get("name");
        System.out.println("Name: " + name);

        // Create an ImmutableList and populate it
        ImmutableList<String> immutableList = ImmutableList.of("apple", "banana", "cherry");

        // Iterate over the ImmutableList and print each item
        for (String fruit : immutableList) {
            System.out.println("Fruit: " + fruit);
        }

        // Perform some calculations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares: " + sum);

        // Read the value associated with "key1"
        /* read */ Integer value = map.get("key1");
        
        // Print the value
        System.out.println("Value from ImmutableSortedMap: " + value);
    }
}