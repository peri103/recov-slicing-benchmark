import java.util.TreeMap;

public class DataReader {
    private TreeMap<Integer, String> map;

    public DataReader(TreeMap<Integer, String> map) {
        this.map = map;
    }

    public String readData() {
        /* read */ return map.get(1);
    }
}
