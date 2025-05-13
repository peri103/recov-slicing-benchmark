import org.apache.commons.collections4.map.AbstractMapDecorator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a HashMap to be used with AbstractMapDecorator
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Create an instance of AbstractMapDecorator using the HashMap
        AbstractMapDecorator<String, Integer> mapDecorator = new AbstractMapDecorator<String, Integer>(hashMap) {};

        // Use the write method to put a value into the map
        /* write */ mapDecorator.put("key", 42);

        // Use the read method to get the value from the map
        /* read */ Integer value = mapDecorator.get("key");

        // Print the value to ensure the read method retrieved the correct value
        System.out.println(value);
    }
}