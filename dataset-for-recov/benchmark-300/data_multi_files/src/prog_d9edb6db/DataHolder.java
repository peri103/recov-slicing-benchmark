import java.util.concurrent.ConcurrentSkipListSet;

public class DataHolder {
    private ConcurrentSkipListSet<Integer> dataSet = new ConcurrentSkipListSet<>();

    public void addData(int value) {
        /* write */ dataSet.add(value);
    }

    public ConcurrentSkipListSet<Integer> getDataSet() {
        return dataSet;
    }
}
