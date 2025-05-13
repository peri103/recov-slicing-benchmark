import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.concurrent.TimeUnit;

public class ExpiringMap {
    private PassiveExpiringMap<String, String> map;

    public ExpiringMap(long duration, TimeUnit timeUnit) {
        map = new PassiveExpiringMap<>(duration, timeUnit);
    }

    public void putValue(String key, String value) {
        /* write */ map.put(key, value);
    }

    public String getValue(String key) {
        return map.get(key);
    }
}