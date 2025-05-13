import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.ClassToInstanceMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the ClassToInstanceMap
        ClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();

        // Create an instance of a class to store
        String instance = "Hello, World!";

        // Write the instance to the map
        /* write */ map.putInstance(String.class, instance);

        // Read the instance from the map
        /* read */ String value = map.getInstance(String.class);

        // Print the value to ensure it was read correctly
        System.out.println(value);
    }
}