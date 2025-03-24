import java.util.Hashtable;

public class DataStore {
    private Hashtable<String, Integer> hashtable = new Hashtable<>();

    public void storeValue(String key, int value) {
        /* write */ hashtable.put(key, value);
    }

    public int retrieveValue(String key) {
        return hashtable.get(key);
    }
}
