import org.apache.commons.collections4.map.AbstractOrderedBidiMapDecorator;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the underlying map for the decorator
        DualHashBidiMap<String, Integer> bidiMap = new DualHashBidiMap<>();

        // Create an instance of AbstractOrderedBidiMapDecorator
        AbstractOrderedBidiMapDecorator<String, Integer> mapDecorator = new AbstractOrderedBidiMapDecorator<>(bidiMap) {};

        /* write */ mapDecorator.put("key", 42);
        /* read */ int value = mapDecorator.get("key");

        System.out.println(value);
    }
}