import java.util.HashSet;

public class DataProcessor {
    private DataStorage storage;

    public DataProcessor(DataStorage storage) {
        this.storage = storage;
    }

    public void processData() {
        HashSet<Integer> dataSet = storage.getDataSet();
        /* read */ boolean containsValue = dataSet.contains(42);
        System.out.println("Data contains 42: " + containsValue);
    }
}
