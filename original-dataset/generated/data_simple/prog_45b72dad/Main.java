import java.util.concurrent.ConcurrentSkipListMap;

public class Main {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();
        /* write */ map.put("key", 100);
        /* read */ Integer value = map.get("key");
        System.out.println(value);
    }
}