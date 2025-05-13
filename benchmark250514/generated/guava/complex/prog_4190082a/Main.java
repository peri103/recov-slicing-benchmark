import com.google.common.collect.ImmutableClassToInstanceMap;
import com.google.common.collect.ImmutableClassToInstanceMap.Builder;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a Builder for ImmutableClassToInstanceMap
        Builder<Object> builder = ImmutableClassToInstanceMap.builder();
        
        // Create a HashMap and populate it with some values
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);
        
        // Create an ImmutableMap from the HashMap
        ImmutableMap<String, Integer> immutableMap = ImmutableMap.copyOf(hashMap);
        
        // Use the builder to put a String instance into the map
        /* write */ ImmutableClassToInstanceMap<Object> map = builder.put(String.class, "Hello World").build();
        
        // Retrieve a value from the ImmutableMap
        Integer number = immutableMap.get("Two");
        System.out.println("Retrieved number from ImmutableMap: " + number);
        
        // Perform some operations with the HashMap
        hashMap.put("Four", 4);
        hashMap.remove("One");
        
        // Print the contents of the HashMap
        System.out.println("Contents of HashMap:");
        for (String key : hashMap.keySet()) {
            System.out.println(key + ": " + hashMap.get(key));
        }
        
        // Retrieve the String instance from the ImmutableClassToInstanceMap
        /* read */ String value = map.getInstance(String.class);
        System.out.println(value);
        
        // Additional operations with the ImmutableMap
        boolean containsKey = immutableMap.containsKey("Three");
        System.out.println("ImmutableMap contains key 'Three': " + containsKey);
    }
}