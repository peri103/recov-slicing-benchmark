import java.util.Hashtable;

public class DataManager {
    private Hashtable<String, Integer> dataTable = new Hashtable<>();

    public void storeData(String key, int value) {
        /* write */ dataTable.put(key, value);
    }

    public Hashtable<String, Integer> getDataTable() {
        return dataTable;
    }
}
