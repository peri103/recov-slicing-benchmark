import com.google.common.collect.LinkedHashBiMap;

public class BiMapHandler {
    private LinkedHashBiMap<String, Integer> biMap = LinkedHashBiMap.create();

    public void addEntry(String key, Integer value) {
        /* write */ biMap.put(key, value);
    }

    public Integer getEntry(String key) {
        return biMap.get(key);
    }
}
