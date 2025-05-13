import org.apache.commons.collections4.map.AbstractMapDecorator;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create an instance of a class that extends AbstractMapDecorator
        AbstractMapDecorator<String, Integer> mapDecorator = new AbstractMapDecorator<String, Integer>(new HashMap<String, Integer>()) {};

        // Write a value to the map
        /* write */ mapDecorator.put("key", 42);

        // Read the value from the map
        /* read */ Integer value = mapDecorator.get("key");

        // Print the value
        System.out.println(value);
    }
}