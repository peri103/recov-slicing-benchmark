import org.apache.commons.collections4.map.AbstractIterableMap;
import java.util.HashMap;

public class DataStore {
    private AbstractIterableMap<String, Integer> map = new HashMap<>();

    public void putValue(String key, int value) {
        /* write */ map.put(key, value);
    }

    public int getValue(String key) {
        return map.get(key);
    }
}
