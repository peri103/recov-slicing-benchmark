import java.util.concurrent.CopyOnWriteArraySet;

public class DataStorage {
    private CopyOnWriteArraySet<String> dataSet = new CopyOnWriteArraySet<>();

    public void storeData(String data) {
        /* write */ dataSet.add(data);
    }

    public boolean checkData(String data) {
        return dataSet.contains(data);
    }
}
