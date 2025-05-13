import com.google.common.collect.Multimap;
import com.google.common.collect.ArrayListMultimap;
import java.util.HashMap;
import java.util.Map;

public class DataStructures {
    private Multimap<String, String> regularMultimap = ArrayListMultimap.create();
    private Map<String, Integer> map = new HashMap<>();

    public void addToMultimap(String key, String value) {
        regularMultimap.put(key, value);
    }

    public Multimap<String, String> getRegularMultimap() {
        return regularMultimap;
    }

    public void addToMap(String key, Integer value) {
        map.put(key, value);
    }

    public Map<String, Integer> getMap() {
        return map;
    }
}
