import org.apache.commons.collections4.map.AbstractMapDecorator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Since AbstractMapDecorator is an abstract class, we use a concrete subclass HashMap
        AbstractMapDecorator<String, Integer> map = new AbstractMapDecorator<>(new HashMap<>()) {};
        
        /* write */ map.put("key", 100);
        /* read */ int value = map.get("key");
        
        System.out.println(value);
    }
}