import java.util.concurrent.CopyOnWriteArraySet;

public class DataStorage {
    private CopyOnWriteArraySet<String> storage = new CopyOnWriteArraySet<>();

    public void storeData(String data) {
        /* write */ storage.add(data);
    }

    public boolean containsData(String data) {
        return storage.contains(data);
    }
}
