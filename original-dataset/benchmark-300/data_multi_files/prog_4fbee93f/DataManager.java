import java.util.concurrent.CopyOnWriteArraySet;

public class DataManager {
    private CopyOnWriteArraySet<String> dataSet = new CopyOnWriteArraySet<>();

    public void addData(String value) {
        /* write */ dataSet.add(value);
    }

    public boolean containsData(String value) {
        return dataSet.contains(value);
    }
}
