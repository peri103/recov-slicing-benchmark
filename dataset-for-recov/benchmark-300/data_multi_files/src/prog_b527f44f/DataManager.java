import java.util.concurrent.CopyOnWriteArraySet;

public class DataManager {
    private CopyOnWriteArraySet dataSet = new CopyOnWriteArraySet();

    public void addData(int value) {
        /* write */ dataSet.add(value);
    }

    public CopyOnWriteArraySet getDataSet() {
        return dataSet;
    }
}
