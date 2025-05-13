import org.apache.commons.collections4.map.AbstractOrderedMapDecorator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of AbstractOrderedMapDecorator using a HashMap
        AbstractOrderedMapDecorator<String, Integer> map = new AbstractOrderedMapDecorator<>(new HashMap<String, Integer>());

        /* write */ map.put("key", 100);
        /* read */ int value = map.get("key");
        
        System.out.println(value);
    }
}