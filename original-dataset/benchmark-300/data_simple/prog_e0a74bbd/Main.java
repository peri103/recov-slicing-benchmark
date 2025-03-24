import java.util.concurrent.ConcurrentSkipListMap;

public class Main {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();
        /* write */ map.put("key", 42);
        /* read */ int value = map.get("key");
        System.out.println(value);
    }
}