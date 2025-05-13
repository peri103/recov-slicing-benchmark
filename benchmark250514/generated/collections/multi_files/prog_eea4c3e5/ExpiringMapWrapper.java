import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.concurrent.TimeUnit;

public class ExpiringMapWrapper<K, V> {
    private PassiveExpiringMap<K, V> map;

    public ExpiringMapWrapper(long expirationTime, TimeUnit timeUnit) {
        this.map = new PassiveExpiringMap<>(new PassiveExpiringMap.ConstantTimeToLiveExpirationPolicy<>(expirationTime, timeUnit));
    }

    public void putValue(K key, V value) {
        /* write */ map.put(key, value);
    }

    public V getValue(K key) {
        return map.get(key);
    }
}