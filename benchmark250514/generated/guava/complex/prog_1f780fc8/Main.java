import com.google.common.collect.ImmutableTable;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create an immutable table with a single entry using the 'of' method
        /* write */ ImmutableTable<String, String, Integer> table = ImmutableTable.of("row1", "column1", 42);

        // Create a HashMap and populate it with some data
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("key1", 100);
        hashMap.put("key2", 200);

        // Create an ImmutableMap from the HashMap
        ImmutableMap<String, Integer> immutableMap = ImmutableMap.copyOf(hashMap);

        // Perform some operations on the ImmutableMap
        int mapValue1 = immutableMap.get("key1");
        System.out.println("Map Value for key1: " + mapValue1);

        int mapValue2 = immutableMap.get("key2");
        System.out.println("Map Value for key2: " + mapValue2);

        // Additional logic to make the program more complex
        int sum = 0;
        for (String key : immutableMap.keySet()) {
            sum += immutableMap.get(key);
        }
        System.out.println("Sum of all values in the map: " + sum);

        // Read the value from the table using the 'get' method
        /* read */ Integer value = table.get("row1", "column1");

        // Print the value from the table
        System.out.println("Table Value: " + value);

        // Further operations to increase complexity
        if (value > 40) {
            System.out.println("The value is greater than 40");
        } else {
            System.out.println("The value is 40 or less");
        }
    }
}