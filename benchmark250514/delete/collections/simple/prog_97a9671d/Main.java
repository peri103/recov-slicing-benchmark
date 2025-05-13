import org.apache.commons.collections4.map.AbstractOrderedMapDecorator;
import org.apache.commons.collections4.map.LinkedMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a concrete implementation of AbstractOrderedMapDecorator
        AbstractOrderedMapDecorator<String, Integer> map = new LinkedMap<>();

        /* write */ map.put("key", 123);
        /* read */ Integer value = map.get("key");

        System.out.println(value);
    }
}