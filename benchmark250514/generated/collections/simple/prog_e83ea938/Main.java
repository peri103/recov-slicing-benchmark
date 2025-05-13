import org.apache.commons.collections4.map.AbstractSortedMapDecorator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the underlying map
        TreeMap<String, Integer> underlyingMap = new TreeMap<>();
        
        // Create an instance of AbstractSortedMapDecorator
        AbstractSortedMapDecorator<String, Integer> mapDecorator = new AbstractSortedMapDecorator<>(underlyingMap) {};

        // Use the write method to put a value
        /* write */ mapDecorator.put("key", 100);

        // Use the read method to get the value
        /* read */ int value = mapDecorator.get("key");

        // Print the value to verify
        System.out.println(value);
    }
}