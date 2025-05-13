import org.apache.commons.collections4.map.AbstractHashedMap;
import org.apache.commons.collections4.map.HashedMap;

public class Main {
    public static void main(String[] args) {
        AbstractHashedMap<Integer, String> map = new HashedMap<>();
        /* write */ map.put(1, "Hello, World!");
        /* read */ String value = map.get(1);
        System.out.println(value);
    }
}