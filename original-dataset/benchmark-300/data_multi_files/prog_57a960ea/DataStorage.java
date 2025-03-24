import java.util.LinkedList;

public class DataStorage {
    private LinkedList<String> storage = new LinkedList<>();

    public void storeData(String data) {
        /* write */ storage.addLast(data);
    }

    public String retrieveData() {
        return storage.getLast();
    }
}
