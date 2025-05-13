import org.apache.commons.collections4.map.AbstractMapDecorator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a HashMap to be used with AbstractMapDecorator
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        // Create an instance of AbstractMapDecorator using the HashMap
        AbstractMapDecorator<String, Integer> mapDecorator = new AbstractMapDecorator<>(hashMap) {};
        
        /* write */ mapDecorator.put("key", 42);
        /* read */ int value = mapDecorator.get("key");
        
        // Output the value read from the map
        System.out.println(value);
    }
}