import com.google.common.collect.ListMultimap;
import com.google.common.collect.ArrayListMultimap;

public class DataManager {
    private ListMultimap<String, Integer> multimap;

    public DataManager() {
        multimap = ArrayListMultimap.create();
    }

    public void addData(String key, Integer value) {
        /* write */ multimap.put(key, value);
    }

    public ListMultimap<String, Integer> getMultimap() {
        return multimap;
    }
}
