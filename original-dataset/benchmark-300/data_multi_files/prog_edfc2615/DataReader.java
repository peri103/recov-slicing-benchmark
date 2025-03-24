import java.util.SortedMap;

public class DataReader {
    private SortedMap<Integer, String> map;

    public DataReader(SortedMap<Integer, String> map) {
        this.map = map;
    }

    public String readData(int key) {
        /* read */ return map.get(key);
    }
}
