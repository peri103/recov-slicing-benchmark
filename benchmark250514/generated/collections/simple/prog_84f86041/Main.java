import org.apache.commons.collections4.map.LRUMap;

public class Main {
    public static void main(String[] args) {
        LRUMap<String, Integer> lruMap = new LRUMap<>(10);
        /* write */ lruMap.put("key", 42);
        /* read */ int value = lruMap.get("key");
        System.out.println(value);
    }
}