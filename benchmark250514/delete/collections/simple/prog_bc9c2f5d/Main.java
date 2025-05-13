import org.apache.commons.collections4.map.AbstractOrderedBidiMapDecorator;
import org.apache.commons.collections4.map.DualHashBidiMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the map using a DualHashBidiMap which is a concrete implementation
        AbstractOrderedBidiMapDecorator<String, Integer> map = new AbstractOrderedBidiMapDecorator<>(new DualHashBidiMap<>());

        /* write */ map.put("key", 42);
        /* read */ Integer value = map.get("key");

        // Print the value that was read from the map
        System.out.println(value);
    }
}