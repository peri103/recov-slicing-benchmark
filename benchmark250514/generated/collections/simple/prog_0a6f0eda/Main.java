import org.apache.commons.collections4.map.PassiveExpiringMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the PassiveExpiringMap with a default expiration time of 1000 milliseconds
        PassiveExpiringMap<Integer, String> map = new PassiveExpiringMap<>(1000);

        /* write */ map.put(1, "Hello, World!");

        /* read */ String value = map.get(1);

        System.out.println(value);
    }
}