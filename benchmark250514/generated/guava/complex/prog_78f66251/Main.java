import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.ClassToInstanceMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a MutableClassToInstanceMap instance
        ClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();
        
        // Define a class and an instance to use with the map
        Class<String> keyClass = String.class;
        String instance = "Hello, World!";
        
        // Create a HashMap for additional complexity
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        
        // Iterate over the HashMap and print values
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Write the instance to the map
        /* write */ map.putInstance(keyClass, instance);
        
        // Perform some unrelated operations
        int sum = 0;
        for (int value : hashMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in hashMap: " + sum);
        
        // Read the instance back from the map
        /* read */ String value = map.getInstance(keyClass);
        
        // Output the value to ensure it's correctly retrieved
        System.out.println(value);
        
        // Additional operations with a new ClassToInstanceMap
        ClassToInstanceMap<Object> anotherMap = MutableClassToInstanceMap.create();
        Class<Integer> intClass = Integer.class;
        Integer intInstance = 42;
        anotherMap.putInstance(intClass, intInstance);
        Integer retrievedInt = anotherMap.getInstance(intClass);
        System.out.println("Retrieved integer: " + retrievedInt);
    }
}