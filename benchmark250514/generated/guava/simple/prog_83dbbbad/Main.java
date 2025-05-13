import com.google.common.collect.ClassToInstanceMap;
import com.google.common.collect.MutableClassToInstanceMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the ClassToInstanceMap
        ClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();

        // Create an instance of a class to store
        String instance = "Hello, World!";

        // Use the write method to store the instance
        /* write */ map.putInstance(String.class, instance);

        // Use the read method to retrieve the instance
        /* read */ String retrievedInstance = map.getInstance(String.class);

        // Print the retrieved instance to verify the operation
        System.out.println(retrievedInstance);
    }
}