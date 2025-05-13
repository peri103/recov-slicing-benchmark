import org.apache.commons.collections4.map.AbstractBidiMapDecorator;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.TreeBidiMap;

public class Main {
    public static void main(String[] args) {
        BidiMap<String, Integer> bidiMap = new TreeBidiMap<>();
        AbstractBidiMapDecorator<String, Integer> decoratedMap = new AbstractBidiMapDecorator<>(bidiMap) {};
        
        /* write */ decoratedMap.put("key", 42);
        /* read */ int value = decoratedMap.get("key");
        
        System.out.println(value);
    }
}