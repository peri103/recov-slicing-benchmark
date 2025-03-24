import java.util.concurrent.ConcurrentHashMap;

public class DataReader {
    private ConcurrentHashMap<String, Integer> map;

    public DataReader(ConcurrentHashMap<String, Integer> map) {
        this.map = map;
    }

    public int readData(String key) {
        /* read */ return map.get(key);
    }
}
