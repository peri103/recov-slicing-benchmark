import org.apache.commons.collections4.map.AbstractHashedMap;
import org.apache.commons.collections4.map.HashedMap;

public class Main {
    public static void main(String[] args) {
        AbstractHashedMap<String, Integer> map = new HashedMap<>();
        /* write */ map.put("key", 42);
        /* read */ Integer value = map.get("key");
        System.out.println(value);
    }
}