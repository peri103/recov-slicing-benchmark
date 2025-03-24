import java.util.HashSet;

public class DataStorage {
    private HashSet<String> dataSet = new HashSet<>();

    public void storeData(String data) {
        /* write */ dataSet.add(data);
    }

    public HashSet<String> getDataSet() {
        return dataSet;
    }
}
