import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        SortedMap<String, Integer> map = new TreeMap<>();
        /* write */ map.put("key", 42);
        /* read */ Integer value = map.get("key");
        System.out.println(value);
    }
}