import org.apache.commons.collections4.map.AbstractOrderedBidiMapDecorator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> baseMap = new HashMap<>();
        AbstractOrderedBidiMapDecorator<String, Integer> bidiMap = new AbstractOrderedBidiMapDecorator<>(baseMap);
        
        /* write */ bidiMap.put("key1", 100);
        /* read */ Integer value = bidiMap.get("key1");
        
        System.out.println(value);
    }
}