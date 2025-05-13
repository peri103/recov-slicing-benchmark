import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.ClassToInstanceMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the ClassToInstanceMap
        ClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();

        // Use the write method to put an instance into the map
        /* write */ map.putInstance(String.class, "Hello World");

        // Create a HashMap to store additional data
        Map<Integer, String> additionalData = new HashMap<>();
        additionalData.put(1, "One");
        additionalData.put(2, "Two");
        additionalData.put(3, "Three");

        // Perform operations on the HashMap
        for (Map.Entry<Integer, String> entry : additionalData.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Manipulate the map further
        map.putInstance(Integer.class, 42);
        Integer intValue = map.getInstance(Integer.class);
        System.out.println("Integer value from map: " + intValue);

        // Use the read method to get the instance from the map
        /* read */ String value = map.getInstance(String.class);

        // Print the retrieved value
        System.out.println(value);

        // Add complexity with additional operations
        additionalData.put(4, "Four");
        additionalData.remove(2);

        for (Integer key : additionalData.keySet()) {
            System.out.println("Updated Key: " + key + ", Value: " + additionalData.get(key));
        }
    }
}