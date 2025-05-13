import org.apache.commons.collections4.map.MultiKeyMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the MultiKeyMap
        MultiKeyMap<String, Integer> multiKeyMap = new MultiKeyMap<>();

        // Use the write method to put a value in the map
        /* write */ multiKeyMap.put("key1", "key2", 42);

        // Initialize a HashMap for additional complexity
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "John Doe");
        hashMap.put("occupation", "Developer");

        // Perform some operations on the HashMap
        String name = hashMap.get("name");
        String occupation = hashMap.get("occupation");

        System.out.println("Name: " + name);
        System.out.println("Occupation: " + occupation);

        // Perform calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Use the read method to get the value from the map
        /* read */ Integer value = multiKeyMap.get("key1", "key2");

        // Print the retrieved value
        System.out.println("Retrieved value from MultiKeyMap: " + value);

        // Additional operations on a new MultiKeyMap
        MultiKeyMap<String, String> multiKeyMap2 = new MultiKeyMap<>();
        multiKeyMap2.put("fruit", "color", "red");
        multiKeyMap2.put("vegetable", "color", "green");

        String fruitColor = multiKeyMap2.get("fruit", "color");
        String vegetableColor = multiKeyMap2.get("vegetable", "color");

        System.out.println("Fruit color: " + fruitColor);
        System.out.println("Vegetable color: " + vegetableColor);
    }
}