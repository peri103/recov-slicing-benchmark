import java.util.HashSet;

public class DataStorage {
    private HashSet<String> storage = new HashSet<>();

    public void storeData(String data) {
        /* write */ storage.add(data);
    }

    public boolean containsData(String data) {
        return storage.contains(data);
    }
}
