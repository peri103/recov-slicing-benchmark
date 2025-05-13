import org.apache.commons.collections4.map.LRUMap;

public class Main {
    public static void main(String[] args) {
        LRUMap<String, Integer> lruMap = new LRUMap<>();

        /* write */ lruMap.put("key", 100);

        /* read */ Integer value = lruMap.get("key");

        System.out.println(value);
    }
}