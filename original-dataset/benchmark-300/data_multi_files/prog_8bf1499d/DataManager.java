import java.util.concurrent.CopyOnWriteArraySet;

public class DataManager {
    private CopyOnWriteArraySet<String> dataSet = new CopyOnWriteArraySet<>();

    public void addData(String data) {
        /* write */ dataSet.add(data);
    }

    public boolean containsData(String data) {
        return dataSet.contains(data);
    }

    public CopyOnWriteArraySet<String> getDataSet() {
        return dataSet;
    }
}
