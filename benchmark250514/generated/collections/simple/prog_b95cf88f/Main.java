import org.apache.commons.collections4.map.AbstractMapDecorator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a HashMap which will be decorated by AbstractMapDecorator
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        // Create an instance of AbstractMapDecorator to wrap the HashMap
        AbstractMapDecorator<String, Integer> mapDecorator = new AbstractMapDecorator<String, Integer>(hashMap) {};
        
        /* write */ mapDecorator.put("key", 42);
        
        /* read */ Integer value = mapDecorator.get("key");
        
        System.out.println(value);
    }
}