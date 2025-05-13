import org.apache.commons.collections4.map.AbstractSortedMapDecorator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a TreeMap which is a sorted map
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        
        // Create an AbstractSortedMapDecorator using the TreeMap
        AbstractSortedMapDecorator<String, Integer> mapDecorator = new AbstractSortedMapDecorator<>(treeMap) {};
        
        /* write */ mapDecorator.put("key", 42);
        /* read */ Integer value = mapDecorator.get("key");
        
        System.out.println(value);
    }
}