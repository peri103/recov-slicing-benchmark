import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.ClassToInstanceMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the ClassToInstanceMap object
        ClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();
        
        // Define the class and the instance to be stored in the map
        Class<String> keyClass = String.class;
        String instance = "Hello, World!";
        
        /* write */ map.putInstance(keyClass, instance);
        
        /* read */ String value = map.getInstance(keyClass);
        
        // Print the value read from the map
        System.out.println(value);
    }
}