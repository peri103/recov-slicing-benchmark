import java.util.concurrent.ConcurrentSkipListSet;

public class DataReader {
    private ConcurrentSkipListSet<Integer> set;

    public DataReader(ConcurrentSkipListSet<Integer> set) {
        this.set = set;
    }

    public boolean readData(int value) {
        /* read */ return set.contains(value);
    }
}
