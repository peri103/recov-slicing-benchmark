import java.util.concurrent.ConcurrentSkipListSet;

public class DataManager {
    private ConcurrentSkipListSet<Integer> dataSet = new ConcurrentSkipListSet<>();

    public void addData(int value) {
        /* write */ dataSet.add(value);
    }

    public boolean containsData(int value) {
        return dataSet.contains(value);
    }
}
