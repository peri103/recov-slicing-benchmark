import com.google.common.collect.MutableClassToInstanceMap;

public class Main {
    public static void main(String[] args) {
        MutableClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();
        
        // Create an instance of a class to store
        String instance = "Hello, World!";
        
        /* write */ map.putInstance(String.class, instance);
        
        /* read */ String retrievedInstance = map.getInstance(String.class);
        
        System.out.println(retrievedInstance);
    }
}