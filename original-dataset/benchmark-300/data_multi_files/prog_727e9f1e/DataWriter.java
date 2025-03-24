import java.util.TreeMap;

public class DataWriter {
    private TreeMap<Integer, String> map = new TreeMap<>();

    public void writeData() {
        /* write */ map.put(1, "Hello");
    }

    public TreeMap<Integer, String> getMap() {
        return map;
    }
}
