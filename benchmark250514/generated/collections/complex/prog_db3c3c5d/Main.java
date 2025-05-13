import org.apache.commons.collections4.map.AbstractReferenceMap;
import org.apache.commons.collections4.map.ReferenceMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the ReferenceMap with the appropriate reference types
        AbstractReferenceMap<String, Integer> map = new ReferenceMap<>(AbstractReferenceMap.ReferenceStrength.HARD, AbstractReferenceMap.ReferenceStrength.HARD);

        // Initialize a regular HashMap for additional operations
        HashMap<String, String> hashMap = new HashMap<>();
        
        // Perform operations on the HashMap
        hashMap.put("firstName", "John");
        hashMap.put("lastName", "Doe");
        System.out.println("Full Name: " + hashMap.get("firstName") + " " + hashMap.get("lastName"));

        // Add more operations to make the program complex
        for (int i = 0; i < 5; i++) {
            hashMap.put("number" + i, String.valueOf(i * 100));
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Value at number" + i + ": " + hashMap.get("number" + i));
        }

        // Write a value to the map
        /* write */ map.put("key", 42);

        // Perform more complex operations with a new ReferenceMap
        AbstractReferenceMap<String, String> stringMap = new ReferenceMap<>(AbstractReferenceMap.ReferenceStrength.HARD, AbstractReferenceMap.ReferenceStrength.HARD);
        stringMap.put("greeting", "Hello, World!");
        stringMap.put("farewell", "Goodbye!");

        // Output values from the new ReferenceMap
        System.out.println(stringMap.get("greeting"));
        System.out.println(stringMap.get("farewell"));

        // Manipulate the original map further
        map.put("anotherKey", 100);
        System.out.println("Value at anotherKey: " + map.get("anotherKey"));

        // Read the value from the original map
        /* read */ Integer value = map.get("key");

        // Output the value
        System.out.println(value);
    }
}