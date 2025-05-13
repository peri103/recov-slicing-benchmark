import org.apache.commons.collections4.map.AbstractSortedMapDecorator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the map using TreeMap as the concrete implementation
        AbstractSortedMapDecorator<String, Integer> map = new AbstractSortedMapDecorator<>(new TreeMap<String, Integer>()) {};

        /* write */ map.put("key", 100);
        /* read */ Integer value = map.get("key");
        System.out.println(value);
    }
}