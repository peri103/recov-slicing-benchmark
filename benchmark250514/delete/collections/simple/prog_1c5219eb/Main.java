import org.apache.commons.collections4.map.AbstractOrderedBidiMapDecorator;
import org.apache.commons.collections4.map.TreeBidiMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the AbstractOrderedBidiMapDecorator with a TreeBidiMap
        AbstractOrderedBidiMapDecorator<String, Integer> bidiMap = new AbstractOrderedBidiMapDecorator<>(new TreeBidiMap<>());

        /* write */ bidiMap.put("key1", 100);

        /* read */ Integer value = bidiMap.get("key1");

        System.out.println(value);
    }
}