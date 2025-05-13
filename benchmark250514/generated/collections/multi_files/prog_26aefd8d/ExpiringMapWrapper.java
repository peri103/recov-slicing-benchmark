import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.concurrent.TimeUnit;

public class ExpiringMapWrapper {
    private PassiveExpiringMap<String, String> map;

    public ExpiringMapWrapper() {
        PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<String, String> expirationPolicy = 
            new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<>(5, TimeUnit.SECONDS);
        map = new PassiveExpiringMap<>(expirationPolicy);
    }

    public void putValue(String key, String value) {
        /* write */ map.put(key, value);
    }

    public String getValue(String key) {
        return map.get(key);
    }
}