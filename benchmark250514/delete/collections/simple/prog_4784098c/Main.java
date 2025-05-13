import org.apache.commons.collections4.map.AbstractBidiMapDecorator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        AbstractBidiMapDecorator<String, Integer> bidiMap = new AbstractBidiMapDecorator<>(map) {};

        /* write */ bidiMap.put("key", 123);

        /* read */ Integer value = bidiMap.get("key");
        System.out.println(value);
    }
}