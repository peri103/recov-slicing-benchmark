import org.apache.commons.collections4.map.LazyMap;
import java.util.HashMap;

public class LazyMapWrapper {
    private LazyMap<String, Integer> lazyMap;

    public LazyMapWrapper() {
        HashMap<String, Integer> baseMap = new HashMap<>();
        lazyMap = LazyMap.lazyMap(baseMap, key -> 0);
    }

    public void putValue(String key, int value) {
        /* write */ lazyMap.put(key, value);
    }

    public int getValue(String key) {
        return lazyMap.get(key);
    }
}