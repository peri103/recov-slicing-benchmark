import org.apache.commons.collections4.map.StaticBucketMap;

public class Main {
    public static void main(String[] args) {
        StaticBucketMap<String, Integer> map = new StaticBucketMap<>();
        /* write */ map.put("key", 42);
        /* read */ Integer value = map.get("key");
        System.out.println(value);
    }
}