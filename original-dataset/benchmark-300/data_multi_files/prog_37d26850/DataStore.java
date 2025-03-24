import java.util.Hashtable;

public class DataStore {
    private Hashtable<String, Integer> table = new Hashtable<>();

    public void storeData(String key, int value) {
        /* write */ table.put(key, value);
    }

    public Integer retrieveData(String key) {
        return table.get(key);
    }
}
