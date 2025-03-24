import java.util.concurrent.ConcurrentSkipListSet;

public class DataStore {
    private ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();

    public void addData(String data) {
        /* write */ set.add(data);
    }

    public boolean containsData(String data) {
        return set.contains(data);
    }
}
