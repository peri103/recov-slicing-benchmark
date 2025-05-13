import org.apache.commons.collections4.map.AbstractSortedMapDecorator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the AbstractSortedMapDecorator with a TreeMap
        AbstractSortedMapDecorator<String, Integer> map = new AbstractSortedMapDecorator<>(new TreeMap<>()) {};

        // Write a value to the map
        /* write */ map.put("key", 42);

        // Read the value from the map
        /* read */ int value = map.get("key");

        // Print the value to verify the read operation
        System.out.println(value);
    }
}