import java.util.concurrent.ConcurrentSkipListSet;

public class DataWriter {
    private ConcurrentSkipListSet<Integer> set;

    public DataWriter(ConcurrentSkipListSet<Integer> set) {
        this.set = set;
    }

    public void writeData(int value) {
        /* write */ set.add(value);
    }
}
