import com.google.common.collect.ClassToInstanceMap;
import com.google.common.collect.MutableClassToInstanceMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the ClassToInstanceMap
        ClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();

        // Write an instance of Integer to the map
        /* write */ map.putInstance(Integer.class, 42);

        // Read the instance of Integer from the map
        /* read */ Integer value = map.getInstance(Integer.class);

        // Print the value to ensure it was read correctly
        System.out.println(value);
    }
}