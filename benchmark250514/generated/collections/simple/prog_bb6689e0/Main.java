import org.apache.commons.collections4.map.AbstractSortedMapDecorator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the TreeMap which will be decorated
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        
        // Create an instance of AbstractSortedMapDecorator with the TreeMap
        AbstractSortedMapDecorator<String, Integer> mapDecorator = new AbstractSortedMapDecorator<String, Integer>(treeMap) {};
        
        // Write a value to the map using the put method
        /* write */ mapDecorator.put("key", 42);
        
        // Read the value from the map using the get method
        /* read */ Integer value = mapDecorator.get("key");
        
        // Print the read value
        System.out.println(value);
    }
}