import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.ClassToInstanceMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize Guava ClassToInstanceMap
        ClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();
        
        // Initialize a HashMap for additional complexity
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        // Perform some operations on the HashMap
        int sum = 0;
        for (String key : hashMap.keySet()) {
            sum += hashMap.get(key);
        }
        System.out.println("Sum of values in HashMap: " + sum);

        // Write to the ClassToInstanceMap
        /* write */ map.putInstance(String.class, "Hello, World!");

        // Perform some unrelated operations
        int product = 1;
        for (Integer value : hashMap.values()) {
            product *= value;
        }
        System.out.println("Product of values in HashMap: " + product);

        // Read from the ClassToInstanceMap
        /* read */ String value = map.getInstance(String.class);

        // Print the result from ClassToInstanceMap
        System.out.println(value);

        // More complexity: Calculate factorial of a number
        int factorial = 1;
        int number = 5;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}