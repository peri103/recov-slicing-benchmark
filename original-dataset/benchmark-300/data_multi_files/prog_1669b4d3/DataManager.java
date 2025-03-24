import java.util.SortedSet;
import java.util.TreeSet;

public class DataManager {
    private SortedSet<Integer> dataSet = new TreeSet<>();

    public void addData(int value) {
        /* write */ dataSet.add(value);
    }

    public SortedSet<Integer> getDataSet() {
        return dataSet;
    }
}
