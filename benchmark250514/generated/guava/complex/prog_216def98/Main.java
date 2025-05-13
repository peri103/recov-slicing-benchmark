import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        /* write */ builder.put(String.class, "Hello, World!");
        
        // Additional complex operations
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("One", 1);
        map1.put("Two", 2);
        map1.put("Three", 3);

        Set<String> keys = map1.keySet();
        for (String key : keys) {
            System.out.println("Key: " + key + ", Value: " + map1.get(key));
        }

        int sum = 0;
        for (int value : map1.values()) {
            sum += value;
        }
        System.out.println("Sum of values: " + sum);

        ImmutableClassToInstanceMap<Object> map = builder.build();
        
        // More unrelated operations
        Map<Class<?>, Object> map2 = new HashMap<>();
        map2.put(Integer.class, 42);
        map2.put(Double.class, 3.14);
        
        for (Map.Entry<Class<?>, Object> entry : map2.entrySet()) {
            System.out.println("Class: " + entry.getKey().getSimpleName() + ", Value: " + entry.getValue());
        }
        
        /* read */ String value = map.getInstance(String.class);
        System.out.println(value);

        // Final unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Factorial of 5: " + product);
    }
}