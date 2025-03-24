import java.util.HashSet;

public class DataStore {
    private HashSet<Integer> data = new HashSet<>();

    public void addData(int value) {
        /* write */ data.add(value);
    }

    public boolean containsData(int value) {
        return data.contains(value);
    }
}
