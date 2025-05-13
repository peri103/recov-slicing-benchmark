import org.apache.commons.collections4.map.AbstractOrderedBidiMapDecorator;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;

public class Main {
    public static void main(String[] args) {
        // Initialize an instance of DualHashBidiMap which is a concrete class of AbstractOrderedBidiMapDecorator
        AbstractOrderedBidiMapDecorator<String, Integer> map = new AbstractOrderedBidiMapDecorator<>(new DualHashBidiMap<>());

        // Write a key-value pair to the map
        /* write */ map.put("key1", 100);

        // Read the value associated with the key from the map
        /* read */ Integer value = map.get("key1");

        // Print the value to verify it is the same as what was written
        System.out.println(value);
    }
}