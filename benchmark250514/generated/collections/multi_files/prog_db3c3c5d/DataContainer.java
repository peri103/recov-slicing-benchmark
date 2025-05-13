import org.apache.commons.collections4.map.AbstractReferenceMap;
import org.apache.commons.collections4.map.ReferenceMap;

public class DataContainer {
    private AbstractReferenceMap<String, Integer> map;

    public DataContainer() {
        map = new ReferenceMap<>(AbstractReferenceMap.ReferenceStrength.HARD, AbstractReferenceMap.ReferenceStrength.HARD);
    }

    public void writeData(String key, Integer value) {
        /* write */ map.put(key, value);
    }

    public Integer readData(String key) {
        return map.get(key);
    }
}
