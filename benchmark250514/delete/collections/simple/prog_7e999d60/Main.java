import org.apache.commons.collections4.map.AbstractMapDecorator;
import org.apache.commons.collections4.map.HashedMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a concrete implementation of AbstractMapDecorator
        AbstractMapDecorator<String, String> map = new HashedMap<>();

        /* write */ map.put("key", "value");

        /* read */ String value = map.get("key");

        System.out.println(value);
    }
}