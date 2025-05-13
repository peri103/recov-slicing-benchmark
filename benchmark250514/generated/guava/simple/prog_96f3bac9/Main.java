import com.google.common.collect.ClassToInstanceMap;
import com.google.common.collect.MutableClassToInstanceMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the ClassToInstanceMap
        ClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();

        // Create an instance of a class to store
        String instance = "Hello, World!";

        // Use the write method to store the instance in the map
        /* write */ map.putInstance(String.class, instance);

        // Use the read method to retrieve the instance from the map
        /* read */ String value = map.getInstance(String.class);

        // Print the retrieved value
        System.out.println(value);
    }
}