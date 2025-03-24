import java.util.Hashtable;

public class DataStore {
    private Hashtable<String, Integer> hashtable = new Hashtable<>();

    public void storeData(String key, int value) {
        /* write */ hashtable.put(key, value);
    }

    public Integer retrieveData(String key) {
        return hashtable.get(key);
    }
}
