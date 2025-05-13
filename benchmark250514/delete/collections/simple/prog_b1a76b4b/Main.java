import org.apache.commons.collections4.map.AbstractOrderedMapDecorator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> baseMap = new HashMap<>();
        AbstractOrderedMapDecorator<String, Integer> decoratedMap = new AbstractOrderedMapDecorator<>(baseMap) {};
        
        /* write */ decoratedMap.put("key", 42);
        /* read */ int value = decoratedMap.get("key");
        
        System.out.println(value);
    }
}