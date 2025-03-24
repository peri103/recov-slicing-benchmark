import java.util.concurrent.CopyOnWriteArraySet;

public class DataStorage {
    private CopyOnWriteArraySet<String> dataSet = new CopyOnWriteArraySet<>();

    public void addData(String data) {
        /* write */ dataSet.add(data);
    }

    public boolean containsData(String data) {
        return dataSet.contains(data);
    }
}
