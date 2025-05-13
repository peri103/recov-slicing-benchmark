import org.apache.commons.collections4.map.LRUMap;

public class Main {
    public static void main(String[] args) {
        LRUMap<String, String> lruMap = new LRUMap<>(10);
        /* write */ lruMap.put("key", "value");
        /* read */ String value = lruMap.get("key");
        System.out.println(value);
    }
}