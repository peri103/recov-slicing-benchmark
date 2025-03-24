import java.util.HashSet;

public class DataStorage {
    private HashSet<Integer> dataSet = new HashSet<>();

    public void storeData(int value) {
        /* write */ dataSet.add(value);
    }

    public HashSet<Integer> getDataSet() {
        return dataSet;
    }
}
