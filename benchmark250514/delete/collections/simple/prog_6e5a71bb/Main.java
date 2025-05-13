import org.apache.commons.collections4.map.AbstractOrderedBidiMapDecorator;
import org.apache.commons.collections4.bidimap.TreeBidiMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the BidiMap with a concrete implementation
        AbstractOrderedBidiMapDecorator<String, String> map = new AbstractOrderedBidiMapDecorator<>(new TreeBidiMap<>());

        /* write */ map.put("key", "value");
        /* read */ String value = map.get("key");

        System.out.println(value);
    }
}