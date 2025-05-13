import org.apache.commons.collections4.map.AbstractMapDecorator;
import org.apache.commons.collections4.map.HashedMap;

public class MapOperations {
    private AbstractMapDecorator<String, Integer> map;

    public MapOperations() {
        this.map = new HashedMap<>();
    }

    public void addValue(String key, Integer value) {
        /* write */ map.put(key, value);
    }

    public Integer getValue(String key) {
        return map.get(key);
    }
}
