import java.util.HashMap;
import java.util.Map;

public class DataStructures {
    private Map<String, Integer> data;

    public DataStructures() {
        data = new HashMap<>();
    }

    public void addData(String key, Integer value) {
        data.put(key, value);
    }

    public Integer getData(String key) {
        return data.get(key);
    }

    public Map<String, Integer> getAllData() {
        return data;
    }
}
