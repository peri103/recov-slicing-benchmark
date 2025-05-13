import org.apache.commons.collections4.map.PassiveExpiringMap;

public class Main {
    public static void main(String[] args) {
        PassiveExpiringMap<String, String> map = new PassiveExpiringMap<>(1000); // Expiry time set to 1000 milliseconds
        /* write */ map.put("key", "value");
        /* read */ String value = map.get("key");
        System.out.println(value);
    }
}