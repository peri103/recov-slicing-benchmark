import com.google.common.collect.LinkedHashMultimap;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the LinkedHashMultimap
        LinkedHashMultimap<String, Integer> multimap = LinkedHashMultimap.create();

        // Initialize another LinkedHashMultimap for additional operations
        LinkedHashMultimap<String, String> stringMultimap = LinkedHashMultimap.create();
        
        // Initialize a HashMap for unrelated operations
        Map<String, Integer> hashMap = new HashMap<>();
        
        // Use the write method to add a key-value pair
        /* write */ multimap.put("key1", 100);

        // Add some values to the stringMultimap
        stringMultimap.put("name", "Alice");
        stringMultimap.put("name", "Bob");
        stringMultimap.put("city", "New York");
        
        // Add some values to the hashMap
        hashMap.put("age", 30);
        hashMap.put("salary", 50000);
        
        // Perform some operations on hashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Perform some operations on stringMultimap
        Set<String> names = stringMultimap.get("name");
        for (String name : names) {
            System.out.println("Name: " + name);
        }

        // Use the read method to get the value associated with the key
        /* read */ Set<Integer> values = multimap.get("key1");

        // Print the values to verify the correct value is read
        System.out.println(values);
        
        // Additional operations on stringMultimap
        Set<String> cities = stringMultimap.get("city");
        for (String city : cities) {
            System.out.println("City: " + city);
        }
    }
}