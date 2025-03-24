import java.util.TreeMap;

public class TreeMapWrapper {
    private TreeMap<Integer, String> map = new TreeMap<>();

    public void putValue(int key, String value) {
        /* write */ map.put(key, value);
    }

    public String getValue(int key) {
        return map.get(key);
    }
}
