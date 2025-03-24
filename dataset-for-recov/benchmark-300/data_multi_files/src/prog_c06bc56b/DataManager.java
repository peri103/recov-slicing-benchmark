import java.util.concurrent.CopyOnWriteArraySet;

public class DataManager {
    private CopyOnWriteArraySet<Integer> dataSet = new CopyOnWriteArraySet<>();

    public void addData(int data) {
        /* write */ dataSet.add(data);
    }

    public boolean containsData(int data) {
        return dataSet.contains(data);
    }

    public CopyOnWriteArraySet<Integer> getDataSet() {
        return dataSet;
    }
}
