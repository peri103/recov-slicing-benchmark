import java.util.Hashtable;

public class DataStorage {
    private Hashtable<String, Integer> table = new Hashtable<>();

    public void storeValue(String key, int value) {
        /* write */ table.put(key, value);
    }

    public Integer retrieveValue(String key) {
        return table.get(key);
    }
}
