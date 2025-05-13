import org.apache.commons.collections4.map.AbstractOrderedBidiMapDecorator;
import org.apache.commons.collections4.map.LinkedMap;

public class Main {
    public static void main(String[] args) {
        LinkedMap<String, Integer> baseMap = new LinkedMap<>();
        AbstractOrderedBidiMapDecorator<String, Integer> bidiMap = new AbstractOrderedBidiMapDecorator<>(baseMap);
        
        /* write */ bidiMap.put("key", 100);
        /* read */ int value = bidiMap.get("key");
        
        System.out.println(value);
    }
}