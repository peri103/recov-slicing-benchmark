import org.apache.commons.collections4.map.AbstractOrderedMapDecorator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> baseMap = new HashMap<>();
        AbstractOrderedMapDecorator<String, String> map = new AbstractOrderedMapDecorator<String, String>(baseMap) {};
        
        /* write */ map.put("key", "value");
        /* read */ String value = map.get("key");
        
        System.out.println(value);
    }
}