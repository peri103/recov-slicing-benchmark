import java.util.TreeSet;

public class DataStorage {
    private TreeSet<Integer> dataSet = new TreeSet<>();

    public void addData(int value) {
        /* write */ dataSet.add(value);
    }

    public boolean containsData(int value) {
        return dataSet.contains(value);
    }
}
