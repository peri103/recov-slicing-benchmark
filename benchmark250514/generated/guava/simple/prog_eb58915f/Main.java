import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.ClassToInstanceMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the ClassToInstanceMap
        ClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();

        // Use the write method to put an instance into the map
        /* write */ map.putInstance(String.class, "Hello World");

        // Use the read method to get the instance from the map
        /* read */ String value = map.getInstance(String.class);

        // Print the retrieved value
        System.out.println(value);
    }
}