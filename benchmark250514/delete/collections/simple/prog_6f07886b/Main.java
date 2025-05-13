import org.apache.commons.collections4.map.AbstractOrderedMapDecorator;
import org.apache.commons.collections4.map.ListOrderedMap;

public class Main {
    public static void main(String[] args) {
        // Initialize an instance of AbstractOrderedMapDecorator using ListOrderedMap
        AbstractOrderedMapDecorator<String, Integer> map = new ListOrderedMap<>();

        /* write */ map.put("key", 42);
        /* read */ int value = map.get("key");

        System.out.println(value);
    }
}