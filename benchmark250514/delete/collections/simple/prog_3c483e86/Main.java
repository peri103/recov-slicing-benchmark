import org.apache.commons.collections4.map.AbstractOrderedBidiMapDecorator;
import org.apache.commons.collections4.map.TreeBidiMap;

public class Main {
    public static void main(String[] args) {
        AbstractOrderedBidiMapDecorator<String, Integer> map = new AbstractOrderedBidiMapDecorator<>(new TreeBidiMap<>());
        /* write */ map.put("key1", 100);
        /* read */ Integer value = map.get("key1");
        System.out.println(value);
    }
}