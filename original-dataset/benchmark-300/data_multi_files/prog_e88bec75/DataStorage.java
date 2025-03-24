import java.util.Hashtable;

public class DataStorage {
    private Hashtable<String, Integer> storage = new Hashtable<>();

    public void storeData(String key, int value) {
        /* write */ storage.put(key, value);
    }

    public int retrieveData(String key) {
        return storage.get(key);
    }
}
