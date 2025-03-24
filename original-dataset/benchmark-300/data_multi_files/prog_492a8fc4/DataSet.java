import java.util.concurrent.CopyOnWriteArraySet;

public class DataSet {
    private CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();

    public void addData(String data) {
        /* write */ set.add(data);
    }

    public boolean containsData(String data) {
        return set.contains(data);
    }
}
