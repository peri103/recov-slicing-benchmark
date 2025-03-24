import java.util.concurrent.ConcurrentSkipListSet;

public class Processor {
    private DataManager dataManager;

    public Processor(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    public void processData() {
        ConcurrentSkipListSet<Integer> dataSet = dataManager.getDataSet();
        /* read */ boolean containsValue = dataSet.contains(42);
        System.out.println("Does the dataset contain 42? " + containsValue);
    }
}
