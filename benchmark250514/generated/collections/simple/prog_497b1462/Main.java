import org.apache.commons.collections4.map.AbstractMapDecorator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        AbstractMapDecorator<String, Integer> map = new AbstractMapDecorator<String, Integer>(new HashMap<String, Integer>()) {};
        /* write */ map.put("key", 42);
        /* read */ int value = map.get("key");
        System.out.println(value);
    }
}