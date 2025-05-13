import org.apache.commons.collections4.map.AbstractOrderedBidiMapDecorator;
import org.apache.commons.collections4.map.TreeBidiMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a TreeBidiMap which is a concrete class of AbstractOrderedBidiMapDecorator
        AbstractOrderedBidiMapDecorator<String, Integer> map = new TreeBidiMap<>();

        /* write */ map.put("key", 123);

        /* read */ Integer value = map.get("key");
        System.out.println(value);
    }
}