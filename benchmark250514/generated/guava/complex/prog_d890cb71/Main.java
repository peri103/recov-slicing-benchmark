import com.google.common.collect.ClassToInstanceMap;
import com.google.common.collect.MutableClassToInstanceMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the ClassToInstanceMap
        ClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();

        // Initialize a HashMap for additional complexity
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);

        // Perform some operations on the HashMap
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }

        // Write an instance of Integer to the map
        /* write */ map.putInstance(Integer.class, 42);

        // Perform more operations on the HashMap
        int sum = 0;
        for (Integer value : hashMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in hashMap: " + sum);

        // Use a different ClassToInstanceMap for additional complexity
        ClassToInstanceMap<Object> anotherMap = MutableClassToInstanceMap.create();
        anotherMap.putInstance(String.class, "Hello World");

        // Retrieve and print the String instance from anotherMap
        String greeting = anotherMap.getInstance(String.class);
        System.out.println("Greeting from anotherMap: " + greeting);

        // Read the instance of Integer from the map
        /* read */ Integer value = map.getInstance(Integer.class);

        // Print the value to ensure it was read correctly
        System.out.println("Value from map: " + value);

        // Perform some final operations on the HashMap
        hashMap.put("four", 4);
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Updated Key: " + entry.getKey() + ", Updated Value: " + entry.getValue());
        }
    }
}