import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        /* write */ map.put("key", 42);
        /* read */ int value = map.get("key");
        System.out.println(value);
    }
}