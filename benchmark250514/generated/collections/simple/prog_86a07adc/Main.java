import org.apache.commons.collections4.map.AbstractMapDecorator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a HashMap and wrap it with AbstractMapDecorator
        HashMap<String, Integer> hashMap = new HashMap<>();
        AbstractMapDecorator<String, Integer> mapDecorator = new AbstractMapDecorator<>(hashMap) {};

        // Use the write method to put a value
        /* write */ mapDecorator.put("key", 100);

        // Use the read method to get the value
        /* read */ int value = mapDecorator.get("key");

        // Print the value to verify the operation
        System.out.println(value);
    }
}