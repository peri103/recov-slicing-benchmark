import java.util.concurrent.ConcurrentHashMap;

public class DataWriter {
    private ConcurrentHashMap<String, Integer> map;

    public DataWriter(ConcurrentHashMap<String, Integer> map) {
        this.map = map;
    }

    public void writeData(String key, int value) {
        /* write */ map.put(key, value);
    }
}
