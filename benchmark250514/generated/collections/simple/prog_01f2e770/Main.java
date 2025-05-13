import org.apache.commons.collections4.map.AbstractMapDecorator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create an instance of AbstractMapDecorator by wrapping a HashMap
        AbstractMapDecorator<String, Integer> map = new AbstractMapDecorator<>(new HashMap<>()) {};

        /* write */ map.put("key", 42);
        /* read */ int value = map.get("key");
        System.out.println(value);
    }
}