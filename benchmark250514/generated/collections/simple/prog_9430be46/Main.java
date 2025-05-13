import org.apache.commons.collections4.map.LRUMap;

public class Main {
    public static void main(String[] args) {
        LRUMap<String, Integer> map = new LRUMap<>();
        /* write */ map.put("key", 42);
        /* read */ Integer value = map.get("key");
        System.out.println(value);
    }
}