import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.ClassToInstanceMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create an instance of MutableClassToInstanceMap
        ClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();

        // Create an instance of Integer to store in the map
        Integer number = 42;

        // Create another map to store additional data
        Map<String, String> additionalMap = new HashMap<>();
        additionalMap.put("key1", "value1");
        additionalMap.put("key2", "value2");

        // Use the putInstance method to store the Integer instance in the map
        /* write */ map.putInstance(Integer.class, number);

        // Perform operations on the additional map
        for (Map.Entry<String, String> entry : additionalMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Use the getInstance method to retrieve the Integer instance from the map
        /* read */ Integer retrievedNumber = map.getInstance(Integer.class);

        // Print the retrieved value to verify correctness
        System.out.println(retrievedNumber);

        // Further manipulate the retrieved number
        int doubledNumber = retrievedNumber * 2;
        System.out.println("Doubled number: " + doubledNumber);
    }
}