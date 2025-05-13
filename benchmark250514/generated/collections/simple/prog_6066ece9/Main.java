import org.apache.commons.collections4.map.StaticBucketMap;

public class Main {
    public static void main(String[] args) {
        StaticBucketMap map = new StaticBucketMap();
        /* write */ map.put("key", "value");
        /* read */ String value = (String) map.get("key");
        System.out.println(value);
    }
}