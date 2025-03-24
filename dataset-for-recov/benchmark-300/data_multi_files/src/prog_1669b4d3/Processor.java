import java.util.SortedSet;

public class Processor {
    private DataManager dataManager;

    public Processor(DataManager dataManager) {
        this.dataManager = dataManager;
    }

    public void processData() {
        SortedSet<Integer> data = dataManager.getDataSet();
        /* read */ boolean containsValue = data.contains(10);
        System.out.println("Data contains 10: " + containsValue);
    }
}
