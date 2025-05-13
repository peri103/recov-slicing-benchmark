import org.apache.commons.collections4.map.TransformedMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a HashMap to be transformed
        Map<String, Integer> originalMap = new HashMap<>();
        
        // Create a TransformedMap using the original map
        TransformedMap<String, Integer> transformedMap = TransformedMap.transformedMap(
            originalMap,
            key -> key.toUpperCase(), // Key transformer: Convert keys to uppercase
            value -> value * 2         // Value transformer: Double the values
        );

        // Use the write method to put a value in the map
        /* write */ transformedMap.put("key", 42);
        
        // Create another TransformedMap with different transformations
        Map<String, Double> anotherMap = new HashMap<>();
        TransformedMap<String, Double> transformedMap2 = TransformedMap.transformedMap(
            anotherMap,
            key -> key.toLowerCase(), // Key transformer: Convert keys to lowercase
            value -> Math.sqrt(value) // Value transformer: Square root the values
        );

        // Put values in the second transformed map
        transformedMap2.put("KEY1", 16.0);
        transformedMap2.put("KEY2", 25.0);

        // Read values from the second transformed map
        Double value1 = transformedMap2.get("key1");
        Double value2 = transformedMap2.get("key2");
        System.out.println("TransformedMap2 values: " + value1 + ", " + value2);

        // Create an ArrayList and perform some operations
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(i * 10);
        }

        // Iterate and print values from the ArrayList
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("ArrayList value: " + arrayList.get(i));
        }

        // Perform a complex operation using the original transformed map
        int sum = 0;
        for (Map.Entry<String, Integer> entry : transformedMap.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of transformedMap values: " + sum);

        // Use the read method to get the value from the original transformed map
        /* read */ Integer value = transformedMap.get("KEY");
        
        // Print the value
        System.out.println("Original transformedMap value: " + value);
    }
}