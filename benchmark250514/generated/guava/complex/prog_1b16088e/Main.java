import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.ClassToInstanceMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Original write-read pair using ClassToInstanceMap
        ClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();
        /* write */ map.putInstance(Integer.class, 42);
        
        // Additional code to increase complexity
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("key1", "value1");
        stringMap.put("key2", "value2");

        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Perform operations on a different ClassToInstanceMap
        ClassToInstanceMap<Object> anotherMap = MutableClassToInstanceMap.create();
        anotherMap.putInstance(String.class, "Hello, World!");
        String greeting = anotherMap.getInstance(String.class);
        System.out.println(greeting);

        // Continue with original map operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);

        /* read */ Integer value = map.getInstance(Integer.class);
        System.out.println("Read value: " + value);
    }
}