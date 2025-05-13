import org.apache.commons.collections4.map.AbstractSortedMapDecorator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the map using TreeMap as the underlying map implementation
        AbstractSortedMapDecorator<String, Integer> map = new AbstractSortedMapDecorator<String, Integer>(new TreeMap<String, Integer>()) {};

        /* write */ map.put("key", 42);
        /* read */ int value = map.get("key");

        System.out.println(value);
    }
}