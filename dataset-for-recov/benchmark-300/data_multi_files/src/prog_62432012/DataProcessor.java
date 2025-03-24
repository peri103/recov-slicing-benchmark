import java.util.SortedSet;

public class DataProcessor {
    private DataStorage storage;

    public DataProcessor(DataStorage storage) {
        this.storage = storage;
    }

    public void processData() {
        SortedSet<Integer> data = storage.getDataSet();
        /* read */ boolean containsValue = data.contains(42);
        System.out.println("Data contains 42: " + containsValue);
    }
}
