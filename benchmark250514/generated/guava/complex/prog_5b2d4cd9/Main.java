import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.reflect.TypeToken;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MutableClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();
        Map<String, Integer> additionalMap = new HashMap<>();
        additionalMap.put("One", 1);
        additionalMap.put("Two", 2);

        // Complex operation on additionalMap
        int sum = 0;
        for (Map.Entry<String, Integer> entry : additionalMap.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of values in additionalMap: " + sum);

        /* write */ map.putInstance(String.class, "Hello, World!");

        // More complex operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);

        // Use another MutableClassToInstanceMap for different data types
        MutableClassToInstanceMap<Object> anotherMap = MutableClassToInstanceMap.create();
        anotherMap.putInstance(Integer.class, 42);
        anotherMap.putInstance(Double.class, 3.14);

        // Retrieve and print values from anotherMap
        Integer intValue = anotherMap.getInstance(Integer.class);
        Double doubleValue = anotherMap.getInstance(Double.class);
        System.out.println("Integer value from anotherMap: " + intValue);
        System.out.println("Double value from anotherMap: " + doubleValue);

        /* read */ String value = map.getInstance(String.class);
        System.out.println(value);
    }
}