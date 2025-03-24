import java.util.concurrent.CopyOnWriteArrayList;

public class DataStorage {
    private CopyOnWriteArrayList<String> storage = new CopyOnWriteArrayList<>();

    public void storeData(String data) {
        /* write */ storage.add(data);
    }

    public String retrieveData(int index) {
        return storage.get(index);
    }
}
