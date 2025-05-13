import org.apache.commons.collections4.map.AbstractSortedMapDecorator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the AbstractSortedMapDecorator with a TreeMap
        AbstractSortedMapDecorator<String, Integer> map = new AbstractSortedMapDecorator<>(new TreeMap<>()) {};

        /* write */ map.put("key1", 42);
        /* read */ int value = map.get("key1");
        System.out.println(value);
    }
}