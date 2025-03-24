import java.util.SortedMap;
import java.util.TreeMap;

public class DataWriter {
    private SortedMap<Integer, String> map = new TreeMap<>();

    public void writeData(int key, String value) {
        /* write */ map.put(key, value);
    }

    public SortedMap<Integer, String> getMap() {
        return map;
    }
}
