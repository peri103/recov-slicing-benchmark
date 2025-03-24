import java.util.HashSet;

public class DataManager {
    private HashSet<String> dataSet = new HashSet<>();

    public void addData(String data) {
        /* write */ dataSet.add(data);
    }

    public boolean containsData(String data) {
        return dataSet.contains(data);
    }
}
