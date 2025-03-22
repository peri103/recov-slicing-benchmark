import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        /* write */ map.putIfAbsent("key", "value");
        /* read */ String value = map.get("key");
        System.out.println(value);
    }
}