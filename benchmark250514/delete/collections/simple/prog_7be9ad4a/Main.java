import org.apache.commons.collections4.map.AbstractOrderedMapDecorator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        AbstractOrderedMapDecorator<String, Integer> map = new AbstractOrderedMapDecorator<>(new HashMap<>());
        /* write */ map.put("key", 42);
        /* read */ Integer value = map.get("key");
        System.out.println(value);
    }
}