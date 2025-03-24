import java.util.concurrent.CopyOnWriteArraySet;

public class DataStore {
    private CopyOnWriteArraySet<Integer> dataSet = new CopyOnWriteArraySet<>();

    public void addData(int value) {
        /* write */ dataSet.add(value);
    }

    public boolean containsData(int value) {
        return dataSet.contains(value);
    }
}
