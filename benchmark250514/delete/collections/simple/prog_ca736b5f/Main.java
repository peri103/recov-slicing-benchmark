import org.apache.commons.collections4.map.AbstractBidiMapDecorator;
import org.apache.commons.collections4.bidimap.TreeBidiMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the AbstractBidiMapDecorator with a TreeBidiMap
        AbstractBidiMapDecorator<String, Integer> bidiMap = new AbstractBidiMapDecorator<>(new TreeBidiMap<>());
        
        /* write */ bidiMap.put("key1", 100);
        
        /* read */ Integer value = bidiMap.get("key1");
        
        System.out.println(value);
    }
}