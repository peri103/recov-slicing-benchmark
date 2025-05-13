import org.apache.commons.collections4.map.AbstractOrderedBidiMapDecorator;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.TreeBidiMap;

public class Main {
    public static void main(String[] args) {
        BidiMap<String, Integer> bidiMap = new TreeBidiMap<>();
        AbstractOrderedBidiMapDecorator<String, Integer> mapDecorator = new AbstractOrderedBidiMapDecorator<>(bidiMap);
        
        /* write */ mapDecorator.put("key", 42);
        /* read */ int value = mapDecorator.get("key");
        
        System.out.println(value);
    }
}