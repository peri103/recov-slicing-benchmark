import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a builder for ImmutableClassToInstanceMap
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Create a sample class and instance
        Class<String> sampleClass = String.class;
        String sampleInstance = "Hello, World!";
        
        /* write */
        builder.put(sampleClass, sampleInstance);
        
        // Create a HashMap and populate it with some values
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        
        // Perform some operations on the HashMap
        int sum = 0;
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of HashMap values: " + sum);
        
        // Build the ImmutableClassToInstanceMap
        ImmutableClassToInstanceMap<Object> map = builder.build();
        
        // Create another ImmutableClassToInstanceMap with different data
        Builder<Object> anotherBuilder = ImmutableClassToInstanceMap.builder();
        Class<Integer> anotherClass = Integer.class;
        Integer anotherInstance = 42;
        anotherBuilder.put(anotherClass, anotherInstance);
        ImmutableClassToInstanceMap<Object> anotherMap = anotherBuilder.build();
        
        // Perform operations on the second map
        Integer anotherValue = anotherMap.getInstance(anotherClass);
        System.out.println("Another value: " + anotherValue);
        
        /* read */
        String value = map.getInstance(sampleClass);
        
        // Output the read value
        System.out.println(value);
        
        // Additional complex operations
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("Key1", "Value1");
        stringMap.put("Key2", "Value2");
        stringMap.put("Key3", "Value3");
        
        for (String key : stringMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + stringMap.get(key));
        }
    }
}