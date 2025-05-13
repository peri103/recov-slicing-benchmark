import org.apache.commons.collections4.map.AbstractSortedMapDecorator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a TreeMap to be decorated by AbstractSortedMapDecorator
        TreeMap<Integer, String> baseMap = new TreeMap<>();
        
        // Create an instance of AbstractSortedMapDecorator using the baseMap
        AbstractSortedMapDecorator<Integer, String> mapDecorator = new AbstractSortedMapDecorator<>(baseMap) {};
        
        // Use the write method to put a value into the map
        /* write */ mapDecorator.put(1, "value1");
        
        // Use the read method to get the value from the map
        /* read */ String value = mapDecorator.get(1);
        
        // Print the value to verify the read operation
        System.out.println(value);
    }
}