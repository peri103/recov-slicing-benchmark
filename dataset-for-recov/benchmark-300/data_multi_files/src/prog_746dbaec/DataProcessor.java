import java.util.concurrent.CopyOnWriteArraySet;

public class DataProcessor {
    private DataStore dataStore;

    public DataProcessor(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    public void processData() {
        CopyOnWriteArraySet<Integer> dataSet = dataStore.getDataSet();
        /* read */ boolean containsValue = dataSet.contains(42);
        System.out.println("Data set contains 42: " + containsValue);
    }
}
