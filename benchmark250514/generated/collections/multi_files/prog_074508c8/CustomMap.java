import org.apache.commons.collections4.multimap.HashSetValuedHashMap;

public class CustomMap {
    private HashSetValuedHashMap<String, Integer> map = new HashSetValuedHashMap<>();

    public void addValue(String key, int value) {
        /* write */ map.put(key, value);
    }

    public HashSetValuedHashMap<String, Integer> getMap() {
        return map;
    }
}
