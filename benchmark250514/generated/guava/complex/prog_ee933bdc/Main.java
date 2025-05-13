import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.ClassToInstanceMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();

        // Additional code to make the program more complex
        Map<String, Integer> sampleMap = new HashMap<>();
        sampleMap.put("One", 1);
        sampleMap.put("Two", 2);
        sampleMap.put("Three", 3);

        int sum = 0;
        for (Map.Entry<String, Integer> entry : sampleMap.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of values in sampleMap: " + sum);

        // Another use of a similar API pair
        ClassToInstanceMap<Object> anotherMap = MutableClassToInstanceMap.create();
        anotherMap.putInstance(Integer.class, 123);
        Integer retrievedValue = anotherMap.getInstance(Integer.class);
        System.out.println("Retrieved value from anotherMap: " + retrievedValue);

        /* write */ map.putInstance(String.class, "Hello, World!");

        // More complex operations
        for (int i = 0; i < 5; i++) {
            sampleMap.put("Number " + i, i * 10);
        }

        for (String key : sampleMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + sampleMap.get(key));
        }

        /* read */ String value = map.getInstance(String.class);
        
        System.out.println(value);

        // Additional unrelated complex logic
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}