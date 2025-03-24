import java.util.HashSet;

public class DataManager {
    private HashSet<Integer> dataSet = new HashSet<>();

    public void addData(int value) {
        /* write */ dataSet.add(value);
    }

    public boolean containsData(int value) {
        return dataSet.contains(value);
    }
}
