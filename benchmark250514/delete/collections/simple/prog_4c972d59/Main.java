import org.apache.commons.collections4.map.AbstractOrderedBidiMapDecorator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create an instance of AbstractOrderedBidiMapDecorator using a HashMap
        AbstractOrderedBidiMapDecorator<String, Integer> map = new AbstractOrderedBidiMapDecorator<>(new HashMap<>());

        // Use the write method to put a key-value pair into the map
        /* write */ map.put("key", 42);

        // Use the read method to get the value associated with the key
        /* read */ Integer value = map.get("key");

        // Print the value
        System.out.println(value);
    }
}