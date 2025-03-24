import java.util.HashSet;

public class DataStorage {
    private HashSet<String> dataSet = new HashSet<>();

    public void addData(String data) {
        /* write */ dataSet.add(data);
    }

    public HashSet<String> getDataSet() {
        return dataSet;
    }
}
