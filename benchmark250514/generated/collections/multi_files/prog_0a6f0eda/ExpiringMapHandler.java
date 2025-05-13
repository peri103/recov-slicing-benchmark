import org.apache.commons.collections4.map.PassiveExpiringMap;

public class ExpiringMapHandler {
    private PassiveExpiringMap<Integer, String> map;

    public ExpiringMapHandler(long expirationTime) {
        map = new PassiveExpiringMap<>(expirationTime);
    }

    public void addEntry(int key, String value) {
        /* write */ map.put(key, value);
    }

    public String getEntry(int key) {
        return map.get(key);
    }
}
