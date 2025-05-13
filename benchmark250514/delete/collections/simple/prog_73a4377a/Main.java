import org.apache.commons.collections4.map.AbstractBidiMapDecorator;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;

public class Main {
    public static void main(String[] args) {
        AbstractBidiMapDecorator<String, Integer> bidiMap = new AbstractBidiMapDecorator<>(new DualHashBidiMap<>());
        /* write */ bidiMap.put("key", 42);
        /* read */ int value = bidiMap.get("key");
        System.out.println(value);
    }
}