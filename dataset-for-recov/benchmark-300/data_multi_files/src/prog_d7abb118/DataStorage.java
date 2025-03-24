import java.util.HashSet;

public class DataStorage {
    private HashSet<String> storage = new HashSet<>();

    public void storeData(String data) {
        /* write */ storage.add(data);
    }

    public boolean checkData(String data) {
        return storage.contains(data);
    }
}
