import java.util.TreeMap;

public class TreeMapWriter {
    private TreeMap<Integer, String> map = new TreeMap<>();

    public void writeValue(int key, String value) {
        /* write */ map.put(key, value);
    }

    public TreeMap<Integer, String> getMap() {
        return map;
    }
}
