import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.reflect.TypeToken;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MutableClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();
        
        // Create a type token for Integer class
        TypeToken<Integer> integerTypeToken = TypeToken.of(Integer.class);
        
        // Create another MutableClassToInstanceMap for demonstration
        MutableClassToInstanceMap<Object> anotherMap = MutableClassToInstanceMap.create();
        
        // Create a type token for String class
        TypeToken<String> stringTypeToken = TypeToken.of(String.class);
        
        // Put an instance in another map
        anotherMap.putInstance(String.class, "Hello, World!");

        // Create a HashMap for additional complexity
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        
        /* write */ map.putInstance(Integer.class, 42);
        
        // Perform operations on the HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Retrieve the instance from another map
        String greeting = anotherMap.getInstance(stringTypeToken);
        System.out.println(greeting);
        
        // Perform some calculations
        int sum = 0;
        for (Integer value : hashMap.values()) {
            sum += value;
        }
        System.out.println("Sum: " + sum);
        
        /* read */ Integer value = map.getInstance(integerTypeToken);
        
        System.out.println(value);
        
        // More operations for complexity
        hashMap.put("Three", 3);
        hashMap.put("Four", 4);
        
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key);
        }
    }
}