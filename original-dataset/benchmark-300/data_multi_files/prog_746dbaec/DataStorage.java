import java.util.concurrent.CopyOnWriteArraySet;

public class DataStorage {
    private CopyOnWriteArraySet<Integer> dataSet = new CopyOnWriteArraySet<>();

    public void storeData(int value) {
        /* write */ dataSet.add(value);
    }

    public boolean containsData(int value) {
        return dataSet.contains(value);
    }
}
