import org.apache.commons.collections4.map.FixedSizeMap;
import java.util.HashMap;

public class FixedSizeMapWrapper {
    private FixedSizeMap<String, Integer> fixedSizeMap;

    public FixedSizeMapWrapper() {
        HashMap<String, Integer> baseMap = new HashMap<>();
        baseMap.put("key", 0);
        this.fixedSizeMap = FixedSizeMap.fixedSizeMap(baseMap);
    }

    public void writeValue(String key, int value) {
        /* write */ fixedSizeMap.put(key, value);
    }

    public int readValue(String key) {
        return fixedSizeMap.get(key);
    }
}