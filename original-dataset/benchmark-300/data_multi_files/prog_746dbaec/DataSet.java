import java.util.concurrent.CopyOnWriteArraySet;

public class DataSet {
    private CopyOnWriteArraySet<Integer> dataSet = new CopyOnWriteArraySet<>();

    public void addData(int value) {
        /* write */ dataSet.add(value);
    }

    public CopyOnWriteArraySet<Integer> getDataSet() {
        return dataSet;
    }
}
