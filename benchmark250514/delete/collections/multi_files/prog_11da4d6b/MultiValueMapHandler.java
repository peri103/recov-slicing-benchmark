import org.apache.commons.collections4.map.MultiValueMap;

public class MultiValueMapHandler {
    private MultiValueMap<String, Integer> map = new MultiValueMap<>();

    public void writeValue(String key, Integer value) {
        /* write */ map.put(key, value);
    }

    public MultiValueMap<String, Integer> getMap() {
        return map;
    }
}