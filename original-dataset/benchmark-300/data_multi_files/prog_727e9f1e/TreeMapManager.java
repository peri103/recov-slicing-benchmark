import java.util.TreeMap;

public class TreeMapManager {
    private TreeMap<Integer, String> map = new TreeMap<>();

    public void addEntry(int key, String value) {
        /* write */ map.put(key, value);
    }

    public String getEntry(int key) {
        return map.get(key);
    }
}
