import org.apache.commons.collections4.map.AbstractOrderedMapDecorator;
import org.apache.commons.collections4.map.LinkedMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the map using LinkedMap which is a concrete implementation
        AbstractOrderedMapDecorator<String, Integer> map = new LinkedMap<>();

        /* write */ map.put("key", 42);

        /* read */ int value = map.get("key");

        System.out.println(value);
    }
}