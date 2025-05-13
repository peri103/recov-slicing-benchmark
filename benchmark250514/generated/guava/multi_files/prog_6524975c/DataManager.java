import java.util.HashMap;
import java.util.Map;

public class DataManager {
    private Map<String, String> stringMap = new HashMap<>();
    private CustomMap<String, Integer> integerMap = new CustomMap<>();

    public void addStringEntry(String key, String value) {
        stringMap.put(key, value);
    }

    public void addIntegerEntry(String key, Integer value) {
        integerMap.addEntry(key, value);
    }

    public String getStringEntry(String key) {
        return stringMap.get(key);
    }

    public Integer getIntegerEntry(String key) {
        /* read */ return integerMap.get(key);
    }
}
