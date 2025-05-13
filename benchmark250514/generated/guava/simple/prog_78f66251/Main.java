import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.ClassToInstanceMap;

public class Main {
    public static void main(String[] args) {
        // Create a MutableClassToInstanceMap instance
        ClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();
        
        // Define a class and an instance to use with the map
        Class<String> keyClass = String.class;
        String instance = "Hello, World!";
        
        // Write the instance to the map
        /* write */ map.putInstance(keyClass, instance);
        
        // Read the instance back from the map
        /* read */ String value = map.getInstance(keyClass);
        
        // Output the value to ensure it's correctly retrieved
        System.out.println(value);
    }
}