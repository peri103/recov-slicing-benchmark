import java.util.concurrent.ConcurrentSkipListSet;

public class DataStorage {
    private ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();

    public void addValue(int value) {
        /* write */ set.add(value);
    }

    public boolean containsValue(int value) {
        return set.contains(value);
    }
}
