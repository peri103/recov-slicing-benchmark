import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Original write-read pair
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        /* write */ builder.put(String.class, "Hello, World!");

        // Additional code: Create a HashMap and populate it
        Map<Integer, String> hashMap = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            hashMap.put(i, "Value " + i);
        }

        // Additional code: Perform some operations on the HashMap
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Build the ImmutableClassToInstanceMap
        ImmutableClassToInstanceMap<Object> map = builder.build();

        // Additional code: Perform some calculations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Original read operation
        /* read */ String value = (String) map.getInstance(String.class);
        System.out.println(value);

        // Additional code: More operations on the HashMap
        hashMap.put(5, "New Value");
        System.out.println("Updated HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Additional code: Use another ImmutableClassToInstanceMap
        Builder<Object> anotherBuilder = ImmutableClassToInstanceMap.builder();
        anotherBuilder.put(Integer.class, 42);
        ImmutableClassToInstanceMap<Object> anotherMap = anotherBuilder.build();
        Integer number = (Integer) anotherMap.getInstance(Integer.class);
        System.out.println("Number from another map: " + number);
    }
}