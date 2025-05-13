import org.apache.commons.collections4.map.PassiveExpiringMap;

public class DataStorage {
    private PassiveExpiringMap<String, String> map = new PassiveExpiringMap<>(1000); // Expiry time set to 1000 milliseconds

    public void storeData(String key, String value) {
        /* write */ map.put(key, value);
    }

    public String retrieveData(String key) {
        return map.get(key);
    }
}
