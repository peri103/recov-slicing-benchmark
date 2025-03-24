import java.util.TreeSet;

public class DataManager {
    private TreeSet<Integer> dataSet = new TreeSet<>();

    public void addData(int value) {
        /* write */ dataSet.add(value);
    }

    public TreeSet<Integer> getDataSet() {
        return dataSet;
    }
}
