import org.apache.commons.collections4.map.AbstractMapDecorator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create an instance of AbstractMapDecorator using a HashMap
        AbstractMapDecorator<String, Integer> map = new AbstractMapDecorator<String, Integer>(new HashMap<String, Integer>()) {};

        // Write operation
        /* write */ map.put("key", 42);

        // Read operation
        /* read */ int value = map.get("key");

        // Output the value
        System.out.println(value);
    }
}