import java.util.Hashtable;

public class DataStorage {
    private Hashtable<String, Integer> table = new Hashtable<>();

    public void storeData(String key, int value) {
        /* write */ table.put(key, value);
    }

    public int retrieveData(String key) {
        return table.get(key);
    }
}
