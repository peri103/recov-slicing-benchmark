import org.apache.commons.collections4.map.AbstractSortedMapDecorator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the AbstractSortedMapDecorator using a TreeMap
        AbstractSortedMapDecorator<String, String> map = new AbstractSortedMapDecorator<>(new TreeMap<>()) {};
        
        /* write */ map.put("key", "value");
        /* read */ String retrievedValue = map.get("key");
        
        System.out.println(retrievedValue);
    }
}