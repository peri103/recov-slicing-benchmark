import org.apache.commons.collections4.map.AbstractBidiMapDecorator;
import org.apache.commons.collections4.map.HashedBidiMap;

public class Main {
    public static void main(String[] args) {
        AbstractBidiMapDecorator<String, Integer> map = new AbstractBidiMapDecorator<>(new HashedBidiMap<>());
        /* write */ map.put("key1", 100);
        /* read */ int value = map.get("key1");
        System.out.println(value);
    }
}