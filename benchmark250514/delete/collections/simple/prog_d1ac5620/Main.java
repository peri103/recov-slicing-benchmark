import org.apache.commons.collections4.map.AbstractSortedMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        AbstractSortedMap<String, Integer> map = new TreeMap<>();
        /* write */ map.put("key", 42);
        /* read */ int value = map.get("key");
        System.out.println(value);
    }
}