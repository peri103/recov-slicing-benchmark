import java.util.concurrent.ConcurrentSkipListSet;

public class DataManager {
    private ConcurrentSkipListSet<String> dataSet = new ConcurrentSkipListSet<>();

    public void addData(String data) {
        /* write */ dataSet.add(data);
    }

    public boolean containsData(String data) {
        return dataSet.contains(data);
    }
}
