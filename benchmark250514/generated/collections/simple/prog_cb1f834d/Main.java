import org.apache.commons.collections4.map.AbstractMapDecorator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> baseMap = new HashMap<>();
        AbstractMapDecorator<String, Integer> mapDecorator = new AbstractMapDecorator<String, Integer>(baseMap) {};
        
        /* write */ mapDecorator.put("key", 42);
        /* read */ Integer value = mapDecorator.get("key");
        
        System.out.println(value);
    }
}