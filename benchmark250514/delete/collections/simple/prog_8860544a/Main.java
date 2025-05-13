import org.apache.commons.collections4.map.AbstractOrderedMapDecorator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a HashMap to be used with AbstractOrderedMapDecorator
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        // Create an instance of AbstractOrderedMapDecorator using the HashMap
        AbstractOrderedMapDecorator<String, Integer> mapDecorator = new AbstractOrderedMapDecorator<>(hashMap) {};
        
        // Write a value to the map
        /* write */ mapDecorator.put("key", 42);
        
        // Read the value back from the map
        /* read */ int value = mapDecorator.get("key");
        
        // Print the value to verify it is correct
        System.out.println(value);
    }
}