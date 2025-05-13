import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.ClassToInstanceMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a MutableClassToInstanceMap
        ClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();
        
        // Create an instance of a class to store
        String stringInstance = "Hello, world!";
        
        // Write the instance to the map using putInstance
        /* write */ map.putInstance(String.class, stringInstance);
        
        // Read the instance back from the map using getInstance
        /* read */ String retrievedInstance = map.getInstance(String.class);
        
        // Print the retrieved instance
        System.out.println(retrievedInstance);
    }
}