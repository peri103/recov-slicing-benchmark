import com.google.common.collect.ForwardingMap;
import java.util.HashMap;
import java.util.Map;

public class CustomMap extends ForwardingMap<String, Integer> {
    private Map<String, Integer> baseMap = new HashMap<>();

    @Override
    protected Map<String, Integer> delegate() {
        return baseMap;
    }

    public void putValue(String key, Integer value) {
        /* write */ put(key, value);
    }

    public Integer getValue(String key) {
        return get(key);
    }
}
