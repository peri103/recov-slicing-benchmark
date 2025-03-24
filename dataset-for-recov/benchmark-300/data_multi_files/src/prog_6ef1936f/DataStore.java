import java.util.HashSet;

public class DataStore {
    private HashSet<String> data = new HashSet<>();

    public void addData(String value) {
        /* write */ data.add(value);
    }

    public HashSet<String> getData() {
        return data;
    }
}
