import org.apache.commons.collections4.map.MultiValueMap;

public class MultiValueContainer {
    private MultiValueMap<String, String> multiValueMap = new MultiValueMap<>();

    public void addEntry(String key, String value) {
        /* write */ multiValueMap.put(key, value);
    }

    public Object getEntry(String key) {
        return multiValueMap.get(key);
    }
}
