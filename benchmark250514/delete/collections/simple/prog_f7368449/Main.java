import org.apache.commons.collections4.map.AbstractOrderedMapDecorator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a HashMap and wrap it with AbstractOrderedMapDecorator
        HashMap<String, Integer> hashMap = new HashMap<>();
        AbstractOrderedMapDecorator<String, Integer> mapDecorator = new AbstractOrderedMapDecorator<>(hashMap) {};

        /* write */ mapDecorator.put("key1", 100);
        /* read */ Integer value = mapDecorator.get("key1");
        
        System.out.println(value);
    }
}