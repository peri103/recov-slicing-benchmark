import java.util.concurrent.ConcurrentSkipListSet;

public class DataStore {
    private ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();

    public void addValue(String value) {
        /* write */ set.add(value);
    }

    public boolean containsValue(String value) {
        return set.contains(value);
    }

    public ConcurrentSkipListSet<String> getSet() {
        return set;
    }
}
