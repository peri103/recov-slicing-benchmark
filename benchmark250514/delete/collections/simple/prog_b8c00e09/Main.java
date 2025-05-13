import org.apache.commons.collections4.map.AbstractMapDecorator;
import org.apache.commons.collections4.map.HashedMap;

public class Main {
    public static void main(String[] args) {
        AbstractMapDecorator<String, Integer> map = new HashedMap<>();
        /* write */ map.put("key", 42);
        /* read */ int value = map.get("key");
        System.out.println(value);
    }
}