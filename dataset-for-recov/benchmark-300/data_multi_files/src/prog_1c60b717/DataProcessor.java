import java.util.SortedMap;

public class DataProcessor {
    private DataStore dataStore;

    public DataProcessor(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    public int processData(String key) {
        SortedMap<String, Integer> map = dataStore.getMap();
        /* read */ Integer value = map.get(key);
        return value != null ? value : -1;
    }
}
